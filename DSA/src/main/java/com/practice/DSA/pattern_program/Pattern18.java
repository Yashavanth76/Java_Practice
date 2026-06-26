package com.practice.DSA.pattern_program;

public class Pattern18 {
    public static void main(String[] args) {
        int n = 5;
        int i,j;
        int x = 1;

        for (i=1; i<=n; i++){
            x=i;
            for (j=1; j<=i; j++){
                System.out.print(x);
            }
            System.out.println();
        }
    }
}
// Output
//        1
//        22
//        333
//        4444
//        55555