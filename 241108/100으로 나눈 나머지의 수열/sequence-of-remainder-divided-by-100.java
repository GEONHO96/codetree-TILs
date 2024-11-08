import java.util.Scanner;

public class Main {
    public static int sequence(int N) {
        if (N == 1)
            return 2;
        if (N == 2)
            return 4;
        return (sequence(N - 1) * sequence(N - 2)) % 100;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println(sequence(N));
    }
}