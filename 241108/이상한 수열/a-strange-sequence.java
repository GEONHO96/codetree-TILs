import java.util.Scanner;

public class Main {
    public static int sequence(int N) {
        if (N == 1)
            return 1;
        if (N == 2)
            return 2;
        return sequence(N / 3) + sequence(N - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println(sequence(N));
    }
}