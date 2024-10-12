import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 변수 선언
        char c;
        int n;

        // 입력
        c = sc.next().charAt(0);

        n = sc.nextInt();

        // 출력
        if(c == 'A') {
            for(int i = 1; i <= n; i++)
                System.out.print(i + " ");
        }
        else {
            for(int i = n; i >= 1; i--)
                System.out.print(i + " ");
        }
    }
}