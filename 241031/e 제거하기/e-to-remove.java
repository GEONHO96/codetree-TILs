import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (str.charAt(i) == 'e') {
                str = str.substring(0, i) + str.substring(i + 1);
                break;
            }
        }
        System.out.println(str);
    }
}