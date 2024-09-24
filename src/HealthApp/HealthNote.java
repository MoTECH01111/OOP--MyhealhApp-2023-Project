package HealthApp;
import java.io.Serializable;

/**
 *
 * @author morrisono
 */

public class HealthNote implements Serializable {
    
    private String question;
    private String answer;
    private String questNum;

    
      
    public HealthNote(){
        this.question= " "; // Set default date to current date
        this.answer = " ";
        this.questNum = " ";
      
    }

    
    
    public HealthNote(String question, String answer,String questNum) {
        this.question = question;
        this.answer = answer;
        this.questNum = questNum;
    }

    public void setQuestNum(String questNum) {
        this.questNum = questNum;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getQuestNum() {
        return questNum;
    }

    
    public String getQuestion() {
        return question;
    }

    public String getAnswer() {
        return answer;
    }  
    
    public String getNotes(){
        return " Ref No "+questNum+ " Question: "+question+" Answer: "+answer;
    }
}
