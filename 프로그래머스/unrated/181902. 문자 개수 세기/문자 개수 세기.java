class Solution {
    public int[] solution(String my_string) {
        // A = 65, a = 97
        int[] alpbt = new int[52];

        for (int i = 0; i < alpbt.length / 2; i++) {
            alpbt[i] = 65 + i;
        }

        int j = 0;
        for (int i = alpbt.length / 2; i < alpbt.length; i++) {
            alpbt[i] = 97 + j++;
        }

        int[] charToInt = new int[my_string.length()];
        for (int i = 0; i < charToInt.length; i++) {
            charToInt[i] = my_string.charAt(i);
        }

        int[] answer = new int[52];
        for (int k = 0; k < charToInt.length; k++) {
            for (int i = 0; i < alpbt.length; i++) {
                if (charToInt[k] == alpbt[i]) {
                    answer[i] = ++answer[i];
                }
            }
        }

        return answer;
    }
}