import java.util.Scanner;

public class Main {
    public static void printStarReverse(int n) {
        if (n == 0)
            return;

        for (int i = 0; i < n; i++) {
            System.out.print("* ");
        }
        System.out.println();
        printStarReverse(n - 1);
    }

    public static void printStar(int n) {
        if (n == 0)
            return;

        printStar(n - 1);
        for (int i = 0; i < n; i++) {
            System.out.print("* ");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printStarReverse(n);
        printStar(n);
    }
}