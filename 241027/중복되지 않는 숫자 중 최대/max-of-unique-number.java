import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        int max = 0;
        int cnt = 0;
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        for (int i = 0; i < N; i++) {
            if (arr[i] == max) cnt++;
        }

        if (cnt >= 2) {
            System.out.println(-1);
        } else {
            System.out.println(max);
        }
    }
}