package com.algorithm.chap01;

import java.util.Scanner;

class Square {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int no;

        System.out.println("사각형을 출력합니다.");

        do {
            System.out.print("단 수 : ");
            no = stdIn.nextInt();
        }while (no <= 0);

        for(int i=0;i<no;i++){
            for(int j=0;j<no;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
