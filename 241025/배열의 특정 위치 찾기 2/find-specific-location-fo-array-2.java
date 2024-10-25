import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int evenSum = 0;
        int oddSum = 0;
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
            if (i % 2 == 0) {
                oddSum += arr[i];
            } else {
                evenSum += arr[i];
            }
        }
        int sub = Math.abs(oddSum - evenSum);
        System.out.println(sub);
    }
}