import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 변수 선언
        int a, b;

        // 입력
        a = sc.nextInt();
        b = sc.nextInt();

        // 출력
        if(a >= 1) {
            for(int i = 1; i <= b; i++)
                System.out.print(a);
        }
        else {
            System.out.print(0);
        }
    }
}