import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 문자열 리스트를 정의합니다.
        String[] str = new String[20];
        
        // 입력
        int n = sc.nextInt();
        
        for(int i = 0; i < n; i++)
            str[i] = sc.next();
        
        char a = sc.next().charAt(0);
        int lenSum = 0;
        int cnt = 0;
        
        // 조건에 맞는 문자열의 총 길이와 개수를 계산해줍니다.
        for(int i = 0; i < n; i++) {
            if(str[i].charAt(0) == a) {
                int len = str[i].length();
                lenSum += len;
                cnt++;
            }
        }
        
        // 구하고자 하는 값을 출력합니다.
        System.out.printf("%d %.2f", cnt, (double)lenSum / cnt);
    }
}