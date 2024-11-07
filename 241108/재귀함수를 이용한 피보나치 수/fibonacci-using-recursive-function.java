import java.util.Scanner;

public class Main {

    public static int fibonacci(int N) {
        if (N == 1)
            return 1;
        if (N == 2)
            return 1;

        return fibonacci(N - 2) + fibonacci(N - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println(fibonacci(N));
    }
}