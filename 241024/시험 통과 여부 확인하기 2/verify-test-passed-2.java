import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int[] num = new int[4];
        int cnt = 0;
        for (int i = 1; i <= T; i++) {
            int sum = 0;
            int avg = 0;
            for (int j = 0; j < 4; j++) {
                num[j] = sc.nextInt();
                sum += num[j];
            }
            avg = sum / 4;
            if (avg >= 60) {
                System.out.println("pass");
                cnt++;
            } else {
                System.out.println("fail");
            }
        }
        System.out.println(cnt);
    }
}