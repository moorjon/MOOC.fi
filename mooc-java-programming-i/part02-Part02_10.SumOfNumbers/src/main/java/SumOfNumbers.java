
import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sumOfNumbs = 0;

        while (true) {
            System.out.println("Give a number: ");
            int numbInput = Integer.valueOf(scanner.nextLine());

            if (numbInput == 0) {
                break;
            } else {
                sumOfNumbs = numbInput + sumOfNumbs;
                continue;
            }
        }

        System.out.println("Sum of the numbers: " + sumOfNumbs);

    }
}
