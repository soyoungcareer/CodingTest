class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int multi = 1;
        int pow = 0;

        for (int a: num_list) {
            multi *= a;
            pow += a;
        }

        pow = (int) Math.pow(pow, 2);
        answer = multi < pow ? 1 : 0;
        
        return answer;
    }
}