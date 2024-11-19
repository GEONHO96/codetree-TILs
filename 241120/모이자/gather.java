import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] A = new int[n];
        int minSum = 100 * 100 * n;
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            int sumDiff = 0;
            for (int j = 0; j < n; j++) {
                sumDiff +=  Math.abs(i - j) * A[j];
            }
            minSum = Math.min(minSum, sumDiff);
        }

        System.out.println(minSum);
    }
}