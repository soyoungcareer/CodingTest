import java.util.Stack;
import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int[] arr) {
        /* 스택 풀이 */
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < arr.length; i++) {
            if (stack.empty()) {
                stack.push(arr[i]);
            } else if (stack.peek() < arr[i]) {
                stack.push(arr[i]);
            } else {
                stack.pop();
                i--;
            }
        }

        int[] stk = new int[stack.size()];
        for (int i = 0; i < stk.length; i++) {
            stk[i] = stack.get(i);
        }


        /* 기존 풀이
        int[] stk = {};
        List<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i < arr.length; i++) {
            if (list.size() == 0) {
                list.add(arr[i]);
                continue;
            } 

            if (list.get(list.size() - 1) < arr[i]) {
                list.add(arr[i]);
            } else {
                list.remove(list.size() - 1);
                i--;
            }
        }

        stk = list.stream().mapToInt(i -> i).toArray();
         */

        return stk;
    }
}