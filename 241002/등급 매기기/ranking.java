import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 변수 선언
        int n;

        // 입력
        n = sc.nextInt();

        // 출력
        if(n >= 90)
            System.out.println("A");
        else if(n >= 80)
            System.out.println("B");
        else if(n >= 70)
            System.out.println("C");
        else if(n >= 60)
            System.out.println("D");
        else
            System.out.println("F");        
    }
}