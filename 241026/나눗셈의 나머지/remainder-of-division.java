import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] count = new int[10];
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = 0;
        while (a > 0) {
            count[a % b]++;
            a /= b;
        }
        for (int i = 0; i <= 9; i++) {
            sum += count[i] * count[i];
        }
        System.out.println(sum);
    }
}