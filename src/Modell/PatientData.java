package Modell;

import Controller.Main;
import javafx.beans.property.SimpleStringProperty;

import java.sql.Date;
import java.time.LocalDate;

public class PatientData {

    private final SimpleStringProperty patientID;
    private final SimpleStringProperty name;
    private final SimpleStringProperty motherName;
    private final SimpleStringProperty birthPlace;
    private final SimpleStringProperty birthDate;
    private final SimpleStringProperty familyStatus;
    private final SimpleStringProperty job;
    private final SimpleStringProperty email;
    private final SimpleStringProperty phone;
    private final SimpleStringProperty gender;


    public PatientData(String name, String motherName, String birthPlace, String birthdate, String familyStatus, String job, String email, String phone, String gender){
        this.patientID = new SimpleStringProperty(Integer.toString(Main.patientID));
        this.name = new SimpleStringProperty(name);
        this.motherName = new SimpleStringProperty(motherName);
        this.birthPlace = new SimpleStringProperty(birthPlace);
        this.birthDate =  new SimpleStringProperty(birthdate);
        this.familyStatus = new SimpleStringProperty(familyStatus);
        this.job = new SimpleStringProperty(job);
        this.email = new SimpleStringProperty(email);
        this.phone = new SimpleStringProperty(phone);
        this.gender = new SimpleStringProperty(gender);
    }

    public PatientData(){
        this.patientID = new SimpleStringProperty("");
        this.name = new SimpleStringProperty("");
        this.motherName = new SimpleStringProperty("");
        this.birthPlace = new SimpleStringProperty("");
        this.birthDate = new SimpleStringProperty("1111-11-11");
        this.familyStatus = new SimpleStringProperty("");
        this.job = new SimpleStringProperty("");
        this.email = new SimpleStringProperty("");
        this.phone = new SimpleStringProperty("");
        this.gender = new SimpleStringProperty("");
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

    public String getMotherName() {
        return motherName.get();
    }

    public SimpleStringProperty motherNameProperty() {
        return motherName;
    }

    public void setMotherName(String motherName) {
        this.motherName.set(motherName);
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

    public String getFamilyStatus() {
        return familyStatus.get();
    }

    public SimpleStringProperty familyStatusProperty() {
        return familyStatus;
    }

    public void setFamilyStatus(String familyStatus) {
        this.familyStatus.set(familyStatus);
    }

    public String getJob() {
        return job.get();
    }

    public SimpleStringProperty jobProperty() {
        return job;
    }

    public void setJob(String job) {
        this.job.set(job);
    }

    public String getEmail() {
        return email.get();
    }

    public SimpleStringProperty emailProperty() {
        return email;
    }

    public void setEmail(String email) {
        this.email.set(email);
    }

    public String getPhone() {
        return phone.get();
    }

    public SimpleStringProperty phoneProperty() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone.set(phone);
    }

    public String getGender() {
        return gender.get();
    }

    public SimpleStringProperty genderProperty() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender.set(gender);
    }

    public String getBirthPlace() {
        return birthPlace.get();
    }

    public SimpleStringProperty birthPlaceProperty() {
        return birthPlace;
    }

    public void setBirthPlace(String birthPlace) {
        this.birthPlace.set(birthPlace);
    }
}
