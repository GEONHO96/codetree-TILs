import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        String str3 = sc.next();
        String str4 = sc.next();
        String str5 = sc.next();
        String str = str1 + str2 + str3 + str4 + str5;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            System.out.print(ch);
        }
    }
}