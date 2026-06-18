import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();

        Student mateusz = new Student("Mateusz", 4);
        Student bo = new Student("Bo", 2);
        Student bob = new Student("Bob", 0);
        Student bobby = new Student("Bobby", 12);
        Student bodil = new Student("Bodil", 7);

        studentList.add(mateusz);
        studentList.add(bo);
        studentList.add(bob);
        studentList.add(bobby);
        studentList.add(bodil);

        System.out.println(allStudentsUnder4(studentList));
        System.out.println(studentsBelowAverage(studentList));
    }

    public static List<Student> allStudentsUnder4(List<Student> studentList) {
        ArrayList<Student> studentsUnder4 = new ArrayList<>();
        for (Student student : studentList) {
            if (student.isGradeUnder4()) {
                studentsUnder4.add(student);
            }
        }
        return studentsUnder4;
    }

    public static List<Student> studentsBelowAverage(List<Student> studentList) {
        ArrayList<Student> studentsBelowAverage = new ArrayList<>();
        double average = 0;

        for (Student student : studentList) {
            average += (double) student.getGrade() / studentList.size();
        }

        for (Student student : studentList) {
            if (student.getGrade() < average) {
                studentsBelowAverage.add(student);
            }
        }

        return studentsBelowAverage;
    }
}
