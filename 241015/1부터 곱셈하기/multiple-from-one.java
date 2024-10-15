import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 변수 선언
        int n;
        int prod = 1;

        n = sc.nextInt();

        // 1부터 증가시키며 곱한 값이 n이상이 된 순간, 곱해진 숫자를 출력합니다.
        for(int i = 1; i <= 10; i++) {
            prod *= i;
            if(prod >= n) {
                System.out.print(i);
                break;
            }
        }            
    }
}