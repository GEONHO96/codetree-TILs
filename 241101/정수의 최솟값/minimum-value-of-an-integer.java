import java.util.Scanner;

public class Main {

    public static int minNum(int a, int b, int c) {
        int min = 100;
        if (a >= b) {
            min = b;
            if (b >= c) {
                min = c;
            }
        }
        if (b >= c) {
            min = c;
            if (c >= a) {
                min = a;
            }
        }
        if (c >= a) {
            min = a;
            if (a >= b) {
                min = b;
            }
        }
        return min;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(minNum(a, b, c));
    }
}