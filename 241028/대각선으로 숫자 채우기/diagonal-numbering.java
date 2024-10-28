import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n + 1][m + 1];
        int k = 2;
        int cnt = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (i + j == k) {
                    arr[i][j] = cnt;
                    cnt++;
                }
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}