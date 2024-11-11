import java.util.Scanner;
import java.util.Arrays;

class Student implements Comparable<Student> {
    String name;
    int kor, eng, math;

    public Student(String name, int kor, int eng, int math) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    @Override
    public int compareTo(Student students) {
        if (this.kor == students.kor) {
            if (this.eng == students.eng) {
                return students.math - this.math;
            }
            return students.eng - this.eng;
        }
        return students.kor - this.kor;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Student[] students = new Student[n];
        for(int i = 0; i < n; i++) {
            String name = sc.next();
            int kor = sc.nextInt();
            int eng = sc.nextInt();
            int math = sc.nextInt();
            students[i] = new Student(name, kor, eng, math);
        }

        Arrays.sort(students);

        for(int i = 0; i < n; i++)
            System.out.println(students[i].name + " " + students[i].kor + " " + students[i].eng + " " + students[i].math);

    }
}