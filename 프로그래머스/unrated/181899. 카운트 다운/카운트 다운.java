import java.util.ArrayList;

class Solution {
    public int[] solution(int start, int end_num) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = start; i >= end_num; i--) {
            System.out.println(i);
            list.add(i);
        }

        int[] answer = list.stream().mapToInt(i -> i).toArray();

        return answer;
    }
}