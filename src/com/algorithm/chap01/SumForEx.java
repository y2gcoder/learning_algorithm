package com.algorithm.chap01;

import java.util.Scanner;

class SumForEx {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("1부터 n까지의 합을 구합니다.");
        System.out.print("n의 값 : ");
        int n = stdIn.nextInt();

        int sum = 0;

        // 내 풀이
//        StringBuilder sb = new StringBuilder();
//
//        for (int i=1;i<=n;i++) {
//            sum += i;
//            if(i<n) {
//                sb.append(i+" + ");
//            }else if(i==n) {
//                sb.append(i);
//                sb.append(" = "+sum);
//                System.out.println(sb.toString());
//            }
//
//        }

        // 해설
        for (int i = 1; i<=n;i++){
            if(i < n)
                System.out.print(i+" + ");
            else
                System.out.print(i);
            sum += i;
        }
        System.out.println(" = "+sum);
    }
}
