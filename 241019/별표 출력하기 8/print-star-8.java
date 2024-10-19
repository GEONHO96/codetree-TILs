import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 변수 선언 및 입력
        int n = sc.nextInt();

        // i가 짝수인 경우 별을 1개, 홀수인 경우 i + 1개 출력합니다
        for (int i = 0; i < n; i++) {
            if(i % 2 == 0) {
                System.out.print("*");
            }
            else {
                for (int k = 0; k < i + 1; k++) {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}