package com.algorithm.chap01;

import java.util.Scanner;

public class Trangle {
    static void triangleLB(int n) {
        System.out.println("----- 왼쪽 아래 -----");
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print('*');
            }
            System.out.println();
        }
    }
    static void triangleLU(int n) {
        System.out.println("----- 왼쪽 위 -----");
        for(int i=1;i<=n;i++){
            for(int j=n;j>=i;j--){
                System.out.print('*');
            }
            System.out.println();
        }
    }
    static void triangleRU(int n) {
        System.out.println("----- 오른쪽 위 -----");
        for(int i=1;i<=n;i++){
            for(int k=1;k<i;k++){
                System.out.print(' ');
            }
            for(int j=n;j>=i;j--){
                System.out.print('*');
            }
            System.out.println();
        }
    }
    static void triangleRB(int n) {
        System.out.println("----- 오른쪽 아래 -----");
        for(int i=1;i<=n;i++){
            for(int j=n;j>i;j--){
                System.out.print(' ');
            }
            for(int k=1;k<=i;k++){
                System.out.print('*');
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int n;
        do {
            System.out.print("몇 단 삼각형입니까? : ");
            n = stdIn.nextInt();
        }while(n<=0);

        triangleLB(n);
        triangleLU(n);
        triangleRU(n);
        triangleRB(n);
    }

}
