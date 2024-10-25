import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] ch = new char[10];
        String str = "";
        for (int i = 0; i < 10; i++) {
            ch[i] = sc.next().charAt(0);
        }
        str = ch[1] + " " + ch[4] + " " + ch[7];
        System.out.print(str);
    }
}