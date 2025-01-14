import java.util.Scanner;

public class Main {
    public static final int MAX_X = 100;
    public static final int MAX_N = 100;

    public static int n;
    public static int[] a = new int[MAX_N + 1];
    public static int[] b = new int[MAX_N + 1];

    public static int[] blocks = new int[MAX_X + 1];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 입력
        n = sc.nextInt();

        for(int i = 1; i <= n; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
        }

        // 블럭을 특정 구간에 쌓아줍니다.
        for(int i = 1; i <= n; i++)
            for(int j = a[i]; j <= b[i]; j++)
                blocks[j]++;

        // 최댓값을 구합니다.
        int max = 0;
        for(int i = 1; i <= 100; i++)
            if(blocks[i] > max)
                max = blocks[i];

        System.out.print(max);
    }
}