import java.util.Scanner;

public class Main {

    public static boolean isMagicNumber(int n) {
        while (n > 0) {
            if (n % 10 == 3 || n % 10 == 6 || n % 10 == 9 || n % 3 == 0) {
                return true;
            }
            n /= 10;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int cnt = 0;
        for (int i = a; i <= b; i++) {
            if(isMagicNumber(i)) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}