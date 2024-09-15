package com.company;

import java.util.Scanner;

public class LargestAmongThreeNum {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 1st number");
        int n1 = sc.nextInt();
        System.out.println("Enter 2nd number");
        int n2 = sc.nextInt();
        System.out.println("Enter 3rd number");
        int n3 = sc.nextInt();
        sc.close();

      //  int largest = Math.max(n1, Math.max(n2, n3));
      int largest = (n1>n2)?(n1>n3)?n1:n3:(n2>n3?n2:n3);

        System.out.println("Largest of the above three numbers are " + largest);
    }
}
