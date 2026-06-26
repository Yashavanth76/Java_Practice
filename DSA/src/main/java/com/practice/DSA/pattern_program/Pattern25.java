package com.practice.DSA.pattern_program;

public class Pattern25 {
    public static void main(String[] args) {
        int n = 5;
        int i,j;
        int x;

        for (i=1; i<=n; i++){

            for (j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            x=i;
            for (j=1; j<=i; j++){
                System.out.print(x);
                x--;
            }
            x=2;
            for (j=1; j<=i-1; j++){
                System.out.print(x);
                x++;
            }
            System.out.println();
        }
    }
}

// Output
//            1
//           212
//          32123
//         4321234
//        543212345