package homework_2;

import java.util.Scanner;

public class FirstOrLastApp {
    public static void main(String[] args) {
        int num = new Scanner(System.in).nextInt();
        int largestDigit = 0;
        while (num > 0) {
            int digit = num % 10;
            largestDigit = (largestDigit > digit) ? largestDigit : digit; //largestDigit = Math.max(largestDigit, digit);
            num /= 10;
        }
        System.out.println(largestDigit);
    }
}

