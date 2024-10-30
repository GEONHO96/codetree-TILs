import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int length = str.length();
        char[] ch = new char[length + 1];
        int cnt1 = 0;
        int cnt2 = 0;

        for (int i = 0; i < length; i++) {
            ch[i] = str.charAt(i);
        }

        for (int i = 0; i < length; i++) {
            if (ch[i] == 'e' && ch[i + 1] == 'e') {
                cnt1++;
            }
        }

        for (int i = 0; i < length; i++) {
            if (ch[i] == 'e' && ch[i + 1] == 'b') {
                cnt2++;
            }
        }

        System.out.printf("%d %d", cnt1, cnt2);
    }
}