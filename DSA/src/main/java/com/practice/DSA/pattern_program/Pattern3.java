package com.practice.DSA.pattern_program;

public class Pattern3 {
    public static void main(String[] args) {
        int n = 5;

        for(int i = 0; i <= n; i++){
            for (int j = 1; j <= n; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}

// i for line and j is for print

// Output
//  12345
//  12345
//  12345
//  12345
//  12345
//  12345