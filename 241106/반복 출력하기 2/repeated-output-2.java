import java.util.Scanner;

public class Main {
    public static void printString(int n) { // 1부터 n번째 줄까지 문자열을 출력하는 함수
        if(n == 0)                          // n이 0이라면, 더 이상 진행하지 않고
            return;                         // 퇴각합니다.
        
        printString(n - 1);
        System.out.println("HelloWorld");
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 변수 선언 및 입력:
        int n = sc.nextInt();
        printString(n);
    }
}