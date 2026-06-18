public class SurveyResult {
    private String respondentId;
    private String anwser;

    public SurveyResult(String respondentId, String anwser){
        this.respondentId = respondentId;
        this.anwser = anwser;
    }

    public String getRespondentId(){
        return respondentId;
    }

    public String getAnwser(){
        return anwser;
    }

    public String toString(){
        return String.format("Respondent [%s]: [%s]", getRespondentId(), getAnwser());
    }
}
