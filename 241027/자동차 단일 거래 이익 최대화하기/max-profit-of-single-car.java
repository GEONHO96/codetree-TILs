import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int min = Integer.MAX_VALUE;
        int cnt = 0;
        int k = 0;
        int max = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if (min > arr[i]) {
                min = arr[i];
                k = i;
            }
        }
        for (int i = k; i < n; i++) {
            if (min < arr[i]) {
                cnt++;
                max = arr[i];
            }
        }
        if (cnt == 0) {
            System.out.println(0);
        } else {
            System.out.println(max - min);
        }
    }
}