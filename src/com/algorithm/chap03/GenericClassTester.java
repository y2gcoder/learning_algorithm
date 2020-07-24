package com.algorithm.chap03;

class GenericClassTester {
    static class GenericClass<T> {
        private T xyz;
        GenericClass(T t) {
            this.xyz = t;
        }

        T getXyz() {
            return xyz;
        }
    }

    public static void main(String[] args) {
        GenericClass<String> s = new GenericClass<>("ABC");
        GenericClass<Integer> n = new GenericClass<>(15);

        System.out.println("s.getXyz() = " + s.getXyz());
        System.out.println("n.getXyz() = " + n.getXyz());
    }
}
