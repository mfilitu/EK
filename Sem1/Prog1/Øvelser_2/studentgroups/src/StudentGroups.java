public class StudentGroups {
    public static void main(String[] args){
        int totalStudents = 40;
        int groupSize = 4;
        int groups = totalStudents/groupSize;
        int remainingStudents = totalStudents%groupSize;

        System.out.println("Hvor mange grupper kan vi lave?: " + groups);
        System.out.println("remaining "+ remainingStudents);
    }
}
