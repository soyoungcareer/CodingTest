class Solution {
    public String solution(int[] numLog) {
        String answer = "";
        
        char[] arr = new char[numLog.length - 1];

        for (int i = 0; i < numLog.length - 1; i++) {
            int diff = numLog[i+1] - numLog[i];
            switch (diff) {
                case   1: arr[i] = 'w'; break;
                case  -1: arr[i] = 's'; break;
                case  10: arr[i] = 'd'; break;
                case -10: arr[i] = 'a'; break; 
                default: break;
            }
        }

        answer = String.valueOf(arr);
        
        return answer;
    }
}