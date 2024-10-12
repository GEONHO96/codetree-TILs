import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char ch;

        while (n <= 100) {
            if (n >= 90) {
                ch = 'A';
            } else if (n >= 80) {
                ch = 'B';
            } else if (n >= 70) {
                ch = 'C';
            } else if (n >= 60) {
                ch = 'D';
            } else {
                ch = 'F';
            }
            System.out.print(ch + " ");
            n++;
        }
    }
}