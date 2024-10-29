import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 문자열을 입력받습니다.
        String str1 = sc.next();
        String str2 = sc.next();

        // 문자열의 길이를 구합니다.
        int len1 = str1.length();
        int len2 = str2.length();

        // 더 긴 문자열과 그 문자열의 길이를 출력합니다. 같을 경우 same을 출력합니다.
        if(len1 > len2)
            System.out.print(str1 + " " + len1);
        else if(len1 < len2)
            System.out.print(str2 + " " + len2);
        else
            System.out.print("same");
    }
}