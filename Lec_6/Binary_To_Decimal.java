package Lec_6;

import java.util.Scanner;

public class Binary_To_Decimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int mul = 1;
        int ans = 0;
        while (n > 0) {
            int rem = n % 10;
            ans += rem * mul;
            mul *= 2;
            n /= 10;
        }
        System.out.println(ans);
    }
}
