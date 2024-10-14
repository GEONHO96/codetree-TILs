import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        double avg;
        for (int i = 1; i <= n; i++) {
            int num = sc.nextInt();
            sum += num;
        }
        avg = (double) sum / n;
        System.out.printf("%d %.1f", sum, avg);
    }
}