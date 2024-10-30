import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char ch1 = str.charAt(1);
        char ch2 = str.charAt(0);
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == ch1) {
                ch = ch2;
                System.out.print(ch);
            } else {
                System.out.print(ch);
            }
        }
    }
}