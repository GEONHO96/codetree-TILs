import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 변수 선언 및 입력
        boolean satisfied = true;

        for(int i = 1; i <= 5; i++) {
            // 모든 수가 3의 배수인지 확인합니다.
            int a;
            a = sc.nextInt();
            if(a % 3 != 0)
                satisfied = false;
        }

        //출력
        if(satisfied == true)
            System.out.println("1");
        else
            System.out.println("0");
    }
}