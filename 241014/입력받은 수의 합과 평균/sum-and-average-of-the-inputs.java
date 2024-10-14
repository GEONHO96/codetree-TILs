import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 변수 선언 및 입력
        int n;
        n = sc.nextInt();

        // 합을 구합니다.
        int sum = 0;
        for(int i = 0; i < n; i++) {
            int score;
            score = sc.nextInt();
            sum += score;
        }

        // 평균을 구합니다.
        double avg = (double)sum / n;

        System.out.printf("%d %.1f", sum, avg);
    }
}