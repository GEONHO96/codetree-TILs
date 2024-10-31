import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        int q = sc.nextInt();
        int length = str.length();

        for (int i = 0; i < q; i++) {
            int num = sc.nextInt();
            int k = 1;
            if (num == 1) {
                str = str.substring(k) + str.substring(0, k);
                System.out.println(str);
            }
            if (num == 2) {
                str = str.substring(length - k) + str.substring(0, length - k);
                System.out.println(str);
            }
            if (num == 3) {
                String str2 = "";
                for (int j = length - 1; j >= 0; j--) {
                    char ch = str.charAt(j);
                    str2 += ch;
                }
                System.out.println(str2);
            }
        }
    }
}