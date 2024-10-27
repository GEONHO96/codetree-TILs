import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int x = 0;
        int y = 0;
        int min = 1000;
        int max = 1;
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] >= 500) {
                x = arr[i];
                if (min > x) {
                    min = x;
                }
            }
            if (arr[i] < 500) {
                y = arr[i];
                if (max < y) {
                    max = y;
                }
            }
        }
        System.out.printf("%d %d", max, min);
    }
}