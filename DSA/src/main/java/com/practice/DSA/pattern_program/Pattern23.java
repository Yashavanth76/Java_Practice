package com.practice.DSA.pattern_program;

public class Pattern23 {
    public static void main(String[] args) {
        int n = 5;
        int i,j;
        int x = 15;

        for (i=1; i<=n; i++){
            for (j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for (j=1; j<=i; j++){
                System.out.print("*");
            }
            for (j=1; j<=i-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

// Output
//            *
//           ***
//          *****
//         *******
//        *********