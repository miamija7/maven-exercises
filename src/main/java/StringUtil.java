import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class StringUtil {
    public static void main(String[] args) {
        // Exercise 1
        Scanner sc = new Scanner(System.in);
        System.out.print("Check: ");
        String userInput = sc.nextLine();
        boolean isNumber = StringUtils.isNumeric(userInput);
        System.out.println(isNumber);

        // Exercise 2
        String swapCase = StringUtils.swapCase(userInput);
        System.out.println(swapCase);

        // Exercise 3
        String backwards = StringUtils.reverse(userInput);
        System.out.println(backwards);

    }
}
