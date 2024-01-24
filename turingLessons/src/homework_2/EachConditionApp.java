package homework_2;

import java.util.Scanner;

public class EachConditionApp {
    public static void main(String[] args) {
        int num = new Scanner(System.in).nextInt();

        if (num % 6 == 0 && num / 10 > -10 && num / 10 < 10 && num / 10 != 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}

