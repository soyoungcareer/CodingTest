import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        List<Integer> list = new ArrayList<>();

        for (String i : intStrs) {
            int num = Integer.parseInt(i.substring(s, s + l));
            if (num > k ) list.add(num);
        }
        
        // stream으로 처리
        int[] answer = list.stream().mapToInt(Integer::intValue).toArray();

        /* (기존 풀이) - 반복문으로 list를 배열에 담음.
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        */

        return answer;
    }
}