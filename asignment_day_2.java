import java.util.Scanner;

public class IntegerSumCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        System.out.println("Enter five integers:");

        for (int i = 0; i < 5; i++) {
            System.out.print("Integer " + (i + 1) + ": ");
            int num = scanner.nextInt();
            sum += num;
        }

        System.out.println("The sum of the five integers is: " + sum);

        scanner.close();
    }
}
