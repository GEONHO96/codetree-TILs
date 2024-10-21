import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 10;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                cnt -= 1;
                if (cnt == 0) {
                    cnt = 9;
                }
                System.out.print(cnt);
            }
            System.out.println();
        }
    }
}