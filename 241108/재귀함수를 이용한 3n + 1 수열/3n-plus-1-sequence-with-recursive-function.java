import java.util.Scanner;

public class Main {

    public static int recursion(int n) {
        int cnt = 0;
        while (n > 1) {
            if (n % 2 == 0) {
                n /= 2;
                cnt++;
            } else {
                n = 3 * n + 1;
                cnt++;
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(recursion(n));
    }
}