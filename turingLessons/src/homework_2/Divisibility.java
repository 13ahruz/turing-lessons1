package homework_2;

import java.util.Scanner;

public class Divisibility {
    public static void main(String[] args) {
        String input = new Scanner(System.in).nextLine();
        int num1 = Integer.parseInt(input.split(" ")[0]);
        int num2 = Integer.parseInt(input.split(" ")[1]);

        if (num1 % num2 == 0){
            System.out.println("Divisible");
        }
        else{
            System.out.println(num1 / num2 + " " + num1 % num2);
        }
    }
}
