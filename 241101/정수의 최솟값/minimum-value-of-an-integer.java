import java.util.Scanner;

public class Main {

    public static int minNum(int a, int b, int c) {
        int min = a;
        if (a >= b) {
            min = b;
            if (b >= c) {
                min = c;
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