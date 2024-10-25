import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.print(n * (i + 1) + " ");
        }
    }
}