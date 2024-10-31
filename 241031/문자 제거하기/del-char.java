import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int length = str.length();
        while (length > 1) {
            int num = sc.nextInt();
            if (num <= length) {
                str = str.substring(0, num) + str.substring(num + 1);
                length--;
            } else {
                str = str.substring(0, length - 1);
            }
            System.out.println(str);
        }
    }
}