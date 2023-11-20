class Solution {
    public int solution(String my_string, String is_suffix) {
        int answer = 0;
        int myStrLen = my_string.length();
        int suffLen = is_suffix.length();

        if (myStrLen < suffLen) {
            answer = 0;
        } else {
            answer = is_suffix.equals(my_string.substring(myStrLen - suffLen)) ? 1 : 0;
        }
        
        return answer;
    }
}