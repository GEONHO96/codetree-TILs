import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 변수 선언 및 입력
        int a, b;
        int sum = 0;

        a = sc.nextInt();
        b = sc.nextInt();

        // a부터 b까지 조건을 만족하는 수를 더합니다.
        for(int i = a; i <= b; i++) {
            if(i % 6 == 0 && i % 8 != 0)
                sum += i;
        }

        System.out.println(sum);
    }
}