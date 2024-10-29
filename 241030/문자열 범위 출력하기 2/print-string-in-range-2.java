import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();
        if (n < str.length()) {
            for (int i = str.length() - 1; i > str.length() - 1 - n; i--) {
                char ch = str.charAt(i);
                System.out.print(ch);
            }
        } else {
            for (int i = str.length() - 1; i >= 0; i++) {
                char ch1 = str.charAt(i);
                System.out.print(ch1);
            }
        }
    }
}