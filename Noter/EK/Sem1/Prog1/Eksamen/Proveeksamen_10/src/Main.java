import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        List<HogwartsStudent> hogwartsStudentList = new ArrayList<>();

        HogwartsStudent mateusz = new HogwartsStudent("mateusz", "Filipowski");
        HogwartsStudent mads = new HogwartsStudent("mads", "Bodilsen");
        HogwartsStudent magnus = new HogwartsStudent("magnus", "Andersen");

        hogwartsStudentList.add(mateusz);
        hogwartsStudentList.add(mads);
        hogwartsStudentList.add(magnus);

        System.out.println(mateusz.getFirstName());
        System.out.println(mateusz.getHouse());
        try {
            mateusz.setHouse("lol");
        } catch (Exception e) {
            System.out.println("Error");
        }

        try {
            mateusz.setHouse("Griffindor");
        } catch (Exception e) {
            System.out.println("Error");
        }

        System.out.println(mateusz.getHouse());


        for (HogwartsStudent stud: hogwartsStudentList){
            System.out.println(stud);
        }

        Collections.sort(hogwartsStudentList, new LastNameCompatator());
        for (HogwartsStudent stud: hogwartsStudentList){
            System.out.println(stud);
        }
    }
}
