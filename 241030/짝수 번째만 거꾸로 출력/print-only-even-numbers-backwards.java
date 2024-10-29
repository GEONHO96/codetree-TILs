import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] ch = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            ch[i] = str.charAt(i);
        }
        if (str.length() % 2 == 0) {
            for (int i = str.length() - 1; i >= 0; i -= 2) {
                System.out.print(ch[i]);
            }
        } else {
            for (int i = str.length() - 2; i >= 0; i -= 2) {
                System.out.print(ch[i]);
            }
        }
    }
}