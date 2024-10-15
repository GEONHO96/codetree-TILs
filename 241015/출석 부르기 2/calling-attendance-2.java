import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while(true) {
            // 변수 선언 및 입력
            int n;
            n = sc.nextInt();

            // n이 1~4라면 번호에 맞는 이름을, 그게 아니라면 Vacancy를 출력한 뒤 종료합니다.
            if(n == 1)
                System.out.println("John");
            else if(n == 2)
                System.out.println("Tom");
            else if(n == 3)
                System.out.println("Paul");
            else if(n == 4)
                System.out.println("Sam");
            else {
                System.out.println("Vacancy");
                break;
            }
        }
    }
}