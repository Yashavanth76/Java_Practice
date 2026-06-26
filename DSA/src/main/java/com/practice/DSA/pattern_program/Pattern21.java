package com.practice.DSA.pattern_program;

public class Pattern21 {
    public static void main(String[] args) {
        int n = 5;
        int i,j;
        int x = 1;

        for (i=1; i<=n; i++){
//          do not reset the value of x
            for (j=1; j<=i; j++){
                System.out.print(x +" ");
                x++;
            }
            System.out.println();
        }
    }
}

// Output
//        1
//        2 3
//        4 5 6
//        7 8 9 10
//        11 12 13 14 15