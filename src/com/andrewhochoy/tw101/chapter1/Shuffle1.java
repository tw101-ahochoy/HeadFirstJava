package com.andrewhochoy.tw101.chapter1;

/**
 * Created by ahochoy on 4/23/14.
 */
public class Shuffle1 {
    public static void main(String[] args) {
        int x = 3;

        while(x > 0) {
            if (x > 2) {
                System.out.print("a");
            }

            x = x - 1;
            System.out.print("-");

            if(x == 2) {
                System.out.print("b c");
            }

            if(x == 1) {
                System.out.print("d");
                x = x - 1;
            }
        }
    }
}
