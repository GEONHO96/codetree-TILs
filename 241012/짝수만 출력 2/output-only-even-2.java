import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 변수 선언
        int b, a, i;

        // 입력
        b = sc.nextInt();
        a = sc.nextInt();

        i = b;

        // 출력
        while(i >= a) {
            System.out.print(i + " ");
            i -= 2;
        }
    }
}