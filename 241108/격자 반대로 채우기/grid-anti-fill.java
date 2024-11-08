import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        if (n % 2 == 1) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (j % 2 == 0) {
                        System.out.print((n - j) * n - i + " ");
                    } else {
                        System.out.print((n - j - 1) * n + i + 1 + " ");
                    }
                }
                System.out.println();
            }
        } else {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (j % 2 == 0) {
                        System.out.print(n * n - (n - 1 - i) - j * n + " ");
                    } else {
                        System.out.print(n * (n - j) - i + " ");
                    }
                }
                System.out.println();
            }
        }
    }
}