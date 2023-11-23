class Solution {
    public String solution(String my_string, int m, int c) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        
        /* 간단한 풀이 */
        for (int i = c - 1; i < my_string.length(); i += m) {
            sb.append(my_string.charAt(i));
        }

        answer = String.valueOf(sb);
        
        
        /* (기존 풀이)
        String[] str = new String[my_string.length()/m];
        int startIdx = 0;

        for (int i = 0; i < str.length; i++) {
            str[i] = my_string.substring(startIdx, startIdx + m);
            startIdx += m;
        }        

        for (int i = 0; i < str.length; i++) {
            sb.append(str[i].substring(c - 1, c));
        }

        answer = String.valueOf(sb);
        */

        return answer;
    }
}