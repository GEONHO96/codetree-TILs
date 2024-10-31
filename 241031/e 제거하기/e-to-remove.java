import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 문자열을 입력받습니다.
        String str = sc.next();

        // 문자열의 길이를 구합니다.
        int len = str.length();
        
        
        // 문자열을 순회하며 e가 있는지 탐색하고, 그 때마다 e를 제거합니다.
        for(int i = 0; i < len; i++)
            if(str.charAt(i) == 'e') {
                // 해당 문자열이 e라면 그 원소를 제거하고 break문을 이용해 빠져나옵니다.
                str = str.substring(0, i) + str.substring(i + 1);
                len--;
                break;
            }
        
        // e가 제거된 문자열을 출력합니다.
        System.out.println(str);
    }
}