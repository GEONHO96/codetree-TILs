import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 변수 선언 및 입력
        int a, b;
        int prod = 1;

        a = sc.nextInt();
        b = sc.nextInt();

        // 1부터 b까지의 a의 배수들을 곱합니다.
        for(int i = 1; i <= b; i++) {
            if(i % a == 0)
                prod *= i;
        }

        // 출력
        System.out.print(prod);
    }
}