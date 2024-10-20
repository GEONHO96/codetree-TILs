import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 변수 선언 및 입력
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++) {
            for(int k = 1; k <= i; k++)
                System.out.print("* ");
            System.out.println();
            for(int k = 1; k <= n - i + 1; k++)
                System.out.print("* ");
            System.out.println();
        }
    }
}