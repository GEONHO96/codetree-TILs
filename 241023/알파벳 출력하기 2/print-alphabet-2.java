import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char cnt = 'A';
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j <= n - i; j++) {
                System.out.print(cnt + " ");
                cnt++;
                if (cnt > 'Z') {
                    cnt = 'A';
                }
            }
            System.out.println();
        }
    }
}