package com.algorithm.chap01;

import java.util.Scanner;

class Difference {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.print("a의 값 : ");
        int a = stdIn.nextInt();

//        int b;
//        do {
//            System.out.print("b의 값 : ");
//            b = stdIn.nextInt();
//            System.out.println("a보다 큰 값을 입력하세요!");
//        }while (b <= a);

        int b = 0;
        while (true) {
            System.out.print("b의 값 : ");
            b = stdIn.nextInt();
            if(b>a)
                break;
            System.out.println("a보다 큰 값을 입력하세요!");
        }

        System.out.println("b - a는 "+(b-a)+"입니다.");


    }
}
