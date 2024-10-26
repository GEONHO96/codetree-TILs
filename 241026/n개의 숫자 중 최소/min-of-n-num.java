import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int minVal = Integer.MAX_VALUE;
        int k = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] < minVal) {
                minVal = arr[i];
                k = i;
            }
        }
        System.out.printf("%d %d", minVal, k);
    }
}