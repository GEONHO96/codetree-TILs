import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        String C = A + B;
        String D = B + A;
        if (C.equals(D)) System.out.println("true");
        else System.out.println("false");
    }
}