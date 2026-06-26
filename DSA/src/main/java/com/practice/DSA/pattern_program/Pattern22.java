package com.practice.DSA.pattern_program;

public class Pattern22 {
    public static void main(String[] args) {
        int n = 5;
        int i,j;
        int x = 15;

        for (i=1; i<=n; i++){
            for (j=1; j<=i; j++){
                System.out.print(x +" ");
                x--;
            }
            System.out.println();
        }
    }
}

// Output
//        15
//        14 13
//        12 11 10
//        9 8 7 6
//        5 4 3 2 1