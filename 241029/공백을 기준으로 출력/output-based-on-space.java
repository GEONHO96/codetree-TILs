import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        String str = str1 + str2;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isSpaceChar(ch)) {
                continue;
            }
            System.out.print(ch);
        }
    }
}