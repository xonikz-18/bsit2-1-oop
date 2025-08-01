import java.util.Scanner;

public class Main {
    static int num = 0;

    public static void main(String[] args) {

        System.out.println("INPUT FIVE NUMBERS");
        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter Number " + i + ": " );
            num = num + scanner.nextInt();
        }
        System.out.println(" ");
        System.out.println("Total Number: " + num);

        scanner.close();
    }
}