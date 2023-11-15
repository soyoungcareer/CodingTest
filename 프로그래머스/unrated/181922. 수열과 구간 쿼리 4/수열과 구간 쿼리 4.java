class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        for (int i = 0; i < queries.length; i++) {
            int startNum = queries[i][0];
            int endNum = queries[i][1];
            int k = queries[i][2];

            for (int j = startNum; j < endNum + 1; j++) {
                if (j % k == 0) {
                    arr[j]++;
                }
            }
        }

        return arr;
    }
}