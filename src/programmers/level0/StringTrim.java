package programmers.level0;

import java.util.Scanner;

/*
 * 2023-10-29 (일)
 * 
 * 프로그래머스 > Java > Lv.0 > 문자열 붙여서 출력하기
 * 
 * (문제)
 * 
 * 두 개의 문자열 str1, str2가 공백으로 구분되어 입력으로 주어집니다.
 * 입출력 예와 같이 str1과 str2을 이어서 출력하는 코드를 작성해 보세요.
 */

public class StringTrim {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();

        String ab = (a + b).trim();

        System.out.println(ab);
    }
}
