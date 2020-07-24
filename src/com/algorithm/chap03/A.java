package com.algorithm.chap03;

class A implements Comparable<A> {

    //필드, 메서드

    @Override
    public int compareTo(A c) {
        //this가 c보다 크면 양의 값
        //this가 c보다 작으면 음의 값
        //this가 c와 같으면 0
        return 0;
    }

    @Override
    public boolean equals(Object obj) {
        //this가 obj와 같으면 true 반환
        //this가 obj와 같지 않으면 false 반환
        return super.equals(obj);
    }
}
