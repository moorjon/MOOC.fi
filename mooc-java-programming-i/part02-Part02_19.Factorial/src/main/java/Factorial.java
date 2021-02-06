
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.valueOf(scanner.nextLine());
        int i = 1;
        int x = 1;
        
        while (i <= n) {
            System.out.println(x * i);
            x = x * i;
            i++;
        }
    }
}
