public class Student implements Comparable<Student>{
    private String firstName;
    private String lastName;
    private String fullName;

    public Student(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        fullName = firstName+" "+lastName;

    }

    public int compareTo(Student other){
        return this.getFullName().compareTo(other.getFullName());
    }

    public String getLastName(){
        return lastName;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getFullName(){
        return fullName;
    }
}
