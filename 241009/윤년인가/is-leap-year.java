import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 변수 선언
        int y;

        // 입력
        y = sc.nextInt();

        // 출력
        if(y % 400 == 0)
            System.out.print("true");
        else if(y % 100 == 0)
            System.out.print("false");
        else if(y % 4 == 0)
            System.out.print("true");
        else
            System.out.print("false");
    }
}