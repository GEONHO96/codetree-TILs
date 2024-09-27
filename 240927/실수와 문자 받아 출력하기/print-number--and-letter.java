import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char ch = str.charAt(0);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        System.out.println(ch);
        System.out.printf("%.2f\n", a);
        System.out.printf("%.2f\n", b);
    }
}