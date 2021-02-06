
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = Integer.valueOf(scanner.nextLine());
        int sumVar = 0;

        for (int i = 0; i <= n; i++) {
            // System.out.println(sumVar + "sumVar" + " + " + "i" + i);
            sumVar += i;
        }
        
        System.out.println(sumVar);
    }
}
