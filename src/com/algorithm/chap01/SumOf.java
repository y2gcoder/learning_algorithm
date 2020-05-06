package com.algorithm.chap01;

class SumOf {
    static int sumof(int a, int b) {
        int sum = 0;
        for(int i = a < b ? a : b;i<=(a > b ? a : b);i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("sumof(3, 5) = "+sumof(3,5));
        System.out.println("sumof(6, 4) = "+sumof(6,4));
        System.out.println("sumof(5, 5) = "+sumof(5,5));
    }
}
