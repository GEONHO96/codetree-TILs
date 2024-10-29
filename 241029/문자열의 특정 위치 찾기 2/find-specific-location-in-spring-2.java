import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 문자열 리스트를 정의합니다.
        String[] str = new String[]{ "apple", "banana", "grape", "blueberry", "orange" };

        // 영문자를 입력받습니다.
        char a = sc.next().charAt(0);
        int cnt = 0;

        // 조건을 만족하는 문자열을 출력하고 조건을 만족하는 문자열의 개수를 셉니다.
        for(int i = 0; i < 5; i++)
            if(str[i].charAt(2) == a || str[i].charAt(3) == a) {
                System.out.println(str[i]);
                cnt++;
            }

        // 조건을 만족하는 문자열의 개수를 출력합니다.
        System.out.println(cnt);
    }
}