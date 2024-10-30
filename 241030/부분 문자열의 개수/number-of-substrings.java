import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 문자열을 입력받습니다.
        String a = sc.next();
        String b = sc.next();
        int ans = 0;
        
        // 문자열의 길이를 구합니다.
        int len = a.length();
        
        // 문자열 b가 등장하는 횟수를 구합니다.
        for(int i = 0; i < len - 1; i++)
            if(a.charAt(i) == b.charAt(0) && a.charAt(i + 1) == b.charAt(1))
                ans++;
        
        // 출력
        System.out.print(ans);
    }
}