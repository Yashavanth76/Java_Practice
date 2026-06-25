package com.practice.DSA.pattern_program;

public class Pattern7 {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 0; i <= n; i++){
            for (int j = 1; j <= i+i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

// Output
//        **
//        ****
//        ******
//        ********
//        **********