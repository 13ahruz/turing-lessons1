package arrayTasks;

import java.sql.Array;
import java.util.Scanner;

public class arrayTask1 {
    public static void main(String[] args) {

        System.out.println("Enter the length: ");
        int num = new Scanner(System.in).nextInt();
        int[] nums = new int[num];

        for (int i = 0; i < num; i++) {
            System.out.println("Import " + i + ". element.");
            nums[i] = new Scanner(System.in).nextInt();
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i] * 2);
        }
    }
}
