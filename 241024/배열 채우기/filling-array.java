import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[11];
        int cnt = 0;
        for (int i = 1; i <= 10; i++) {
            num[i] = sc.nextInt();
            if (num[i] == 0) break;
            cnt++;
        }
        for (int i = cnt; i >= 1; i--) {
            System.out.print(num[i] + " ");
        }
    }
}