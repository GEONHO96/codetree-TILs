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
        
        // 소문자와 대문자를 바꾸어 출력합니다.
        for(int i = 0; i < len; i++) {
            if(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
                System.out.print((char)(str.charAt(i) - 'A' + 'a'));
            }
            else {
                System.out.print((char)(str.charAt(i) - 'a' + 'A'));
            }
        }
    }
}