package homework_2;

import java.util.Scanner;

public class ConditionalSt2App {
    public static void main(String[] args) {
        int num = new Scanner(System.in).nextInt();
        int result = 0;

        if (num >= 10) {
            result = num * num * num + 5 * num;
        } else {
            result = num * num - 2 * num + 4;
        }
        System.out.println(result);
    }
}

