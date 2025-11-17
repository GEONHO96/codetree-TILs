import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 문자열을 입력받습니다.
        String str = sc.next();
        String str2 = sc.next();

        // 문자열의 길이를 구합니다.
        int len = str.length();

        // 명령 문자열에서 제시하는 대로 행동합니다.
        for(int i = 0; i < str2.length(); i++) {
            if (str2.charAt(i) == 'L') {
                // 명령 문자열이 L일 때에는 문자열을 왼쪽으로 한 칸 쉬프트합니다.
                str = str.substring(1) + str.substring(0, 1);
            }
            else {
                // 명령 문자열이 R일 때에는 문자열을 오른쪽으로 한 칸 쉬프트합니다.
                str = str.substring(len - 1) + str.substring(0, len - 1);
            }
        }

        // 명령대로 쉬프트된 문자열을 출력합니다.
        System.out.println(str);
    }
}