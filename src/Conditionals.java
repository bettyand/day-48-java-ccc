import java.util.Scanner;

public class Conditionals {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter a number greater than 212:");
        int num = scanner.nextInt();

        if (num > 212) {
            System.out.println("Water is boiling!");
        }

        scanner.close();
    }
    
}
