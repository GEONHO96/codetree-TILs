import java.util.Scanner;

public class Main {
    public static void printNumber(int N) {
        if (N == 0)
            return;

        for (int i = 1; i <= N; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void printReverseNumber(int N) {
        if (N == 0)
            return;

        for (int i = N; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        printNumber(N);
        printReverseNumber(N);
    }
}