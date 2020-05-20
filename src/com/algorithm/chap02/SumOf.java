package com.algorithm.chap02;

class SumOf {
    static int sumOf(int[] a) {
        int sum = 0;

        for(int i = 0; i<a.length;i++){
            sum += a[i];
        }

        return sum;
    }

    public static void main(String[] args) {
        int[] x = {5, 10, 73, 2, -5, 42};
        int sum = sumOf(x);

        System.out.println(sum);
    }
}
