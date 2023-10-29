package programmers.level0;

import java.util.Scanner;

/*
 * 2023-10-29 (일)
 * 
 * 프로그래머스 > Java > Lv.0 > 문자열 돌리기
 * 
 * (문제)
 * 문자열 str이 주어집니다.
 * 문자열을 시계방향으로 90도 돌려서 아래 입출력 예와 같이 출력하는 코드를 작성해 보세요.
 */

public class RotateString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();

        char[] arr = a.toCharArray();

        for (char c : arr) {
            System.out.println(c);
        }
    }
}
