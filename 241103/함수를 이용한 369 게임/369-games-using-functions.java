import java.util.Scanner;

public class Main {

    public static boolean isMagicNumber(int n) {
        if (n % 3 == 0) {
            return true;
        }
        if (n % 10 == 3 || n % 10 == 6 || n % 10 == 9) {
            return true;
        }
        if (n / 10 == 3 || n / 10 == 6 || n / 10 == 9) {
            return true;
        }
        if (n / 100 == 3 || n / 100 == 6 || n / 100 == 9) {
            return true;
        }
        if (n / 1000 == 3 || n / 1000 == 6 || n / 1000 == 9) {
            return true;
        }
        if (n / 10000 == 3 || n / 10000 == 6 || n / 10000 == 9) {
            return true;
        }
        if (n / 100000 == 3 || n / 100000 == 6 || n / 100000 == 9) {
            return true;
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