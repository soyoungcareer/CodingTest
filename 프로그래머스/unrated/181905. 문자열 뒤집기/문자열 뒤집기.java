class Solution {
    public String solution(String my_string, int s, int e) {
        String answer = "";

        StringBuilder sb = new StringBuilder();
        sb.append(my_string.substring(s, e + 1));
        sb.reverse();

        StringBuilder newSb = new StringBuilder();
        newSb.append(my_string);
        newSb.replace(s, e + 1, String.valueOf(sb));

        answer = String.valueOf(newSb);

        return answer;
    }
}