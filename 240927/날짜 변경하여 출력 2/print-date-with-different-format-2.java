import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        // 변수 선언 및 입력
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("-"); // - 기준으로 잘라서 입력 받겠다는 뜻
        int m = sc.nextInt(); // - 기호가 나오기 전까지 입력 진행
        int d = sc.nextInt(); // - 기호가 나오기 전까지 입력 진행
        int y = sc.nextInt(); // - 기호가 나오기 전 or 입력의 마지막 부분까지 진행

        // 출력
        System.out.println(y + "." + m + "." + d);
    }
}