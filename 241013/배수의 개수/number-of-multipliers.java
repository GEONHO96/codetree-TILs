import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 변수 선언
        int a, cnt3 = 0, cnt5 = 0;

        // 입력
        for(int i = 1; i <= 10; i++) {
            a = sc.nextInt();

            if(a % 3 == 0)
                cnt3++;
            if(a % 5 == 0)
                cnt5++;
        }

        // 출력
        System.out.print(cnt3 + " " + cnt5);
    }
}