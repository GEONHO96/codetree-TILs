import java.util.Scanner;

public class Main {
    public static int printNumber(int N) {
        int sum = 0;
        if (N % 2 == 0) {
            for (int i = 2; i <= N; i += 2) {
                sum += i;
            }
        } else {
            for (int i = 1; i <= N; i += 2) {
                sum += i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println(printNumber(N));
    }
}