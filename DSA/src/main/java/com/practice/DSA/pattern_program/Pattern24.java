package com.practice.DSA.pattern_program;

public class Pattern24 {
    public static void main(String[] args) {
        int n = 5;
        int i,j;
        int x;

        for (i=1; i<=n; i++){

            for (j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            x=1;
            for (j=1; j<=i; j++){
                System.out.print(x);
                x++;
            }
            x=i-1;
            for (j=1; j<=i-1; j++){
                System.out.print(x);
                x--;
            }
            System.out.println();
        }
    }
}

// Output
//         1
//        121
//       12321
//      1234321
//     123454321