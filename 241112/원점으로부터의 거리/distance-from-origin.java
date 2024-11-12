import java.util.Arrays;
import java.util.Scanner;

class Coordinate implements Comparable<Coordinate> {
    int x;
    int y;
    int manhattan;
    int number;
    public Coordinate(int x, int y, int manhattan, int number) {
        this.x = x;
        this.y = y;
        this.manhattan = manhattan;
        this.number = number;
    }
    @Override
    public int compareTo(Coordinate coordinate) {
        return this.manhattan - coordinate.manhattan;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Coordinate[] coordinate = new Coordinate[N];
        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int manhattan = Math.abs(x) + Math.abs(y);
            int number = i + 1;
            coordinate[i] = new Coordinate(x, y, manhattan, number);
        }
        Arrays.sort(coordinate);
        for (int i = 0; i < N; i++)
            System.out.println(coordinate[i].number);
    }
}