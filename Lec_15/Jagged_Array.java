package Lec_15;


import java.util.Scanner;

public class Jagged_Array {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();// row
        int[][] arr = new int[n][];
        // take input
        for (int i = 0; i < arr.length; i++) {
            int c = sc.nextInt();// col
            arr[i] = new int[c];
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }

        }
        // print
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();

        }

    }

}
