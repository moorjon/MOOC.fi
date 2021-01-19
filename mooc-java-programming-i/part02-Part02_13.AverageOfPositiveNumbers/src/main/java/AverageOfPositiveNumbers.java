
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numbOfNumbers = 0;
        int sumOfNumbers = 0;

        while (true) {
            int userInput = Integer.valueOf(scanner.nextLine());

            if (userInput == 0) {
                break;
            } else if (userInput > 0) {
                numbOfNumbers++;
                sumOfNumbers += userInput;
            }
        }

        if (numbOfNumbers > 0) {
            System.out.println(sumOfNumbers / (double) numbOfNumbers);
        } else {
            System.out.println("Cannot calculate the average");
        }

    }
}
