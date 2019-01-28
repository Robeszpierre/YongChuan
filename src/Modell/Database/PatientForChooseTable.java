package Modell.Database;

import javafx.beans.property.SimpleStringProperty;

public class PatientForChooseTable {

    private final SimpleStringProperty patientID;
    private final SimpleStringProperty name;
    private final SimpleStringProperty birthDate;
    private final SimpleStringProperty lastModified;


    public PatientForChooseTable(int patientID, String name, String birthdate, String lastModified){
        this.patientID = new SimpleStringProperty(Integer.toString(patientID));
        this.name = new SimpleStringProperty(name);
        this.birthDate =  new SimpleStringProperty(birthdate);
        this.lastModified =  new SimpleStringProperty(lastModified);
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

    public String getLastModified() {
        return lastModified.get();
    }

    public SimpleStringProperty lastModifiedProperty() {
        return lastModified;
    }

    public void setLastModified(String lastModified) {
        this.lastModified.set(lastModified);
    }
}
