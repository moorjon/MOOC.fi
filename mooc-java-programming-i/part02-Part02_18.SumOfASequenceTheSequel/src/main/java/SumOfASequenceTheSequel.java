
import java.io.PipedWriter;
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startNumb = Integer.valueOf(scanner.nextLine());
        int endNumb = Integer.valueOf(scanner.nextLine());

        int numbSum = 0;

        for (int i = startNumb; i <= endNumb; i++) {
            numbSum += i;
        }

        System.out.println(numbSum);
    }
}
