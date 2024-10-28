import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n + 1][n + 1];
        for (int i = 0; i < m; i++) {
            int r = sc.nextInt();
            int c = sc.nextInt();
            for (int j = 1; j <= n; j++) {
                for (int k = 1; k <= n; k++) {
                    if (j == r && k == c) {
                        arr[j][k] = 1;
                    }
                }
            }
        }

        for (int j = 1; j <= n; j++) {
            for (int k = 1; k <= n; k++) {
                System.out.print(arr[j][k] + " ");
            }
            System.out.println();
        }
    }
}