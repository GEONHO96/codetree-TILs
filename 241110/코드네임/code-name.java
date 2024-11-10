import java.util.Scanner;

class Agent {
    char codeName;
    int score;

    public Agent(char codeName, int score) {
        this.codeName = codeName;
        this.score = score;
    }
};

public class Main {
    public static void main(String[] args) {
        int min = 100;
        Scanner sc = new Scanner(System.in);
        Agent[] agents = new Agent[5];
        for (int i = 0; i < 5; i++) {
            char codeName = sc.next().charAt(0);
            int score = sc.nextInt();
            agents[i] = new Agent(codeName, score);
            if (min > score) {
                min = score;
            }
        }
        for (int i = 0; i < 5; i++) {
            if (agents[i].score == min) {
                System.out.print(agents[i].codeName + " ");
                System.out.print(agents[i].score);
            }
        }
    }
}