import java.util.Random;

public class ExamQuestion {
    private int number;
    private char grade;

    public ExamQuestion(int number){
        this.number = number;
        generateGrade();
    }

    public void generateGrade(){
        char[] grades = {'A','B','C','D','E','F'};
        Random random = new Random();
        grade = grades[random.nextInt(grades.length)];
    }

    public String toString(){
        return String.format("number: %s grade: %s", number, grade);
    }
}
