package Modell;

import javafx.beans.property.SimpleStringProperty;

public class Tcm {

    private final SimpleStringProperty tcm1;
    private final SimpleStringProperty tcm2;
    private final SimpleStringProperty tcm3;
    private final SimpleStringProperty tcm4;
    private final SimpleStringProperty tcm5;
    private final SimpleStringProperty tcm6;
    private final SimpleStringProperty tcm7;
    private final SimpleStringProperty tcm8;

    public  Tcm(String Tcm1, String Tcm2, String Tcm3, String Tcm4, String Tcm5, String Tcm6, String Tcm7, String Tcm8){
        this.tcm1 = new SimpleStringProperty(Tcm1);
        this.tcm2 = new SimpleStringProperty(Tcm2);
        this.tcm3 = new SimpleStringProperty(Tcm3);
        this.tcm4 = new SimpleStringProperty(Tcm4);
        this.tcm5 = new SimpleStringProperty(Tcm5);
        this.tcm6 = new SimpleStringProperty(Tcm6);
        this.tcm7 = new SimpleStringProperty(Tcm7);
        this.tcm8 = new SimpleStringProperty(Tcm8);
    }

    public  Tcm(){
        this.tcm1 = new SimpleStringProperty("");
        this.tcm2 = new SimpleStringProperty("");
        this.tcm3 = new SimpleStringProperty("");
        this.tcm4 = new SimpleStringProperty("");
        this.tcm5 = new SimpleStringProperty("");
        this.tcm6 = new SimpleStringProperty("");
        this.tcm7 = new SimpleStringProperty("");
        this.tcm8 = new SimpleStringProperty("");
    }

    public String getTcm1() {
        return tcm1.get();
    }

    public SimpleStringProperty tcm1Property() {
        return tcm1;
    }

    public void setTcm1(String tcm1) {
        this.tcm1.set(tcm1);
    }

    public String getTcm2() {
        return tcm2.get();
    }

    public SimpleStringProperty tcm2Property() {
        return tcm2;
    }

    public void setTcm2(String tcm2) {
        this.tcm2.set(tcm2);
    }

    public String getTcm3() {
        return tcm3.get();
    }

    public SimpleStringProperty tcm3Property() {
        return tcm3;
    }

    public void setTcm3(String tcm3) {
        this.tcm3.set(tcm3);
    }

    public String getTcm4() {
        return tcm4.get();
    }

    public SimpleStringProperty tcm4Property() {
        return tcm4;
    }

    public void setTcm4(String tcm4) {
        this.tcm4.set(tcm4);
    }

    public String getTcm5() {
        return tcm5.get();
    }

    public SimpleStringProperty tcm5Property() {
        return tcm5;
    }

    public void setTcm5(String tcm5) {
        this.tcm5.set(tcm5);
    }

    public String getTcm6() {
        return tcm6.get();
    }

    public SimpleStringProperty tcm6Property() {
        return tcm6;
    }

    public void setTcm6(String tcm6) {
        this.tcm6.set(tcm6);
    }

    public String getTcm7() {
        return tcm7.get();
    }

    public SimpleStringProperty tcm7Property() {
        return tcm7;
    }

    public void setTcm7(String tcm7) {
        this.tcm7.set(tcm7);
    }

    public String getTcm8() {
        return tcm8.get();
    }

    public SimpleStringProperty tcm8Property() {
        return tcm8;
    }

    public void setTcm8(String tcm8) {
        this.tcm8.set(tcm8);
    }
}
