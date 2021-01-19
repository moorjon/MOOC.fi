
import java.util.Scanner;

public class NumberOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numbTotal = 0;

        while (true) {
            System.out.println("Give a number: ");
            int inputNumb = Integer.valueOf(scanner.nextLine());

            if (inputNumb == 0) {
                break;
            } else {
                numbTotal += 1;
                continue;
            }
        }

        System.out.println("Number of numbers: " + numbTotal);

    }
}
