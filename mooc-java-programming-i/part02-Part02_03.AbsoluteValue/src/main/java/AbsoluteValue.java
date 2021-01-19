
import java.util.Scanner;

public class AbsoluteValue {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numb = Integer.valueOf(input.nextLine());

        if (numb < 0) {
            System.out.println(numb * -1);
        } else {
            System.out.println(numb);
        }

    }
}
