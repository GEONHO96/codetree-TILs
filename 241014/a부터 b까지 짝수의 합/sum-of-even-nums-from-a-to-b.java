import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 변수 선언 및 입력
        int a, b;
        int sum = 0;

        a = sc.nextInt();
        b = sc.nextInt();

        // a부터 b까지의 수 중 짝수인 수들을 더합니다.
        for(int i = a; i <= b; i++) {
            if(i % 2 == 0) {
                sum += i;
            }
        }

        // 출력
        System.out.println(sum);
    }
}