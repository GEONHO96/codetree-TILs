import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] str = new String[n];
        String str2 = "";
        for (int i = 0; i < n; i++) {
            str[i] = sc.next();
            str2 += str[i];
        }
        char[] ch = new char[str2.length()];
        for (int i = 0; i < str2.length(); i++) {
            ch[i] = str2.charAt(i);
            if (i % 5 != 4) System.out.print(ch[i]);
            else System.out.println(ch[i]);
        }
    }
}