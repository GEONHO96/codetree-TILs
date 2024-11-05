import java.util.Scanner;

public class Main {

    public static int alphabets(String str) {
        char[] ch = new char[100];
        int cnt = 1;
        for (int i = 0; i < str.length(); i++) {
            ch[i] = str.charAt(i);
        }
        for (int i = 0; i < str.length(); i++) {
            if (ch[i] != ch[i + 1]) {
                cnt++;
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        if (alphabets(str) > 2) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}