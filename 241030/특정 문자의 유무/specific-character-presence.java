import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] ch = new char[str.length() + 1];
        boolean exists1 = false;
        boolean exists2 = false;

        for (int i = 0; i < str.length(); i++) {
            ch[i] = str.charAt(i);
        }

        for (int i = 0; i <= str.length(); i++) {
            if (ch[i] == 'e' && ch[i + 1] == 'e') {
                exists1 = true;
            }
        }

        for (int i = 0; i <= str.length(); i++) {
            if (ch[i] == 'a' && ch[i + 1] == 'b') {
                exists2 = false;
            }
        }

        if (exists1 == true) {
            System.out.print("Yes ");
        } else {
            System.out.print("No ");
        }

        if (exists2 == true) {
            System.out.print("Yes ");
        } else {
            System.out.print("No ");
        }
    }
}