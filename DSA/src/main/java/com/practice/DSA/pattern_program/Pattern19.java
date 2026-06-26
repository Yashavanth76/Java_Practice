package com.practice.DSA.pattern_program;

public class Pattern19 {
    public static void main(String[] args) {
        int n = 5;
        int i,j;
        int x = 1;

        for (i=1; i<=n; i++){
            x=1;
            for (j=1; j<=i; j++){
                System.out.print(x);
                x++;
            }
            System.out.println();
        }
    }
}

// Output
//        1
//        12
//        123
//        1234
//        12345