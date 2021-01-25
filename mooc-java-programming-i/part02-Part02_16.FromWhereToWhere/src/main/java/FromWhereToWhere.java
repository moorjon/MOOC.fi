
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Where to? ");
        int toNumb = Integer.valueOf(scanner.nextLine());

        System.out.println("Where from? ");
        int fromNumb = Integer.valueOf(scanner.nextLine());

        for (int i = fromNumb; i <= toNumb; i++) {
            System.out.println(i);
        }
    }
}
