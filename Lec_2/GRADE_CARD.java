package Lec_2;

import java.util.Scanner;

public class GRADE_CARD {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int marks = sc.nextInt();
        if (marks >= 75) {
            System.out.println("A");
        } else if (marks < 75 && marks >= 65) {
            System.out.println("B");
        } else if (marks < 65 && marks >= 55) {
            System.out.println("C");
        } else if (marks < 55 && marks >= 45) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }

    }

}