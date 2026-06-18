import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();

        Student mateusz = new Student("mateusz", "KEAMAFI");

        studentList.add(new Student("mads", "KEAMADS"));
        studentList.add(new Student("mateusz", "KEAMATE"));
        studentList.add(new Student("Test", "KEAANNA"));

        System.out.println(findStudentByID(studentList, "KEAMADS"));

        changeName(studentList, "KEAMADS", "Adam");


        deleteTest(studentList);

        for (Student student : studentList){
            System.out.println(student);
        }
    }

    public static Student findStudentByID(List<Student> studentList, String ID){
        for (Student student : studentList){
            if (student.getStudentID().contentEquals(ID)){
                return student;
            }
        }
        return null;
    }

    public static void changeName(List<Student> studentList, String ID, String name){
        for (Student student : studentList){
            if (student.getStudentID().contentEquals(ID)){
                student.setName(name);
            }
        }
    }

    public static void deleteTest(List<Student> studentList){
        studentList.removeIf(student -> student.getName().startsWith("Test"));
    }

}
