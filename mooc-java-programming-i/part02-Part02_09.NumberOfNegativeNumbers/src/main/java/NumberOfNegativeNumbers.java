
import java.util.Scanner;

public class NumberOfNegativeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numbTotal = 0;

        while (true) {
            System.out.println("Give a number: ");
            int numbInput = Integer.valueOf(scanner.nextLine());

            if (numbInput == 0) {
                break;
            } else if (numbInput < 0) {
                numbTotal += 1;
                continue;
            }
        }

        System.out.println("Number of negative numbers: " + numbTotal);

    }
}
