package com.algorithm.chap02;

import java.util.Scanner;

class LeftDayOfYear {
    //각 달의 일수
    static int[][] mdays = {
            {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}, //평년
            {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}  //윤년
    };

    //서기 year년은 윤년인가?(윤년: 1 / 평년: 0)
    static int isLeap(int year) {
        return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? 1 : 0;
    }

    private static int leftDayOfYear(int y, int m, int d) {
        int days = d;

        for (int i = 1; i < m; i++) {
            days += mdays[isLeap(y)][i - 1];
        }

        return 365 + isLeap(y) - days;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int retry; //한 번 더?

        System.out.println("연내의 남은 일 수를 구합니다.");

        do {
            System.out.print("년: ");
            int year = stdIn.nextInt();
            System.out.print("월: ");
            int month = stdIn.nextInt();
            System.out.print("일: ");
            int day = stdIn.nextInt();

            System.out.printf("연내의 남은 일 수는 %d일입니다.\n", leftDayOfYear(year, month, day));

            System.out.print("한번 더 할까요? (1.예 / 0.아니오) : ");
            retry = stdIn.nextInt();
        } while (retry == 1);
    }
}
