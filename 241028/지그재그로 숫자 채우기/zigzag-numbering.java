import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (j == 0) {
                    arr[i][j] = i;
                }
                if (j % 2 == 0 && j != 0) {
                    arr[i][j] = arr[i][j - 2] + 2 * n;
                }
                if (j == 1) {
                    arr[i][j] = 2 * n - i - j;
                }
                if (j % 2 == 1 && j != 1) {
                    arr[i][j] = arr[i][j - 2] + 2 * n;
                }
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}