package Modell;

import Controller.Main;

import java.util.ArrayList;

public class Patient {
    private static Patient ourInstance = new Patient();

    public static Patient getInstance() {
        return ourInstance;
    }

        private int patient_ID;
        private PatientData patientData;
        private Symptoms symptoms;
        private Psyche psyche;
        private History history;
        private Actual actual;
        private Tcm tcm;
        private Pulse pulse;
        private ArrayList<Treatment> treatments;
        private Final Final;

        private Patient(PatientData patientData, Symptoms symptoms, Psyche psyche, History history, Actual actual, Tcm tcm, Pulse pulse, ArrayList<Treatment> treatments, Final Final){
            this.patient_ID=Main.patientID;
            this.patientData=patientData;
            this.symptoms=symptoms;
            this.psyche=psyche;
            this.history=history;
            this.actual=actual;
            this.tcm=tcm;
            this.pulse=pulse;
            this.treatments=treatments;
            this.Final=Final;
        }

        private Patient(){
            this.patient_ID=Main.patientID;
            this.patientData=new PatientData();
            this.symptoms=new Symptoms();
            this.psyche=new Psyche();
            this.history=new History();
            this.actual=new Actual();
            this.tcm=new Tcm();
            this.pulse=new Pulse();
            this.treatments=new ArrayList<>();
            this.Final=new Final();
        }

        public PatientData getPatientData() {
            return patientData;
        }

        public void setPatientData(PatientData patientData) {
            this.patientData = patientData;
        }

        public Symptoms getSymptoms() {
            return symptoms;
        }

        public void setSymptoms(Symptoms symptoms) {
            this.symptoms = symptoms;
        }

        public Psyche getPsyche() {
            return psyche;
        }

        public void setPsyche(Psyche psyche) {
            this.psyche = psyche;
        }

        public History getHistory() {
            return history;
        }

        public void setHistory(History history) {
            this.history = history;
        }

        public Actual getActual() {
            return actual;
        }

        public void setActual(Actual actual) {
            this.actual = actual;
        }

        public Tcm getTcm() {
            return tcm;
        }

        public void setTcm(Tcm tcm) {
            this.tcm = tcm;
        }

        public Pulse getPulse() {
            return pulse;
        }

        public void setPulse(Pulse pulse) {
            this.pulse = pulse;
        }

        public Modell.Final getFinal() {
            return Final;
        }

        public void setFinal(Modell.Final aFinal) {
            Final = aFinal;
        }

        public int getPatient_ID() {
            return patient_ID;
        }

        public void setPatient_ID(int patient_ID) {
            this.patient_ID = patient_ID;
        }

    public ArrayList<Treatment> getTreatments() {
        return treatments;
    }

    public void setTreatments(ArrayList<Treatment> treatments) {
        this.treatments = treatments;
    }
}
