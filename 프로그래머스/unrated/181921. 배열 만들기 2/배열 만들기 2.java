import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public int[] solution(int l, int r) {
        int[] answer = new int[1];
        String pattern = "^[05]*$";

        List<Integer> list = new ArrayList<>();

        for (int i = l; i < r + 1; i++) {
            String str = String.valueOf(i);
            if (str.matches(pattern)) list.add(Integer.parseInt(str));
        }

        int[] temp = new int[list.size()];
        
        if (!list.isEmpty()) {
            Collections.sort(list);
            
            for (int i = 0; i < list.size(); i++) {
                temp[i] = list.get(i);
            }
        } else {
            answer[0] = -1;
        }

        return answer[0] != -1 ? temp : answer;
    }
}