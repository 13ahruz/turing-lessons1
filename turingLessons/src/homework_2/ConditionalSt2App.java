package homework_2;

import java.util.Scanner;

public class ConditionalSt2App {
    public static void main(String[] args) {
        int num = new Scanner(System.in).nextInt();

        if (num >= 10) {
            System.out.println(num * num * num + 5 * num);
        } else {
            System.out.println(num * num - 2 * num + 4);
        }
    }
}

