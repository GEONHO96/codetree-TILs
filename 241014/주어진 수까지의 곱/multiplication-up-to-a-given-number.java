import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 변수 선언
        int a, b;
        int prod = 1;

        a = sc.nextInt();
        b = sc.nextInt();

        // a부터 b까지의 수를 곱합니다.
        for(int i = a; i <= b; i++) {
            prod *= i;
        }

        // 출력
        System.out.print(prod);
    }
}