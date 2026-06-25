package com.practice.DSA.pattern_program;

public class Pattern15 {
    public static void main(String[] args) {
        int n = 5;
        int i, j;

        for(i=1; i<=n; i++) {
            for (j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        n = 4;

        for (i=1; i<=n; i++){
            for (j=1; j<=n-i+1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
//Output
//        *
//        **
//        ***
//        ****
//        *****
//        ****
//        ***
//        **
//        *