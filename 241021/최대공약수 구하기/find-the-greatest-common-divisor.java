import java.util.Scanner;

public class Main {

    public static int gcd(int n, int m) {
        int temp = 0;
        while (m > 0) {
            temp = n;
            n = m;
            m = temp % m;
        }
        return n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println(gcd(n, m));
    }
}