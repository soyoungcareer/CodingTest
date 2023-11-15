class Solution {
    public String solution(String my_string, int[] index_list) {
        String answer = "";
        /* (풀이 1) StringBuilder 사용 시 성능개선됨 */
        StringBuilder sb = new StringBuilder();

        for (int i : index_list) {
            sb.append(my_string.substring(i, i+1));
        }

        answer = String.valueOf(sb);
        
        /* 
        (풀이 2) 코드는 간단하지만 속도가 느림
        for (int i : index_list) {
            answer += my_string.substring(i, i+1);
        }
        */
        
        return answer;
    }
}