import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 입력
        int N = sc.nextInt(); // 10진법 수
        int B = sc.nextInt(); // 변환할 진법

        // 1. 10진법 수 N을 B진법으로 변환
        StringBuilder sb = new StringBuilder();
        int temp = N;

        while (temp > 0) {
            sb.append(temp % B); // 나머지를 저장
            temp /= B; // 몫을 갱신
        }

        // 변환된 진법 문자열 (역순으로 저장했으므로 뒤집기)
        String converted = sb.reverse().toString();

        // 2. 변환된 B진법 수를 다시 10진법으로 변환
        int restored = 0;
        for (int i = 0; i < converted.length(); i++) {
            restored = restored * B + (converted.charAt(i) - '0');
        }

        // 출력
        System.out.println(restored);
    }
}
