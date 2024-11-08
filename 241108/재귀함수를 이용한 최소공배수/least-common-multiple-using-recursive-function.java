import java.util.Scanner;

public class Main {
    public static int gcd(int a, int b) {
        int temp = 0;
        while (b > 0) {
            temp = a;
            a = b;
            b = temp % b;
        }
        return a;
    }

    public static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int lcm = 1;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            lcm = lcm(lcm, arr[i]);
        }
        System.out.println(lcm);
    }
}