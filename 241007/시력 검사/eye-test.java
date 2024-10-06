import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        if (a >= 1.0 && b >= 1.0) System.out.println("High");
        if ((a >= 1.0 && b < 1.0 && b >= 0.5) || (b >= 1.0 && a < 1.0 && a >= 0.5)) System.out.println("Middle");
        if (a >= 0.5 && a < 1.0 && b >= 0.5 && b < 1.0) System.out.println("Miiddle");
        if (a < 0.5 || b < 0.5) System.out.println("Low");
    }
}