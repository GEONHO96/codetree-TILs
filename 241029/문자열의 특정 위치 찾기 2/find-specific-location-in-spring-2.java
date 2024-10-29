import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = new String[]{ "apple", "banana", "grape", "blueberry", "orange" };
        char ch = sc.next().charAt(0);
        int cnt = 0;
        for (int i = 0; i < arr.length; i++) {
            if (ch == arr[i].charAt(2) || ch == arr[i].charAt(3)) {
                cnt++;
                System.out.println(arr[i]);
            }
        }
        System.out.println(cnt);
    }
}