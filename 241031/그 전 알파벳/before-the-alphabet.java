import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 알파벳 소문자를 입력받습니다.
        char x = sc.next().charAt(0);

        // 이전 알파벳을 출력합니다.
        if(x == 'a')
            System.out.print("z");
        else
            System.out.print((char)(x - 1));
    }
}