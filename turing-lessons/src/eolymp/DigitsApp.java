package eolymp;

import java.util.Scanner;

public class DigitsApp {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();


        if (n < 4) {
            System.out.print(12 + (n - 1) * 8);
        } else if (n == 4) {
            System.out.println(33);
        } else {
            System.out.println(33 + CalculateMatch(n - 1));
        }
    }

    public static int CalculateMatch(int n) {
        int c = 0;
        switch (n % 4) {
            case 0:
                c = 8;
                break;
            case 1:
                c = 13;
                break;
            case 2:
                c = 18;
                break;
            case 3:
                c = 21;
                break;
        }
        int b = (n / 4 - 1) * 21 + c;

        return b;
    }
}
