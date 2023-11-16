import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {
            int s = queries[i][0];
            int e = queries[i][1];
            int k = queries[i][2];

            List<Integer> list = new ArrayList<>();
            for (int j = s; j < e + 1; j++) {
                if (arr[j] > k) list.add(arr[j]);
            }

            answer[i] = list.isEmpty() ? -1 : Collections.min(list);
        }

        return answer;
    }
}