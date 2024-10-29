import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 문자열 리스트를 정의합니다.
        String[] str = new String[10];
        int lenAll = 0;
        
        // 공백 단위로 문자열을 입력받습니다.
        for(int i = 0; i < 10; i++) {
            str[i] = sc.next();
        }

        // 각 단어 당 문자열의 길이를 확인하여 총 길이에 더해줍니다.
        for(int i = 0; i < 10; i++) {
            int len = str[i].length();
            lenAll += len;
        }

        // 문자열의 총 길이를 출력합니다.
        System.out.println(lenAll);
    }
}