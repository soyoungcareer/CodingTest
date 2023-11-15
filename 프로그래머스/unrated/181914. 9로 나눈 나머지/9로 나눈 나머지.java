class Solution {
    public int solution(String number) {
        int answer = 0;
        
        for (char i : number.toCharArray()) {
            answer += Character.getNumericValue(i);
        }

        answer %= 9;
        
        return answer;
    }
}