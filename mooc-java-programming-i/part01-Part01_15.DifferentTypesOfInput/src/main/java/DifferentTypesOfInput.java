
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Write your program here
        System.out.println("Give a string:");
        String text = input.nextLine();
        System.out.println("Give an integer:");
        int integer = Integer.valueOf(input.nextLine());
        System.out.println("Give a double:");
        double floatingPoint = Double.valueOf(input.nextLine());
        System.out.println("Give a boolean:");
        boolean trueOrFalse = Boolean.valueOf(input.nextLine());

        System.out.println("You gave the string " + text);
        System.out.println("You gave the integer " + integer);
        System.out.println("You gave the double " + floatingPoint);
        System.out.println("You gave the boolean " + trueOrFalse);
    }
}
