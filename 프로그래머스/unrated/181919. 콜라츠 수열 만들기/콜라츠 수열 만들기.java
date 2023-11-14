import java.util.Stack;

class Solution {
    public int[] solution(int n) {
        Stack<Integer> stk = new Stack<>();
        stk.push(n);

        while (n > 1) {
            if (n % 2 == 0) {
                n /= 2;
            } else {
                n = 3 * n + 1;
            }
            stk.push(n);
        }

        int[] answer = new int[stk.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = stk.get(i);
        }

        return answer;
    }
}