public class Student {
    private String name;
    private String studentID;

    public Student(String name, String studentID){
        this.name = name;
        this.studentID = studentID;
    }

    public boolean isKEAStudent(){
        return studentID.substring(0,3).contains("KEA");
    }

    public String getStudentID(){
        return studentID;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public String toString(){
        return String.format("name: %s ID: %s", name, studentID);
    }
}
