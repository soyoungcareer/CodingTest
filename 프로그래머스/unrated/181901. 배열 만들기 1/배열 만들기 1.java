import java.util.ArrayList;

class Solution {
    public int[] solution(int n, int k) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            if (i % k == 0) list.add(i);
        }

        int[] answer = list.stream().mapToInt(i -> i).toArray();

        return answer;
    }
}