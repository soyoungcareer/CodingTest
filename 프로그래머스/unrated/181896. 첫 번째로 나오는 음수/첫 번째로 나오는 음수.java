class Solution {
    public int solution(int[] num_list) {
        /* return 활용 */
        for (int i = 0; i < num_list.length; i++) {
            if (num_list[i] < 0) return i;
        }
        
        return -1;
        
        /* (기존 풀이)
        int answer = 0;

        for (int i = 0; i < num_list.length; i++) {
            if (num_list[i] < 0) {
                answer = i;
                break;
            } else {
                answer++;
            }
        }

        answer = answer == num_list.length ? -1 : answer;

        return answer;
        */
    }
}