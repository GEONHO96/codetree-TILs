import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        int[] arr = new int[n + 1];
        int[] question = new int[q + 1];
        for (int i = 1; i <= n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 1; i <= q; i++) {
            question[i] = sc.nextInt();
            if (question[i] == 1) {
                int a = sc.nextInt();
                System.out.println(arr[a]);
            }
            if (question[i] == 2) {
                int b = sc.nextInt();
                for (int j = 1; j <= n; j++) {
                    if (arr[j] == b) {
                        System.out.println(j);
                        break;
                    }
                }
            }
            if (question[i] == 3) {
                int s = sc.nextInt();
                int e = sc.nextInt();
                for (int j = s; j <= e; j++) {
                    System.out.println(arr[j] + " ");
                }
            }
        }
    }
}