import java.util.Scanner;
import java.util.Arrays;

class Student implements Comparable<Student> {
    String name;
    int subject1, subject2, subject3;

    public Student(String name, int subject1, int subject2, int subject3) {
        this.name = name;
        this.subject1 = subject1;
        this.subject2 = subject2;
        this.subject3 = subject3;
    }

    @Override
    public int compareTo(Student students) {
        return (this.subject1 + this.subject2 + this.subject3) - (students.subject1 + students.subject2 + students.subject3);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Student[] students = new Student[n];
        for (int i = 0; i < n; i++) {
            String name = sc.next();
            int subject1 = sc.nextInt();
            int subject2 = sc.nextInt();
            int subject3 = sc.nextInt();
            students[i] = new Student(name, subject1, subject2, subject3);
        }

        Arrays.sort(students);

        for (int i = 0; i < n; i++)
            System.out.println(students[i].name + " " + students[i].subject1 + " " + students[i].subject2 + " " + students[i].subject3);
    }
}