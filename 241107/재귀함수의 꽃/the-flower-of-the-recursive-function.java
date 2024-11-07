import java.util.Scanner;

public class Main {
    public static void printNumber(int N) {
        if (N == 0)
            return;

        printNumber(N - 1);
        System.out.print(N + " ");
    }

    public static void printReverseNumber(int N) {
        if(N == 0)
            return;

        System.out.print(N + " ");
        printReverseNumber(N - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        printReverseNumber(N);
        printNumber(N);
    }
}