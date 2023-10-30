class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        
        int midStart = s + overwrite_string.length();
        String frontStr = my_string.substring(0, s);
        String endStr = my_string.substring(midStart);

        answer = frontStr + overwrite_string + endStr;
        
        return answer;
    }
}