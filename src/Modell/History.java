package Modell;

import javafx.beans.property.SimpleStringProperty;

public class History {

    private final SimpleStringProperty history1;
    private final SimpleStringProperty history2;
    private final SimpleStringProperty history3;
    private final SimpleStringProperty history4;
    private final SimpleStringProperty history5;
    private final SimpleStringProperty history6;
    private final SimpleStringProperty history7;
    private final SimpleStringProperty history8;
    private final SimpleStringProperty history9;

    public  History(String History1, String History2, String History3, String History4, String History5, String History6, String History7, String History8, String History9){
        this.history1 = new SimpleStringProperty(History1);
        this.history2 = new SimpleStringProperty(History2);
        this.history3 = new SimpleStringProperty(History3);
        this.history4 = new SimpleStringProperty(History4);
        this.history5 = new SimpleStringProperty(History5);
        this.history6 = new SimpleStringProperty(History6);
        this.history7 = new SimpleStringProperty(History7);
        this.history8 = new SimpleStringProperty(History8);
        this.history9 = new SimpleStringProperty(History9);
    }

    public  History(){
        this.history1 = new SimpleStringProperty("");
        this.history2 = new SimpleStringProperty("");
        this.history3 = new SimpleStringProperty("");
        this.history4 = new SimpleStringProperty("");
        this.history5 = new SimpleStringProperty("");
        this.history6 = new SimpleStringProperty("");
        this.history7 = new SimpleStringProperty("");
        this.history8 = new SimpleStringProperty("");
        this.history9 = new SimpleStringProperty("");
    }

    public String getHistory1() {
        return history1.get();
    }

    public SimpleStringProperty history1Property() {
        return history1;
    }

    public void setHistory1(String history1) {
        this.history1.set(history1);
    }

    public String getHistory2() {
        return history2.get();
    }

    public SimpleStringProperty history2Property() {
        return history2;
    }

    public void setHistory2(String history2) {
        this.history2.set(history2);
    }

    public String getHistory3() {
        return history3.get();
    }

    public SimpleStringProperty history3Property() {
        return history3;
    }

    public void setHistory3(String history3) {
        this.history3.set(history3);
    }

    public String getHistory4() {
        return history4.get();
    }

    public SimpleStringProperty history4Property() {
        return history4;
    }

    public void setHistory4(String history4) {
        this.history4.set(history4);
    }

    public String getHistory5() {
        return history5.get();
    }

    public SimpleStringProperty history5Property() {
        return history5;
    }

    public void setHistory5(String history5) {
        this.history5.set(history5);
    }

    public String getHistory6() {
        return history6.get();
    }

    public SimpleStringProperty history6Property() {
        return history6;
    }

    public void setHistory6(String history6) {
        this.history6.set(history6);
    }

    public String getHistory7() {
        return history7.get();
    }

    public SimpleStringProperty history7Property() {
        return history7;
    }

    public void setHistory7(String history7) {
        this.history7.set(history7);
    }

    public String getHistory8() {
        return history8.get();
    }

    public SimpleStringProperty history8Property() {
        return history8;
    }

    public void setHistory8(String history8) {
        this.history8.set(history8);
    }

    public String getHistory9() {
        return history9.get();
    }

    public SimpleStringProperty history9Property() {
        return history9;
    }

    public void setHistory9(String history9) {
        this.history9.set(history9);
    }
}
