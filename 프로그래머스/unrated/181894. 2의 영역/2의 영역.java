import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 2) list.add(i);
        }

        if (!list.isEmpty()) {

            int startNum = list.get(0);
            int endNum = list.get(list.size() - 1);

            int[] answer = new int[endNum - startNum + 1];

            for (int i = 0; i < answer.length; i++) {
                answer[i] = arr[startNum++];
            }

            return answer;
        } else {
            int[] answer = new int[1];
            answer[0] = -1;
            return answer;
        }
    }
}