import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 변수 선언
        int a;

        // 입력
        a = sc.nextInt();

        if(a == 5)
            System.out.print("A");
        
        if(a % 2 == 0)
            System.out.print("B");
    }
}