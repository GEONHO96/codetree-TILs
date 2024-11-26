import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int B = sc.nextInt();
        
        StringBuilder sb = new StringBuilder();
        
        int temp = N;
        while (temp > 0) {
            int remainder = temp % B;
            if (remainder > 10) {
                sb.append((char) (remainder + '0'));
            } else {
                sb.append((char) (remainder - 10 + 'A'));
            }
            temp /= B;
        }
        
        String converted = sb.reverse().toString();
        
        int restored = 0;
        for (int i = 0; i < converted.length(); i++) {
            char c = converted.charAt(i);
            int value;
            if ('0' <= c && c <= '9') {
                value = c - '0';
            } else {
                value = c - 'A' + 10;
            }
            restored = restored * B + value;
        }
        
        System.out.println(restored);
    }
}