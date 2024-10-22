import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j <= n - i; j++) {
                cnt++;
                if (cnt == 10) {
                    cnt = 1;
                    System.out.print(cnt + " ");
                } else {
                    System.out.print(cnt + " ");
                }
            }
            System.out.println();
        }
    }
}