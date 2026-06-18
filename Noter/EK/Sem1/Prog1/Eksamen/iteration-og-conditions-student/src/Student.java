public class Student {
    private String name;
    private int grade;

    public Student(String name, int grade){
        this.name = name;
        this.grade = grade;
    }

    public boolean isGradeUnder4(){
        return this.grade < 4;
    }

    public int getGrade(){
        return this.grade;
    }


    public String toString(){
        return String.format("%s", this.name);
    }

}
