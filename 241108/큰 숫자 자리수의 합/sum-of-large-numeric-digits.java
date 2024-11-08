import java.util.Scanner;

public class Main {

    public static int digitSum(int n) {
        if (n == 0)
            return 0;
        return digitSum(n / 10) + n % 10;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = A * B * C;
        System.out.println(digitSum(D));
    }
}