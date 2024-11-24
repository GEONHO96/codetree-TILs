import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n + 1][m + 1];
        int cnt = 1;

        for (int sum = 2; sum <= n + m; sum++) {
            for (int i = 1; i <= n; i++) {
                int j = sum - i;
                if (j >= 1 && j <= m) {
                    arr[i][j] = cnt++;
                }
            }
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}