package homework_2;

import java.util.Scanner;

public class FirstOrLastApp {
    public static void main(String[] args) {
        int num = new Scanner(System.in).nextInt();
        int largestDigit = 0;
        boolean isEqual = false;
        while (num > 0) {
            int digit = num % 10;
            if (digit == largestDigit) {
                isEqual = true;
            } else if (digit > largestDigit) {
                largestDigit = digit;
            }
            num /= 10;
        }
        if (isEqual) {
            System.out.println("=");
        } else {
            System.out.println(largestDigit);
        }
    }
}

