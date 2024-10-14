import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            int a = sc.nextInt();
            sum += a;
        }
        double avg = double sum / 10;
        System.out.print(sum + " ");
        System.out.printf("%.1f", avg);
    }
}