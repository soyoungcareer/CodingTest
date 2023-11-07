class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length + 1];

        int lastNum = num_list[num_list.length - 1];
        int foreNum = num_list[num_list.length - 2];
        int addNum = (lastNum > foreNum) ? lastNum - foreNum : lastNum * 2;

        System.arraycopy(num_list, 0, answer, 0, num_list.length);
        answer[num_list.length] = addNum;
        
        return answer;
    }
}