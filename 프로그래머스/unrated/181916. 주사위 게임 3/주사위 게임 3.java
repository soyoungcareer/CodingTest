import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Solution {
    public int solution(int a, int b, int c, int d) {
        int answer = 0;
        int pKey = 0;
        int qKey = 0;

        Stream<Integer> stream = Stream.of(a, b, c, d);

        Map<Integer, Integer> map = stream.collect(
            Collectors.toMap(Function.identity(), valueMapper -> 1, Integer::sum)
        );

        // 1. 네 개 모두 같을 때
        if (map.size() == 1) {
            answer = 1111*a;
        } 
        // 2. 세 개가 같고 하나 다를 때
        else if (map.containsValue(3)) {
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                if (entry.getValue().equals(3)) {
                    pKey = entry.getKey();
                }
                if (entry.getValue().equals(1)) {
                    qKey = entry.getKey();
                }
            }
            
            answer = (int) Math.pow((10*pKey + qKey), 2);
        }
        // 3. 두 개씩 같을 때
        else if (map.containsValue(2) && !map.containsValue(1)) {
            List<Integer> keyList = new ArrayList<Integer>();

            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                keyList.add(entry.getKey());
            }
            
            pKey = keyList.get(0).intValue();
            qKey = keyList.get(1).intValue();

            answer = (pKey + qKey) * Math.abs(pKey - qKey);
        }
        // 4. 두 개는 같고 나머지는 서로 다를 때
        else if (map.containsValue(2) && map.containsValue(1)) {
            List<Integer> keyList = new ArrayList<Integer>();

            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                if (entry.getValue().equals(1)) {
                    keyList.add(entry.getKey());
                }
            }

            pKey = keyList.get(0).intValue();
            qKey = keyList.get(1).intValue();

            answer = pKey * qKey;
        } 
        // 5. 네 개 모두 다를 때
        else {
            ArrayList<Integer> list = new ArrayList<Integer>();
            list.add(a);
            list.add(b);
            list.add(c);
            list.add(d);

            answer = Collections.min(list);
        }

        return answer;
    }
}