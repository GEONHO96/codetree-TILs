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

    public static int lcm(int n, int m) {
        return (n * m) / gcd(n, m);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println(lcm(n, m));
    }
}