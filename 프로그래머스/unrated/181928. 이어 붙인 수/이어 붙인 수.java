class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        
        StringBuilder oddSb = new StringBuilder();
        StringBuilder evenSb = new StringBuilder();

        for (int a : num_list) {
            if (a % 2 == 0) {
                evenSb.append(a);
            } else {
                oddSb.append(a);
            }
        }

        answer = Integer.parseInt(oddSb.toString()) + Integer.parseInt(evenSb.toString());
        
        return answer;
    }
}