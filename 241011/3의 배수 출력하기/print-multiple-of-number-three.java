import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 변수 선언
        int n;
        int i = 3;

        // 입력
        n = sc.nextInt();

        // 출력
        while(i <= n) {
            System.out.print(i + " ");
            i += 3;
        }
    }
}