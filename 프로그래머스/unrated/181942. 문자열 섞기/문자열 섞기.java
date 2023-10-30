class Solution {
    public String solution(String str1, String str2) {
        String answer = "";
        
        char[] charArr1 = str1.toCharArray();
        char[] charArr2 = str2.toCharArray();

        for (int i = 0; i < charArr1.length; i++) {
            answer += Character.toString(charArr1[i]) + Character.toString(charArr2[i]);
        }
        
        return answer;
    }
}