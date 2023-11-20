class Solution {
    public int solution(String my_string, String is_suffix) {
        /* endsWith 메소드 활용 */
        int answer = my_string.endsWith(is_suffix) ? 1 : 0;
        
        /* (기존 풀이)
        int answer = 0;
        int myStrLen = my_string.length();
        int suffLen = is_suffix.length();

        if (myStrLen < suffLen) {
            answer = 0;
        } else {
            answer = is_suffix.equals(my_string.substring(myStrLen - suffLen)) ? 1 : 0;
        }
        */
        
        return answer;
    }
}