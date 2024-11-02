import java.util.Scanner;

public class Main {

    public static boolean isMagicNumber(int n) {
        if (n % 2 != 0 && n % 10 != 5 && (n % 3 != 0 || n % 9 == 0)) {
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