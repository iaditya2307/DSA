package Lec_15;

public class Array_2Demo {


    public static void main(String[] args) {
        int[][] arr = new int[3][4];
        System.out.println(arr);
        System.out.println(arr[1]);
        int[][] other = arr;
        // row =arr.length;
        // col =arr[0].length;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }

}
