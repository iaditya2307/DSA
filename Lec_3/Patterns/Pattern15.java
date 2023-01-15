package Lec_3.Patterns;
//* * * * *
//    * * * *
//        * * *
//            * *
//                *
//            * *
//        * * *
//    * * * *
//* * * * *

import java.util.Scanner;

public class Pattern15 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        int star = n;
        int space = 0;
        while (row <= 2 * n - 1) {
            int i = 1;
            while (i <= space) {
                System.out.print("  ");
                i++;
            }
            int j = 1;
            while (j <= star) {
                System.out.print("* ");
                j++;
            }
            if (row < n) {
                space += 2;// space = space + 2;
                star--;
            } else {
                space -= 2;// space = space - 2;
                star++;
            }
            System.out.println();
            row++;

        }

    }

}

