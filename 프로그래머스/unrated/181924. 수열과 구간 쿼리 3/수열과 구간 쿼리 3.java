class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        for (int i = 0; i < queries.length; i++) {
            int frontIdx = queries[i][0];
            int backIdx = queries[i][1];

            int temp = arr[frontIdx];
            arr[frontIdx] = arr[backIdx];
            arr[backIdx] = temp;
        }

        return arr;
    }
}