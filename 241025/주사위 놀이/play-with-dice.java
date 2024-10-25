import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] count = new int[7];
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
            count[arr[i]]++;
        }
        for (int i = 1; i <= 6; i++) {
            System.out.println(i + " - " + count[i]);
        }
    }
}