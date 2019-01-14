package Modell.Database;

import javafx.beans.property.SimpleStringProperty;

public class PatientForChooseTable {

    private final SimpleStringProperty patientID;
    private final SimpleStringProperty name;
    private final SimpleStringProperty birthDate;


    public PatientForChooseTable(int patientID, String name, String birthdate){
        this.patientID = new SimpleStringProperty(Integer.toString(patientID));
        this.name = new SimpleStringProperty(name);
        this.birthDate =  new SimpleStringProperty(birthdate);
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

    public String getBirthDate() {
        return birthDate.get();
    }

    public SimpleStringProperty birthDateProperty() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate.set(birthDate);
    }
}
