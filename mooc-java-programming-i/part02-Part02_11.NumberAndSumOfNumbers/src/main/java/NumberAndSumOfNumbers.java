
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numbSum = 0;
        int numbInput = 0;

        while (true) {
            System.out.println("Give a number: ");
            int userInput = Integer.valueOf(scanner.nextLine());

            if (userInput == 0) {
                break;
            } else {
                numbSum = userInput + numbSum;
                numbInput += 1;
            }
        }

        System.out.println("Number of numbers: " + numbInput);
        System.out.println("Sum of the numbers: " + numbSum);

    }
}
