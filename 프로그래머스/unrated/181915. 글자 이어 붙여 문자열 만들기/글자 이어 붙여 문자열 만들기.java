class Solution {
    public String solution(String my_string, int[] index_list) {
        String answer = "";
        /* StringBuilder 사용 시 성능개선됨 */
        StringBuilder sb = new StringBuilder();

        for (int i : index_list) {
            sb.append(my_string.substring(i, i+1));
        }

        answer = String.valueOf(sb);
        
        return answer;
    }
}