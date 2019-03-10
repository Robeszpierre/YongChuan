package Modell;

import javafx.beans.property.SimpleStringProperty;

public class Psyche {

    private final SimpleStringProperty psyche1;
    private final SimpleStringProperty psyche2;
    private final SimpleStringProperty psyche3;

    public Psyche(String Psyche1, String Psyche2, String Psyche3){
        this.psyche1 = new SimpleStringProperty(Psyche1);
        this.psyche2 = new SimpleStringProperty(Psyche2);
        this.psyche3 = new SimpleStringProperty(Psyche3);
    }

    public Psyche(){
        this.psyche1 = new SimpleStringProperty("");
        this.psyche2 = new SimpleStringProperty("");
        this.psyche3 = new SimpleStringProperty("");
    }

    public String getPsyche1() {
        return psyche1.get();
    }

    public SimpleStringProperty psyche1Property() {
        return psyche1;
    }

    public void setPsyche1(String psyche1) {
        this.psyche1.set(psyche1);
    }

    public String getPsyche2() {
        return psyche2.get();
    }

    public SimpleStringProperty psyche2Property() {
        return psyche2;
    }

    public void setPsyche2(String psyche2) {
        this.psyche2.set(psyche2);
    }

    public String getPsyche3() {
        return psyche3.get();
    }

    public SimpleStringProperty psyche3Property() {
        return psyche3;
    }

    public void setPsyche3(String psyche3) {
        this.psyche3.set(psyche3);
    }
}
