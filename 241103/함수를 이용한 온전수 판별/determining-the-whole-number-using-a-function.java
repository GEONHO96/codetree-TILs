import java.util.Scanner;

public class Main {
    // 온전수인지 아닌지 여부를 판단하는 함수를 작성합니다.
    public static boolean judgeNumber(int n) {
        if(n % 2 == 0)
            return false;
        else if(n % 10 == 5)
            return false;
        else if(n % 3 == 0 && n % 9 != 0)
            return false;
        else
            return true;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 변수 선언 및 입력:
        int a = sc.nextInt();
        int b = sc.nextInt();
        int cnt = 0;

        for(int i = a; i <= b; i++) {
            if(judgeNumber(i))
                cnt++;
        }

        System.out.print(cnt);
    }
}