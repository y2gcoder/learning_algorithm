package com.algorithm.chap01;

import java.util.Scanner;

public class NumPira {
    static void npira(int n) {
        for(int i=1;i<=n;i++){
            for(int k=n-1;k>=i;k--) {
                System.out.print(' ');
            }
            for(int j=1;j<=((2*i)-1);j++){
                int num = i%10;
                System.out.print(num);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int n;

        do {
            System.out.print("몇 단 피라미드입니까? : ");
            n = stdIn.nextInt();
        }while(n<=0);

        npira(n);

    }
}
