package Modell;

import javafx.beans.property.SimpleStringProperty;

public class Treatment {

    private final SimpleStringProperty date;
    private final SimpleStringProperty treatment1;
    private final SimpleStringProperty treatment2;
    private final SimpleStringProperty treatment3;
    private final SimpleStringProperty treatment4;
    private final SimpleStringProperty treatment5;
    private final SimpleStringProperty treatment6;

    public  Treatment(String date, String treatment1, String treatment2, String treatment3, String treatment4, String treatment5, String treatment6){
        this.date = new SimpleStringProperty(date);
        this.treatment1 = new SimpleStringProperty(treatment1);
        this.treatment2 = new SimpleStringProperty(treatment2);
        this.treatment3 = new SimpleStringProperty(treatment3);
        this.treatment4 = new SimpleStringProperty(treatment4);
        this.treatment5 = new SimpleStringProperty(treatment5);
        this.treatment6 = new SimpleStringProperty(treatment6);
    }

    public  Treatment(){
        this.date = new SimpleStringProperty("");
        this.treatment1 = new SimpleStringProperty("");
        this.treatment2 = new SimpleStringProperty("");
        this.treatment3 = new SimpleStringProperty("");
        this.treatment4 = new SimpleStringProperty("");
        this.treatment5 = new SimpleStringProperty("");
        this.treatment6 = new SimpleStringProperty("");
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

    public String getTreatment1() {
        return treatment1.get();
    }

    public SimpleStringProperty treatment1Property() {
        return treatment1;
    }

    public void setTreatment1(String treatment1) {
        this.treatment1.set(treatment1);
    }

    public String getTreatment2() {
        return treatment2.get();
    }

    public SimpleStringProperty treatment2Property() {
        return treatment2;
    }

    public void setTreatment2(String treatment2) {
        this.treatment2.set(treatment2);
    }

    public String getTreatment3() {
        return treatment3.get();
    }

    public SimpleStringProperty treatment3Property() {
        return treatment3;
    }

    public void setTreatment3(String treatment3) {
        this.treatment3.set(treatment3);
    }

    public String getTreatment4() {
        return treatment4.get();
    }

    public SimpleStringProperty treatment4Property() {
        return treatment4;
    }

    public void setTreatment4(String treatment4) {
        this.treatment4.set(treatment4);
    }

    public String getTreatment5() {
        return treatment5.get();
    }

    public SimpleStringProperty treatment5Property() {
        return treatment5;
    }

    public void setTreatment5(String treatment5) {
        this.treatment5.set(treatment5);
    }

    public String getTreatment6() {
        return treatment6.get();
    }

    public SimpleStringProperty treatment6Property() {
        return treatment6;
    }

    public void setTreatment6(String treatment6) {
        this.treatment6.set(treatment6);
    }
}
