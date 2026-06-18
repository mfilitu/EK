import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<ExamQuestion> examQuestionList = new ArrayList<>();
        for(int i = 1; i <= 14; i++){
            examQuestionList.add(new ExamQuestion(i));
        }

        for (ExamQuestion question : examQuestionList){
            System.out.println(question);
        }

        File file = new File("questions.txt");
        try {
            Writer writer = new FileWriter(file);
            for (ExamQuestion question : examQuestionList){
                writer.write(question.toString() + "\n");
            }
            writer.close();
        } catch (IOException e) {
            System.out.println("fejl");
        }


    }

}
