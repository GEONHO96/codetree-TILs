import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 문자열을 정의합니다.
        String str;
        
        // 문자열을 입력받습니다.
        str = sc.next();
        
        // 문자열의 길이를 구합니다.
        int len = str.length();
        
        // 문자열을 왼쪽으로 한 칸 쉬프트합니다.
        str = str.substring(1) + str.substring(0, 1);
        
        // 왼쪽으로 한 칸 쉬프트된 문자열을 출력합니다.
        System.out.println(str);
    }
}