import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<SurveyResult> surveyResultList = new ArrayList<>();

        surveyResultList.add(new SurveyResult("MAFI", "Enig"));
        surveyResultList.add(new SurveyResult("BAFI", "Uenig"));
        surveyResultList.add(new SurveyResult("PAFI", "Enig"));
        surveyResultList.add(new SurveyResult("LAFI", "Enig"));

        writeResults(surveyResultList);
        readResults(surveyResultList);

        for (SurveyResult result : surveyResultList){
            System.out.println(result);
        }
    }

    private static void readResults(List<SurveyResult> surveyResultList) {
        File file = new File("Anwsers.csv");
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()){
                String line = scanner.nextLine();
                String[] data = line.split(",");

                String respondentID = data[0];
                String anwser = data[1];

                surveyResultList.add(new SurveyResult(respondentID, anwser));
            }
        } catch (FileNotFoundException e){
            System.out.println("Fejl");
        }
    }

    private static void writeResults(List<SurveyResult> surveyResultList) {
        try {
            Writer writer = new FileWriter("Anwsers.csv");
            for (SurveyResult result : surveyResultList){
                writer.write(result.getRespondentId() + "," + result.getAnwser() + "\n");
            }
            writer.close();
        } catch (IOException e) {
            System.out.println("Fejl");
        }
    }
}
