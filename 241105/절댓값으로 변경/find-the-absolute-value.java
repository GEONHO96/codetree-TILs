import java.util.Scanner;

public class Main {
    public static final int MAX_N = 50;

    public static int N;
    public static int[] arr = new int[MAX_N];

    public static void absoluteValue(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                arr[i] = -arr[i];
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        absoluteValue(arr);

        for (int i = 0; i < N; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}