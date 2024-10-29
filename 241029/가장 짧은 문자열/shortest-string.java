import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int min = 20;

        for (int i = 0; i < 3; i++) {
            String str = sc.next();
            int len = str.length();
            min = Math.min(min, len);
        }

        System.out.println(min);
    }
}