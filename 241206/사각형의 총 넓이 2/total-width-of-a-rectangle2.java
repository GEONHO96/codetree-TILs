import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int area = 0;
        boolean[][] visited = new boolean[201][201];
        for (int i = 0; i < N; i++) {
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();
            for (int j = x1; j < x2; j++) {
                for (int k = y1; k < y2; k++) {
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