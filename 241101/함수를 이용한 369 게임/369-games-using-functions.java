import java.util.Scanner;

public class Main {

    public static int magicNumberCount(int a, int b) {
        int cnt = 0;
        for (int i = a; i <= b; i++) {
            if (i % 10 == 3 || i % 10 == 6 || i % 10 == 9 || i % 3 == 0 || i / 10 == 3 || i / 10 == 6 || i / 10 == 9) {
                cnt++;
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(magicNumberCount(a, b));
    }
}