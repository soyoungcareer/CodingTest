import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int[] arr) {
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

        return stk;
    }
}