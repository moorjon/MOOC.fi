
import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1 = Integer.valueOf(input.nextLine());
        int num2 = Integer.valueOf(input.nextLine());

        int sumOfNum = num1 + num2;

        double squaredSum = Math.sqrt(sumOfNum);

        System.out.println("The sum of the numbers, squared is " + squaredSum);


    }
}
