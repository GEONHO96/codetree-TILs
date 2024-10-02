import java.util.Scanner;

public class Main {
    public static void main(String[] args ) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (number == 1) {
            System.out.println("John");
        }
        else if (number == 2) {
            System.out.println("Tom");
        }
        else {
            System.out.println("Paul");
        }
    }
}