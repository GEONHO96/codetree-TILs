import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 입력받기
        int N = sc.nextInt();
        int B = sc.nextInt();
        
        // 진법 변환 결과를 저장할 문자열
        StringBuilder sb = new StringBuilder();
        
        // N을 B진법으로 변환
        int temp = N;
        while (temp > 0) {
            int remainder = temp % B;
            if (remainder < 10) {
                sb.append((char) (remainder + '0')); // 숫자 '0' ~ '9'
            } else {
                sb.append((char) (remainder - 10 + 'A')); // 문자 'A' ~ 'Z'
            }
            temp /= B;
        }
        
        // 진법 변환 결과 뒤집기
        String converted = sb.reverse().toString();
        
        // B진법 수를 다시 10진법으로 변환
        int restored = 0;
        for (int i = 0; i < converted.length(); i++) {
            char c = converted.charAt(i);
            int value;
            if ('0' <= c && c <= '9') {
                value = c - '0';
            } else {
                value = c - 'A' + 10;
            }
            restored = restored * B + value;
        }
        
        // 출력
        System.out.println(restored);
    }
}
