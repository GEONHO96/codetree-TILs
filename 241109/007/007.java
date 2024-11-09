import java.util.Scanner;

class Program {
    String code;
    char point;
    int time;

    public Program(String code, char point, int time) {
        this.code = code;
        this.point = point;
        this.time = time;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String code = sc.next();
        char point = sc.next().charAt(0);
        int time = sc.nextInt();
        Program program = new Program(code, point, time);
        System.out.println("secret code : " + program.code);
        System.out.println("meeting point : " + program.point);
        System.out.println("time : " + program.time);
    }
}