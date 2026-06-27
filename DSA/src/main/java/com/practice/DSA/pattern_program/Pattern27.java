package com.practice.DSA.pattern_program;

public class Pattern27 {
    public static void main(String[] args) {
        int n= 5;
        int i,j;
        int y;

        for (i=1; i<=n; i++){
            y=1;
            for (j=1; j<=i-1; j++){
                System.out.print(y);
                y++;
            }
            y=i;
            for (j=1; j<=(n-i)+(n-i)+1; j++){
                System.out.print(y);
            }
            y=i-1;
            for (j=1; j<=i-1; j++){
                System.out.print(y);
                y--;
            }
            System.out.println();
        }

        n=4;

        for (i=1; i<=n; i++){
            y=1;
            for (j=1; j<=n-i; j++){
                System.out.print(y);
                y++;
            }
            y=(n-i)+1;
            for (j=1; j<=i+i+1; j++){
                System.out.print(y);
            }
            y=n-1;
            for (j=1; j<=n-i; j++){
                System.out.print(y);
                y--;
            }

            System.out.println();
        }
    }
}

// Output
//        111111111
//        122222221
//        123333321
//        123444321
//        123454321
//        123444321
//        123333332
//        122222223
//        111111111