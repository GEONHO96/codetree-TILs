import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        boolean[][] visited = new boolean[101][101];
        int area = 0;
        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            for (int j = x; j < x + 8; j++) {
                for (int k = y; k < y + 8; k++) {
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