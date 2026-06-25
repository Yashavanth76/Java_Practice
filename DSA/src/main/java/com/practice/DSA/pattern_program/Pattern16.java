package com.practice.DSA.pattern_program;

public class Pattern16 {
    public static void main(String[] args) {
        int n = 6;
        int i, j;

        for(i=1; i<=n; i++) {
            for (j=1; j<=i+(i-1); j++){
                System.out.print("*");
            }
            System.out.println();
        }

        n = 5;

        for (i=1; i<=n; i++){
            for (j=1; j<=(n-i)+(n-i)+1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
//  Output
//        *
//        ***
//        *****
//        *******
//        *********
//        ***********
//        *********
//        *******
//        *****
//        ***
//        *
