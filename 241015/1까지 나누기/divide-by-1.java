import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 1;
        while (n > 0) {
            n /= a;
            a++;
        }
        System.out.println(a - 1);
    }
}