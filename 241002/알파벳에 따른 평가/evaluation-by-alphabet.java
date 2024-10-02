import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char ch = str.charAt(0);

        if (ch == 'S') {
            System.out.println("Superior");
        } else if (ch == 'A') {
            System.out.println("Excellent");
        } else if (ch == 'B') {
            System.out.println("Good");
        } else if (ch == 'C') {
            System.out.println("Usually");
        } else if (ch == 'D') {
            System.out.println("Effort");
        } else {
            System.out.println("Failure");
        }
    }
}