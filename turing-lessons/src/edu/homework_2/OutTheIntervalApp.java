package edu.homework_2;

import java.util.Scanner;

public class OutTheIntervalApp {
    public static void main(String[] args) {
        String input = new Scanner(System.in).nextLine();
        int num1 = Integer.parseInt(input.split(" ")[0]);
        int num2 = Integer.parseInt(input.split(" ")[1]);
        int num3 = Integer.parseInt(input.split(" ")[2]);

        if (num1 >= num2 && num1 <= num3) {
            System.out.println("IN");
        } else {
            System.out.println("OUT");
        }
    }
}

