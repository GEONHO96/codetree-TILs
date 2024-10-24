import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[11];
        int sum = 0;
        int cnt = 0;

        for (int i = 1; i <= 10; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] < 250) {
                sum += arr[i];
                cnt++;
            }
            if (arr[i] > 250) {
                break;
            }
        }
        double avg = (double) sum / cnt;
        System.out.print(sum + " ");
        System.out.printf("%.1f", avg);
    }
}