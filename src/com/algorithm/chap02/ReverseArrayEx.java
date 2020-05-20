package com.algorithm.chap02;

import java.util.Scanner;

class ReverseArrayEx {
    static void swap(int[] a, int idx1, int idx2) {
        int t = a[idx1]; a[idx1] = a[idx2]; a[idx2] = t;
    }

    // 풀이 참고
    static void print(int[] a) {
        for (int i = 0; i < a.length; i++)
            System.out.print(a[i]+" ");
        System.out.println();
    }

    static void reverse(int[] a) {
//        for(int i = 0; i < a.length / 2; i++){
//            for(int j = 0;j<a.length;j++){
//                System.out.print(a[j]+" ");
//            }
//            System.out.println();
//            swap(a, i, a.length -i -1);
//            System.out.println("a["+i+"]과(와) a["+(a.length -i -1)+"]를 교환합니다.");
//        }
        // 풀이 참고
        print(a);
        for (int i = 0; i< a.length / 2; i++){
            System.out.println("a["+i+"]과(와) a["+(a.length -i -1)+"]를 교환합니다.");
            swap(a, i, a.length -i -1);
            print(a);
        }
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);



//        int[] x = {5, 10, 73, 2, -5, 42};
//
//        reverse(x);
//        for(int j = 0;j<x.length;j++){
//            System.out.print(x[j]+" ");
//        }
//        System.out.println();
//        System.out.println("역순 정렬을 마쳤습니다.");

        System.out.print("요솟수는 ：");
        int num = stdIn.nextInt(); // 요솟수

        int[] x = new int[num]; // 요솟수 num인 배열

        for (int i = 0; i < num; i++) {
            System.out.print("x[" + i + "] : ");
            x[i] = stdIn.nextInt();
        }

        reverse(x); // 배열 a의 요소를 역순으로 정렬

        System.out.println("역순 정렬을 마쳤습니다.");

    }
}
