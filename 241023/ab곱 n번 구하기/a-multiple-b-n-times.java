import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 변수 선언 및 입력
        int n = sc.nextInt();

        // n회 반복합니다.
        for(int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int ans = 1;

            // a부터 b까지 전부 곱한 값을 출력합니다.
            for(int j = a; j <= b; j++)
                ans *= j;
            System.out.println(ans);
        }
    }
}