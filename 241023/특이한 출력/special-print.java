import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 변수 선언 및 입력
        int n = sc.nextInt();

        // 특이한 조건대로 구구단을 출력합니다.
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n; j++) {
                if((i + j) % 4 == 0) {
                    System.out.println("(" + i + ", " + j + ")");
                }
                else {
                    System.out.print("(" + i + ", " + j + ") ");
                }
            } 
        }
    }
}