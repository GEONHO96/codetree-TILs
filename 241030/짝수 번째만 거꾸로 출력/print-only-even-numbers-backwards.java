import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 문자열을 구현합니다.
        String str = sc.next();

        // 가장 먼저 출력해야 할 문자의 인덱스를 구합니다.
        int idx = str.length() - 1;
        if(idx % 2 == 0) idx--;

        // 문자열을 순회하여 조건대로 문자를 출력합니다.
        for(int i = idx; i >= 0; i -= 2) {
            System.out.print(str.charAt(i));
        }
    }
}