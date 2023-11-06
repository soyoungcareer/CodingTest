class Solution {
    public int solution(String ineq, String eq, int n, int m) {
        int answer = 0;
        boolean flag = true;

        if (">".equals(ineq)) {
            flag = "=".equals(eq) ? n >= m : n > m;
        } else {
            flag = "=".equals(eq) ? n <= m : n < m;
        }

        answer = flag ? 1 : 0;

        return answer;
    }
}