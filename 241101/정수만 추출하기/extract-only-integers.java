import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        int length1 = str1.length();
        int length2 = str2.length();
        String str3 = "";
        String str4 = "";
        for (int i = 0; i < length1; i++) {
            if (str1.charAt(i) >= '0' && str1.charAt(i) <= '9') {
                str3 += str1.charAt(i);
            }
            else {
                break;
            }
        }
        for (int i = 0; i < length2; i++) {
            if (str2.charAt(i) >= '0' && str2.charAt(i) <= '9') {
                str4 += str2.charAt(i);
            }
            else {
                break;
            }
        }
        System.out.println(Integer.parseInt(str3) + Integer.parseInt(str4));
    }
}