package Lec_3.Patterns;
//               1
//             2 3 4
//           5 6 7 8 9
//      10 11 12 13 14 15 16
//   17 18 19 20 21 22 23 24 25

import java.util.Scanner;

public class Pattern25 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int space = n - 1;
        int star = 1;
        int row = 1;
        int val = 1;
        while (row <= n) {

            // space

            int i = 1;
            while (i <= space) {
                System.out.print("\t");
                i = i + 1;
            }

            // star
            int j = 1;
            while (j <= star) {

                System.out.print(val + "\t");

                j = j + 1;
                val = val + 1;
            }
            // next row
            space = space - 1;
            star = star + 2;
            row = row + 1;
            System.out.println();

        }

    }

}