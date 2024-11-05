import java.util.Scanner;

public class Main {
    // 문자열에 알파벳이 2개 이상인지 여부를 반환합니다.
    public static boolean isMoreTwoalp(String str) {
        // 하나라도 서로 다른 알파벳이 있다면
        // 그 문자열은 알파벳이 2개 이상입니다.
        int len = str.length();
        for(int i = 0; i < len; i++)
            if(str.charAt(i) != str.charAt(0))
                return true;

        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 변수 선언 및 입력:
        String A = sc.next();

        if(isMoreTwoalp(A))
            System.out.print("Yes");
        else
            System.out.print("No");
    }
}