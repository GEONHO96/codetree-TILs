import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char ch = sc.next().charAt(0);
        int cnt = str.length();
        for (int i = 0; i < str.length(); i++) {
            if (ch == str.charAt(i)) break;
            cnt--;
        }
        if (cnt == 0) System.out.println("No");
        else System.out.println(str.length() - cnt);
    }
}