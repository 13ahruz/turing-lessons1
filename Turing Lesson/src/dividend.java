import java.util.Scanner;
public class dividend {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Input ur first number: ");
        int a = sc.nextInt();

        System.out.println("Input ur second number: ");
        int b = sc.nextInt();



        System.out.print("Reminder of your numbers is: " +  a / b);

    }
}
