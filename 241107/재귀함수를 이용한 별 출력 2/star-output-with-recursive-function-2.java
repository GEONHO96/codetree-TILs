import java.util.Scanner;

public class Main {
    public static void printStar(int n) { // 1부터 2n번째 줄까지 주어진 모양대로 별을 출력하는 함수
        if(n == 0)            // n이 0이라면, 더 이상 진행하지 않고
            return;           // 퇴각합니다.

        // 외각 별을 출력합니다.
        for(int i = 1; i <= n; i++)
            System.out.print("* ");
        System.out.println();

        printStar(n - 1); // 가운데 별을 출력하는 함수

        // 외각 별을 출력합니다.
        for(int i = 1; i <= n; i++)
            System.out.print("* ");
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 변수 선언 및 입력:
        int n = sc.nextInt();

        printStar(n);
    }
}