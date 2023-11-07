class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        
        int[] arr = new int[included.length];

        for (int i = 0; i < included.length; i++) {
            if (i == 0) {
                arr[i] = a;
            } else {
                arr[i] = arr[i-1] + d;
            }

            if (included[i] == true) {
                answer += arr[i];
            }
        }
        
        return answer;
    }
}