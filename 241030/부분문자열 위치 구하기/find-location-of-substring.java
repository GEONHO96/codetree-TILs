import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        int length1 = str1.length();
        int length2 = str2.length();
        int cnt = -1;
        for (int i = 0; i < length1; i++) {
            if (i + length2 <= length1) {
                if ((str1.substring(i, i + length2)).equals(str2.substring(0, length2))) {
                    cnt = i;
                    break;
                }
            }
        }
        if (cnt == -1) {
            System.out.println(-1);
        } else {
            System.out.println(cnt);
        }
    }
}