import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int L = str.length();
        for (int i = 0; i < L; i++) {
            str = str.substring(L - i) + str.substring(0, L - i);
            System.out.println(str);
        }
    }
}