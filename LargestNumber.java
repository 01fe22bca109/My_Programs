import java.util.Scanner;

public class LargestNumber{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int largest = Integer.MIN_VALUE;

        System.out.println("Enter the first number:");
        int num1 = scanner.nextInt();
        largest = Math.max(largest, num1);

        System.out.println("Enter the second number:");
        int num2 = scanner.nextInt();
        largest = Math.max(largest, num2);

        System.out.println("Enter the third number:");
        int num3 = scanner.nextInt();
        largest = Math.max(largest, num3);

        System.out.println("Enter the fourth number:");
        int num4 = scanner.nextInt();
        largest = Math.max(largest, num4);

        System.out.println("Enter the fifth number:");
        int num5 = scanner.nextInt();
        largest = Math.max(largest, num5);

        System.out.println("The largest number among the five numbers is " + largest + ".");
    }
}