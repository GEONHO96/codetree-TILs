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
            sb.append(temp % B); // 나머지를 저장
            temp /= B; // B로 나누기
        }
        
        // 진법 변환 결과 뒤집기
        String converted = sb.reverse().toString(); 
        
        // B진법 수를 다시 10진법으로 변환
        int restored = 0;
        for (int i = 0; i < converted.length(); i++) {
            restored = restored * B + (converted.charAt(i) - '0');
        }
        
        // 출력
        System.out.println(restored);
    }
}
