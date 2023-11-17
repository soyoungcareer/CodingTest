class Solution {
    public String solution(String my_string, int[][] queries) {
        for (int i = 0; i < queries.length; i++) {
            int s = queries[i][0];      // 시작 인덱스
            int e = queries[i][1] + 1;  // 종료 인덱스

            // 대체 문자열
            String altrStr = my_string.substring(s, e);     

            // 대체 문자열 역순
            StringBuffer sb = new StringBuffer(altrStr);
            sb.reverse();

            // 기존 문자열에 대체
            StringBuffer newSb = new StringBuffer(my_string);
            newSb.replace(s, e, String.valueOf(sb));

            my_string = String.valueOf(newSb);
        }

        String answer = my_string;

        return answer;
    }
}