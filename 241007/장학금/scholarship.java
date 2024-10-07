import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 변수 선언
        int m, f;

        // 입력
        m = sc.nextInt();
        f = sc.nextInt();

        // 출력
        if(m >= 90 && f >= 95)
            System.out.println("100000");
        else if(m >= 90 && f >= 90)
            System.out.println("50000");
        else
            System.out.println("0");
    }
}