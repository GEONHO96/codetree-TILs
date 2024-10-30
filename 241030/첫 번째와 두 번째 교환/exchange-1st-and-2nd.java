import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int length = str.length();
        char[] ch = new char[length];
        char ch1 = str.charAt(0);
        char ch2 = str.charAt(1);
        for (int i = 0; i < length; i++) {
            ch[i] = str.charAt(i);
            if (ch[i] == ch2) ch[i] = ch1;
            else if (ch[i] == ch1) ch[i] = ch2;
        }
        for (int i = 0; i < length; i++) {
            System.out.print(ch[i]);
        }
    }
}