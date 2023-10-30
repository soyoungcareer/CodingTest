import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        
        char[] arr = a.toCharArray();

        for (char c : arr) {
            System.out.println(c);
        }
    }
}