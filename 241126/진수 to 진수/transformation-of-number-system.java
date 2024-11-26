import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 입력값 읽기
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int K = scanner.nextInt();
        int[] digits = new int[N];
        for (int i = 0; i < N; i++) {
            digits[i] = scanner.nextInt();
        }

        // base M -> 10 변환
        long decimalValue = 0;
        for (int i = 0; i < N; i++) {
            decimalValue = decimalValue * M + digits[i];
        }

        // 10 -> base K 변환
        StringBuilder result = new StringBuilder();
        while (decimalValue > 0) {
            result.insert(0, decimalValue % K);
            decimalValue /= K;
        }

        // 결과 출력
        if (result.length() == 0) {
            result.append(0); // 입력값이 0일 경우
        }
        System.out.println(result.toString());

        scanner.close();
    }
}
