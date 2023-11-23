class Solution {
    public String solution(int q, int r, String code) {
        String answer = "";
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < code.length(); i++) {
            if (i % q == r) sb.append(code.charAt(i));
        }

        answer = String.valueOf(sb);
        return answer;
    }
}