import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int length = str.length();
        str = str.substring(0, 2) + str.substring(3, length - 2) + str.substring(length -1);
        System.out.println(str);
    }
}