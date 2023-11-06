class Solution {
    public String solution(String code) {
        String answer = "";
        int MODE = 0;
        char[] arr = code.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != '1') {
                if (MODE == 0 && i % 2 == 0)
                    answer += arr[i];
                if (MODE == 1 && i % 2 != 0)
                    answer += arr[i];
            } else {
                MODE = (MODE == 0) ? 1 : 0;
            }
        }

        if ("".equals(answer))
            answer = "EMPTY";
        
        return answer;
    }
}