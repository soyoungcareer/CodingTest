package programmers.level0;

import java.util.Scanner;

/*
 * 2023-10-23 (월)
 * 
 * 프로그래머스 > Java > Lv.0 > a와 b 출력하기
 * 
 * (문제)
 * 정수 a와 b가 주어집니다. 각 수를 입력받아 입출력 예와 같은 형식으로 출력하는 코드를 작성해 보세요.
 * 
 */

public class AandBPrint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
