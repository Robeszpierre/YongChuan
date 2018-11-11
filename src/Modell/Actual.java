package Modell;

import javafx.beans.property.SimpleStringProperty;

public class Actual {

    private final SimpleStringProperty actual1;
    private final SimpleStringProperty actual2;
    private final SimpleStringProperty actual3;
    private final SimpleStringProperty actual4;
    private final SimpleStringProperty actual5;

    public  Actual(String Actual1, String Actual2, String Actual3, String Actual4, String Actual5){
        this.actual1 = new SimpleStringProperty(Actual1);
        this.actual2 = new SimpleStringProperty(Actual2);
        this.actual3 = new SimpleStringProperty(Actual3);
        this.actual4 = new SimpleStringProperty(Actual4);
        this.actual5 = new SimpleStringProperty(Actual5);
    }

    public  Actual(){
        this.actual1 = new SimpleStringProperty("");
        this.actual2 = new SimpleStringProperty("");
        this.actual3 = new SimpleStringProperty("");
        this.actual4 = new SimpleStringProperty("");
        this.actual5 = new SimpleStringProperty("");
    }

    public String getActual1() {
        return actual1.get();
    }

    public SimpleStringProperty actual1Property() {
        return actual1;
    }

    public void setActual1(String actual1) {
        this.actual1.set(actual1);
    }

    public String getActual2() {
        return actual2.get();
    }

    public SimpleStringProperty actual2Property() {
        return actual2;
    }

    public void setActual2(String actual2) {
        this.actual2.set(actual2);
    }

    public String getActual3() {
        return actual3.get();
    }

    public SimpleStringProperty actual3Property() {
        return actual3;
    }

    public void setActual3(String actual3) {
        this.actual3.set(actual3);
    }

    public String getActual4() {
        return actual4.get();
    }

    public SimpleStringProperty actual4Property() {
        return actual4;
    }

    public void setActual4(String actual4) {
        this.actual4.set(actual4);
    }

    public String getActual5() {
        return actual5.get();
    }

    public SimpleStringProperty actual5Property() {
        return actual5;
    }

    public void setActual5(String actual5) {
        this.actual5.set(actual5);
    }
}
