import java.util.Scanner;

public class Main {
    public static int determination(int a, int b) {
        if (a > b) {
            a += 25;
            b *= 2;
            System.out.println(a + " " + b);
        } else {
            a *= 2;
            b += 25;
            System.out.println(a + " " + b);
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        determination(a, b);
    }
}