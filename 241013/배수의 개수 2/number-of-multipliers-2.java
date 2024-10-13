import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 변수 선언
        int a, cnt = 0;

        // 입력
        for(int i = 1; i <= 10; i++) {
            a = sc.nextInt();

            if(a % 2 == 1)
                cnt++;
        }

        // 출력
        System.out.print(cnt);
    }
}