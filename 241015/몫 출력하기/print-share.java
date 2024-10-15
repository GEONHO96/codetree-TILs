import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = 0;
        while (true) {
            int num = sc.nextInt();
            if (num % 2 == 1) {
                continue;
            }
            if (num % 2 == 0) {
                num /= 2;
                cnt++;
                System.out.println(num);
                if (cnt == 3) {
                    break;
                }
            }
        }
    }
}