import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char ch = str.charAt(i);
            if (ch == str.charAt(1)) ch = str.charAt(0);
            if (ch == str.charAt(0)) ch = str.charAt(1);
            System.out.print(ch);
        }
    }
}