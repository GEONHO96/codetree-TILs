import java.util.Scanner;
import java.util.Arrays;

class Student implements Comparable<Student> {
    int height;
    int weight;
    int number;
    public Student(int height, int weight, int number) {
        this.height = height;
        this.weight = weight;
        this.number = number;
    }

    @Override
    public int compareTo(Student students) {
        if (this.height == students.height)
            return students.weight - this.weight;
        return students.height - this.height;
    }
};

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Student[] students = new Student[N];
        for (int i = 0; i < N; i++) {
            int height = sc.nextInt();
            int weight = sc.nextInt();
            int number = i + 1;
            students[i] = new Student(height, weight, number);
        }

        Arrays.sort(students);
        for (int i = 0; i < N; i++)
            System.out.println(students[i].height + " " + students[i].weight + " " + students[i].number);
    }
}