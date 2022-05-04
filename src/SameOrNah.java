import java.util.Scanner;

public class SameOrNah {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a word:");
        String w1 = scanner.nextLine();

        System.out.println("Enter another word:");
        String w2 = scanner.nextLine();

        if (w1.equals(w2)) {
            System.out.println("The words are the same");
        } else {
            System.out.println("The words are different");
        }

        scanner.close();
    }
}
