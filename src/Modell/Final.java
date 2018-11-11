package Modell;

import javafx.beans.property.SimpleStringProperty;

public class Final {

    private final SimpleStringProperty date;
    private final SimpleStringProperty assessment;
    private final SimpleStringProperty result;

    public  Final(String date, String assasment, String result){
        this.date = new SimpleStringProperty(date);
        this.assessment = new SimpleStringProperty(assasment);
        this.result = new SimpleStringProperty(result);
    }

    public  Final(){
        this.date = new SimpleStringProperty("");
        this.assessment = new SimpleStringProperty("");
        this.result = new SimpleStringProperty("");
    }

    public String getDate() {
        return date.get();
    }

    public SimpleStringProperty dateProperty() {
        return date;
    }

    public void setDate(String date) {
        this.date.set(date);
    }

    public String getAssessment() {
        return assessment.get();
    }

    public SimpleStringProperty assessmentProperty() {
        return assessment;
    }

    public void setAssessment(String assessment) {
        this.assessment.set(assessment);
    }

    public String getResult() {
        return result.get();
    }

    public SimpleStringProperty resultProperty() {
        return result;
    }

    public void setResult(String result) {
        this.result.set(result);
    }
}
