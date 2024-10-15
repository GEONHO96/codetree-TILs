import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 변수 선언
        int n;
        int cnt = 0;

        n = sc.nextInt();

        // 1부터 증가시키며 나눈 값이 1이하가 된 순간, 나눗셈을 진행한 횟수를 출력합니다.
        for(int i = 1; i <= 100; i++) {
            if(n <= 1) {
                System.out.print(cnt);
                break;
            }
            n /= i;
            cnt++;
        }
    }
}