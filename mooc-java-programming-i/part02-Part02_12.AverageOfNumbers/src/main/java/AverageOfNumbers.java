
import java.math.BigDecimal;
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numbOfNumbers = 0;
        int sumOfNumbers = 0;

        while (true) {
            System.out.println("Give a number: ");
            int userInput = Integer.valueOf(scanner.nextLine());

            if (userInput == 0) {
                break;
            } else {
                numbOfNumbers += 1;
                sumOfNumbers = userInput + sumOfNumbers;
                continue;
            }
        }

        double numbAverage = (double) sumOfNumbers/numbOfNumbers;
        // System.out.println("Number of numbers: " + numbOfNumbers);
        // System.out.println("Sum of numbers: " + sumOfNumbers);
        System.out.println("Average of the numbers: " + numbAverage);
    }
}
