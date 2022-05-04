import java.util.Scanner;

public class Calculations {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number:");
        int a = scanner.nextInt();

        System.out.println("Enter another number:");
        int b = scanner.nextInt();

        System.out.println(a + " + " + b + " = " + (a + b));
        System.out.println(a + " - " + b + " = " + (a - b));
        System.out.println(a + " * " + b + " = " + (a * b));
        System.out.println(a + " / " + b + " = " + ((double)a / (double)b));
        System.out.println(a + " % " + b + " = " + (a % b));

        scanner.close();
    }
}
