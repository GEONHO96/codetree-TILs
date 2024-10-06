import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 변수 선언
        double a, b;

        // 입력
        a = sc.nextDouble();
        b = sc.nextDouble();

        if(a >= 1.0 && b >= 1.0)
            System.out.println("High");
        else if(a >= 0.5 && b >= 0.5)
            System.out.println("Middle");
        else
            System.out.println("Low");
    }
}