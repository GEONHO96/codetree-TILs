import java.util.Scanner;

public class Main {

    public static int power(int a, int b) {
        int x = 1;
        for (int i = 1; i <= b; i++) {
            x *= a;
        }
        return x;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(power(a, b));
    }
}