class Solution {
    public String solution(String my_string, int m, int c) {
        String answer = "";
        String[] str = new String[my_string.length()/m];
        int startIdx = 0;

        for (int i = 0; i < str.length; i++) {
            str[i] = my_string.substring(startIdx, startIdx + m);
            startIdx += m;
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length; i++) {
            sb.append(str[i].substring(c - 1, c));
        }

        answer = String.valueOf(sb);

        return answer;
    }
}