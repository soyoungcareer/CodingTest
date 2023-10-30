import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        
        char[] charArr = a.toCharArray();

        for (int i = 0; i < charArr.length; i++) {
            char tempChar = charArr[i];

            /* 대문자인 경우 소문자로 변환 */
            if (Character.isUpperCase(tempChar)) {
                charArr[i] = Character.toLowerCase(tempChar);
            } else {
            /* 소문자인 경우 대문자로 변환 */
                charArr[i] = Character.toUpperCase(tempChar);
            }
        }

        String rsltStr = new String(charArr);
        System.out.println(rsltStr);
    }
}