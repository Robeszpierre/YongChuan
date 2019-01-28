package Modell;

import javafx.beans.property.SimpleStringProperty;

public class Symptom {

    private final SimpleStringProperty patientID;
    private final SimpleStringProperty name;
    private final SimpleStringProperty location;
    private final SimpleStringProperty type;
    private boolean important;

    public Symptom(int patientID, String name, String location, int type, boolean important){
        this.patientID = new SimpleStringProperty(Integer.toString(patientID));
        this.name = new SimpleStringProperty(name);
        this.location = new SimpleStringProperty(location);
        this.type = new SimpleStringProperty(Integer.toString(type));
        this.important = new Boolean(important);
    }

    public Symptom(int patientID, String name, String location, int type){
        this.patientID = new SimpleStringProperty(Integer.toString(patientID));
        this.name = new SimpleStringProperty(name);
        this.location = new SimpleStringProperty(location);
        this.type = new SimpleStringProperty(Integer.toString(type));
        this.important = false;
    }

    public Symptom(){
        this.patientID = new SimpleStringProperty("");
        this.name = new SimpleStringProperty("");
        this.location = new SimpleStringProperty("");
        this.type = new SimpleStringProperty("");
        this.important = false;
    }

    public String getPatientID() {
        return patientID.get();
    }

    public SimpleStringProperty patientIDProperty() {
        return patientID;
    }

    public void setPatientID(String patientID) {
        this.patientID.set(patientID);
    }

    public String getName() {
        return name.get();
    }

    public SimpleStringProperty nameProperty() {
        return name;
    }

    public void setName(String name) {
        this.name.set(name);
    }

    public String getLocation() {
        return location.get();
    }

    public SimpleStringProperty locationProperty() {
        return location;
    }

    public void setLocation(String location) {
        this.location.set(location);
    }

    public String getType() {
        return type.get();
    }

    public SimpleStringProperty typeProperty() {
        return type;
    }

    public void setType(String type) {
        this.type.set(type);
    }

    public Boolean getImportant() {
        return important;
    }

    public void setImportant(boolean important) {
        this.important = important;
    }
}
