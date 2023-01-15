package Lec_3.Patterns;
//        *
//        * *
//        * * *
//        * * * *
//        * * * * *

import java.util.Scanner;

public class Pattern2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        int star = 1;

        while (row <= n) {
            // star
            int i = 1;
            while (i <= star) {
                System.out.print("*" + " ");
                i = i + 1;
            }

            // next row Prep
            star = star + 1;
            row = row + 1;
            System.out.println();

        }

    }

}
