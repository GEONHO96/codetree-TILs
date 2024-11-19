import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N + 1];
        int cnt = 0;
        for (int i = 1; i <= N; i++) {
            A[i] = sc.nextInt();
        }
        for (int i = 1; i <= N; i++) {
            for (int j = i + 1; j <= N; j++) {
                for (int k = j + 1; k <= N; k++) {
                    if (A[i] <= A[j] && A[j] <= A[k]) {
                        cnt++;
                    }
                }
            }
        }
        System.out.println(cnt);
    }
}