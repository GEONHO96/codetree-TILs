import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                cnt++;
                if (cnt % 10 == 0) {
                    System.out.print(1);
                    cnt++;
                } else {
                    System.out.print(cnt % 10);                    
                }
            }
            System.out.println();
        }
    }
}