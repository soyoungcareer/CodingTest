class Solution {
    public int solution(int n) {
        int answer = 0;
        
        if (n % 2 == 0) {
            // n 이하의 짝수인 모든 양의 정수의 합 리턴
            for (int i = n; i > 0; i--) {
                if (i % 2 == 0) answer += i*i;
            }
        } else {
            // n 이하의 홀수인 모든 양의 정수의 합 리턴
            for (int i = n; i > 0; i--) {
                if (i % 2 != 0) answer += i;
            }
        }
        
        return answer;
    }
}