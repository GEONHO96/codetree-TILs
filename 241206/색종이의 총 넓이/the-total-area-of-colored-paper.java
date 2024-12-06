import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        boolean[][] visited = new boolean[201][201];
        int area = 0;
        int offset = 100;
        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            for (int j = x + offset; j < x + 8 + offset; j++) {
                for (int k = y + offset; k < y + 8 + offset; k++) {
                    if (!visited[j][k]) {
                        visited[j][k] = true;
                        area++;
                    }
                }
            }
        }
        System.out.println(area);
    }
}