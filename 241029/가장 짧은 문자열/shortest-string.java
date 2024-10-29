import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = 0;
        int min = 20;

        for (int i = 0; i < 3; i++) {
            String str = sc.next();
            int len = str.length();
            max = Math.max(max, len);
            min = Math.min(min, len);
        }

        System.out.println(max - min);
    }
}