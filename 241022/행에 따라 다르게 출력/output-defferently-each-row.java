import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 변수 선언 및 입력
        int n = sc.nextInt();
        int cnt = 0;

        // 값을 조건대로 증가시켜 출력합니다.
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(i % 2 == 0)
                    cnt++;
                else
                    cnt += 2;
                
                System.out.print(cnt + " ");
            }
            System.out.println();
        }
    }
}