package com.practice.DSA.pattern_program;

public class Pattern20 {
    public static void main(String[] args) {
        int n = 5;
        int i,j;
        int x = 1;

        for (i=1; i<=n; i++){
            x=5;
            for (j=1; j<=i; j++){
                System.out.print(x);
                x--;
            }
            System.out.println();
        }
    }
}
// Output
//        5
//        54
//        543
//        5432
//        54321