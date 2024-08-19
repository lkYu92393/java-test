package com.example.pattern;

public class StarRightTriangle {

    public static void Print(int n) {

        int a, b;

        for (a = 0; a < n; a++) {
            for (b = 0; b < a; b++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
