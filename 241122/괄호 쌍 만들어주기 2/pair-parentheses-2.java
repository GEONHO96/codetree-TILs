import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = str.length();
        int cnt = 0;
        for (int i = 0; i < n - 1; i++) {
            if (str.charAt(i) == '(' && str.charAt(i + 1) == '(') {
                for (int j = i + 2; j < n - 1; j++) {
                    if (str.charAt(j) == ')' && str.charAt(j + 1) == ')') {
                        cnt++;
                    }
                }
            }
        }
        System.out.println(cnt);
    }
}


