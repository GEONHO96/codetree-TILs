import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 변수 선언 및 입력
        int n = sc.nextInt();

        // n회 반복합니다.
        for(int i = 0; i < n; i++) {
            // 변수 선언 및 입력
            int a = sc.nextInt();
            int b = sc.nextInt();
            int ans = 0;

            // a부터 b까지 짝수를 전부 더한 값을 출력합니다.
            for(int j = a; j <= b; j++)
                if(j % 2 == 0)
                    ans += j;

            System.out.println(ans);
        }
    }
}