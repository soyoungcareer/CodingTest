package programmers.level0;

import java.util.Scanner;

/*
 * 2023-10-25 (수)
 * 
 * 프로그래머스 > Java > Lv.0 > 대소문자 바꿔서 출력하기
 * 
 * (문제)
 * 영어 알파벳으로 이루어진 문자열 str이 주어집니다. 각 알파벳을 대문자는 소문자로 소문자는 대문자로 변환해서 출력하는 코드를 작성해 보세요.
 * 
 * (제한사항)
 * 1 ≤ str의 길이 ≤ 20
 *  str은 알파벳으로 이루어진 문자열입니다.
 * 
 */

public class SwitchUpLowPrint {
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
