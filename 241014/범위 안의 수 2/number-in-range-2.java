import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 변수 선언 및 입력
        int num;
        int sum = 0, cnt = 0;
        double avg;

        // 입력을 받으며 0이상 200이하의 정수들을 선별합니다.
        for(int i = 1; i <= 10; i++) {
            num = sc.nextInt();
            if(num >= 0 && num <= 200) {
                sum += num;
                cnt++;
            }
        }

        // 0이상 200이하의 정수들의 평균을 구합니다.
        avg = (double)sum / cnt;

        // 출력
        System.out.printf("%d %.1f", sum, avg);
    }
}