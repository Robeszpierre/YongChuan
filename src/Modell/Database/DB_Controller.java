package Modell.Database;

import Controller.Main;
import Modell.*;
import ViewControllers.ManagePatientController;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;

import java.io.*;
import java.sql.*;
import java.util.ArrayList;

public class DB_Controller extends DB_CreateTables {

    public DB_Controller() {

    }

    public void addPatient(Patient patient){
        try {
            String sql = "insert into PATIENT_DATA (NAME, MOTHER_NAME, BIRTHPLACE, BIRTHDATE, FAMILY_STATUS, JOB, EMAIL, PHONE, GENDER, LAST_MODIFIED) values (?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setString(1, patient.getPatientData().getName());
            preparedStatement.setString(2, patient.getPatientData().getMotherName());
            preparedStatement.setString(3, patient.getPatientData().getBirthPlace());
            preparedStatement.setString(4, patient.getPatientData().getBirthDate());
            preparedStatement.setString(5, patient.getPatientData().getFamilyStatus());
            preparedStatement.setString(6, patient.getPatientData().getJob());
            preparedStatement.setString(7, patient.getPatientData().getEmail());
            preparedStatement.setString(8, patient.getPatientData().getPhone());
            preparedStatement.setString(9, patient.getPatientData().getGender());
            preparedStatement.setString(10, patient.getPatientData().getLastModofied());
            preparedStatement.execute();
        } catch (SQLException ex) {
            System.out.println("something wrong with adding PATIENT_DATA");
            System.out.println(""+ex);
        }

        //set the patient id
        Main.patientID=getID();


        try {
            String sql = "insert into PSYCHE (PATIENT_ID, PSYCHE1, PSYCHE2, PSYCHE3) VALUES (?,?,?,?)";
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setInt(1, Main.patientID );
            preparedStatement.setString(2, patient.getPsyche().getPsyche1());
            preparedStatement.setString(3, patient.getPsyche().getPsyche2());
            preparedStatement.setString(4, patient.getPsyche().getPsyche3());
            preparedStatement.execute();
        } catch (SQLException ex) {
            System.out.println("something wrong with adding PSYCHE");
            System.out.println(""+ex);
        }

        try {
            String sql = "insert into HISTORY (PATIENT_ID, HISTORY1, HISTORY2, HISTORY3, HISTORY4, HISTORY5, HISTORY6, HISTORY7, HISTORY8, HISTORY9) VALUES (?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setInt(1, Main.patientID );
            preparedStatement.setString(2, patient.getHistory().getHistory1());
            preparedStatement.setString(3, patient.getHistory().getHistory2());
            preparedStatement.setString(4, patient.getHistory().getHistory3());
            preparedStatement.setString(5, patient.getHistory().getHistory4());
            preparedStatement.setString(6, patient.getHistory().getHistory5());
            preparedStatement.setString(7, patient.getHistory().getHistory6());
            preparedStatement.setString(8, patient.getHistory().getHistory7());
            preparedStatement.setString(9, patient.getHistory().getHistory8());
            preparedStatement.setString(10, patient.getHistory().getHistory9());
            preparedStatement.execute();
        } catch (SQLException ex) {
            System.out.println("something wrong with adding HISTORY");
            System.out.println(""+ex);
        }

        try {
            String sql = "insert into ACTUAL (PATIENT_ID, ACTUAL1, ACTUAL2, ACTUAL3, ACTUAL4, ACTUAL5) VALUES (?,?,?,?,?,?)";
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setInt(1, Main.patientID );
            preparedStatement.setString(2, patient.getActual().getActual1());
            preparedStatement.setString(3, patient.getActual().getActual2());
            preparedStatement.setString(4, patient.getActual().getActual3());
            preparedStatement.setString(5, patient.getActual().getActual4());
            preparedStatement.setString(6, patient.getActual().getActual5());
            preparedStatement.execute();
        } catch (SQLException ex) {
            System.out.println("something wrong with adding ACTUAL");
            System.out.println(""+ex);
        }

        try {
            String sql = "insert into TCM (PATIENT_ID, TCM1, TCM2, TCM3, TCM4, TCM5, TCM6, TCM7, TCM8) VALUES (?,?,?,?,?,?,?,?,?)";
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setInt(1, Main.patientID );
            preparedStatement.setString(2, patient.getTcm().getTcm1());
            preparedStatement.setString(3, patient.getTcm().getTcm2());
            preparedStatement.setString(4, patient.getTcm().getTcm3());
            preparedStatement.setString(5, patient.getTcm().getTcm4());
            preparedStatement.setString(6, patient.getTcm().getTcm5());
            preparedStatement.setString(7, patient.getTcm().getTcm6());
            preparedStatement.setString(8, patient.getTcm().getTcm7());
            preparedStatement.setString(9, patient.getTcm().getTcm8());
            preparedStatement.execute();
        } catch (SQLException ex) {
            System.out.println("something wrong with adding TCM");
            System.out.println(""+ex);
        }

        try {
            String sql = "insert into PULSE (PATIENT_ID, PULSE1, PULSE2, PULSE3, PULSE4, PULSE5, PULSE6, PULSE7, PULSE8, PULSE9, PULSE10, PULSE11, PULSE12, PULSE13, PULSE14, PULSE15, PULSE16, PULSE17, PULSE18, PULSE19, PULSE20, PULSE21, PULSE22, PULSE23, PULSE24, OTHER) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setInt(1, Main.patientID );
            preparedStatement.setString(2, patient.getPulse().getPulse1());
            preparedStatement.setString(3, patient.getPulse().getPulse2());
            preparedStatement.setString(4, patient.getPulse().getPulse3());
            preparedStatement.setString(5, patient.getPulse().getPulse4());
            preparedStatement.setString(6, patient.getPulse().getPulse5());
            preparedStatement.setString(7, patient.getPulse().getPulse6());
            preparedStatement.setString(8, patient.getPulse().getPulse7());
            preparedStatement.setString(9, patient.getPulse().getPulse8());
            preparedStatement.setString(10, patient.getPulse().getPulse9());
            preparedStatement.setString(11, patient.getPulse().getPulse10());
            preparedStatement.setString(12, patient.getPulse().getPulse11());
            preparedStatement.setString(13, patient.getPulse().getPulse12());
            preparedStatement.setString(14, patient.getPulse().getPulse13());
            preparedStatement.setString(15, patient.getPulse().getPulse14());
            preparedStatement.setString(16, patient.getPulse().getPulse15());
            preparedStatement.setString(17, patient.getPulse().getPulse16());
            preparedStatement.setString(18, patient.getPulse().getPulse17());
            preparedStatement.setString(19, patient.getPulse().getPulse18());
            preparedStatement.setString(20, patient.getPulse().getPulse19());
            preparedStatement.setString(21, patient.getPulse().getPulse20());
            preparedStatement.setString(22, patient.getPulse().getPulse21());
            preparedStatement.setString(23, patient.getPulse().getPulse22());
            preparedStatement.setString(24, patient.getPulse().getPulse23());
            preparedStatement.setString(25, patient.getPulse().getPulse24());
            preparedStatement.setString(26, patient.getPulse().getOther());
            preparedStatement.execute();
        } catch (SQLException ex) {
            System.out.println("something wrong with adding PULSE");
            System.out.println(""+ex);
        }

        try {
            String sql = "insert into FINAL (PATIENT_ID, DATE, ASSASSMENT, RESULT) VALUES (?,?,?,?)";
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setInt(1, Main.patientID );
            preparedStatement.setString(2, patient.getFinal().getDate());
            preparedStatement.setString(3, patient.getFinal().getAssessment());
            preparedStatement.setString(4, patient.getFinal().getResult());
            preparedStatement.execute();
        } catch (SQLException ex) {
            System.out.println("something wrong with adding FINAL");
            System.out.println(""+ex);
        }
    }

    public void updatePatient(Patient patient){
        try {
            String sql = "update PATIENT_DATA set NAME=?, MOTHER_NAME=?, BIRTHPLACE=?, BIRTHDATE=?, FAMILY_STATUS=?, JOB=?, EMAIL=?, PHONE=?, GENDER=?, LAST_MODIFIED=? where PATIENT_ID=?";
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setString(1, patient.getPatientData().getName());
            preparedStatement.setString(2, patient.getPatientData().getMotherName());
            preparedStatement.setString(3, patient.getPatientData().getBirthPlace());
            preparedStatement.setString(4, patient.getPatientData().getBirthDate());
            preparedStatement.setString(5, patient.getPatientData().getFamilyStatus());
            preparedStatement.setString(6, patient.getPatientData().getJob());
            preparedStatement.setString(7, patient.getPatientData().getEmail());
            preparedStatement.setString(8, patient.getPatientData().getPhone());
            preparedStatement.setString(9, patient.getPatientData().getGender());
            preparedStatement.setString(10, patient.getPatientData().getLastModofied());
            preparedStatement.setInt(11, Main.patientID);
            preparedStatement.execute();
        } catch (SQLException ex) {
            System.out.println("something wrong with updating PATIENT_DATA");
            System.out.println(""+ex);
        }

        try {
            String sql = "update PSYCHE set PATIENT_ID=?, PSYCHE1=?, PSYCHE2=?, PSYCHE3=? where PATIENT_ID=?";
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setInt(1, Main.patientID );
            preparedStatement.setString(2, patient.getPsyche().getPsyche1());
            preparedStatement.setString(3, patient.getPsyche().getPsyche2());
            preparedStatement.setString(4, patient.getPsyche().getPsyche3());
            preparedStatement.setInt(5, Main.patientID);
            preparedStatement.execute();
        } catch (SQLException ex) {
            System.out.println("something wrong with updating PSYCHE");
            System.out.println(""+ex);
        }

        try {
            String sql = "update HISTORY set PATIENT_ID=?, HISTORY1=?, HISTORY2=?, HISTORY3=?, HISTORY4=?, HISTORY5=?, HISTORY6=?, HISTORY7=?, HISTORY8=?, HISTORY9=? where PATIENT_ID=?";
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setInt(1, Main.patientID );
            preparedStatement.setString(2, patient.getHistory().getHistory1());
            preparedStatement.setString(3, patient.getHistory().getHistory2());
            preparedStatement.setString(4, patient.getHistory().getHistory3());
            preparedStatement.setString(5, patient.getHistory().getHistory4());
            preparedStatement.setString(6, patient.getHistory().getHistory5());
            preparedStatement.setString(7, patient.getHistory().getHistory6());
            preparedStatement.setString(8, patient.getHistory().getHistory7());
            preparedStatement.setString(9, patient.getHistory().getHistory8());
            preparedStatement.setString(10, patient.getHistory().getHistory9());
            preparedStatement.setInt(11, Main.patientID);
            preparedStatement.execute();
        } catch (SQLException ex) {
            System.out.println("something wrong with updating HISTORY");
            System.out.println(""+ex);
        }

        try {
            String sql = "update ACTUAL set PATIENT_ID=?, ACTUAL1=?, ACTUAL2=?, ACTUAL3=?, ACTUAL4=?, ACTUAL5=? where PATIENT_ID=?";
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setInt(1, Main.patientID );
            preparedStatement.setString(2, patient.getActual().getActual1());
            preparedStatement.setString(3, patient.getActual().getActual2());
            preparedStatement.setString(4, patient.getActual().getActual3());
            preparedStatement.setString(5, patient.getActual().getActual4());
            preparedStatement.setString(6, patient.getActual().getActual5());
            preparedStatement.setInt(7, Main.patientID);
            preparedStatement.execute();
        } catch (SQLException ex) {
            System.out.println("something wrong with updating ACTUAL");
            System.out.println(""+ex);
        }

        try {
            String sql = "update TCM set PATIENT_ID=?, TCM1=?, TCM2=?, TCM3=?, TCM4=?, TCM5=?, TCM6=?, TCM7=?, TCM8=? where PATIENT_ID=?";
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setInt(1, Main.patientID );
            preparedStatement.setString(2, patient.getTcm().getTcm1());
            preparedStatement.setString(3, patient.getTcm().getTcm2());
            preparedStatement.setString(4, patient.getTcm().getTcm3());
            preparedStatement.setString(5, patient.getTcm().getTcm4());
            preparedStatement.setString(6, patient.getTcm().getTcm5());
            preparedStatement.setString(7, patient.getTcm().getTcm6());
            preparedStatement.setString(8, patient.getTcm().getTcm7());
            preparedStatement.setString(9, patient.getTcm().getTcm8());
            preparedStatement.setInt(10, Main.patientID);
            preparedStatement.execute();
        } catch (SQLException ex) {
            System.out.println("something wrong with updating TCM");
            System.out.println(""+ex);
        }

        try {
            String sql = "update PULSE set PATIENT_ID=?, PULSE1=?, PULSE2=?, PULSE3=?, PULSE4=?, PULSE5=?, PULSE6=?, PULSE7=?, PULSE8=?, PULSE9=?, PULSE10=?, PULSE11=?, PULSE12=?, PULSE13=?, PULSE14=?, PULSE15=?, PULSE16=?, PULSE17=?, PULSE18=?, PULSE19=?, PULSE20=?, PULSE21=?, PULSE22=?, PULSE23=?, PULSE24=?, OTHER=? where PATIENT_ID=?";
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setInt(1, Main.patientID );
            preparedStatement.setString(2, patient.getPulse().getPulse1());
            preparedStatement.setString(3, patient.getPulse().getPulse2());
            preparedStatement.setString(4, patient.getPulse().getPulse3());
            preparedStatement.setString(5, patient.getPulse().getPulse4());
            preparedStatement.setString(6, patient.getPulse().getPulse5());
            preparedStatement.setString(7, patient.getPulse().getPulse6());
            preparedStatement.setString(8, patient.getPulse().getPulse7());
            preparedStatement.setString(9, patient.getPulse().getPulse8());
            preparedStatement.setString(10, patient.getPulse().getPulse9());
            preparedStatement.setString(11, patient.getPulse().getPulse10());
            preparedStatement.setString(12, patient.getPulse().getPulse11());
            preparedStatement.setString(13, patient.getPulse().getPulse12());
            preparedStatement.setString(14, patient.getPulse().getPulse13());
            preparedStatement.setString(15, patient.getPulse().getPulse14());
            preparedStatement.setString(16, patient.getPulse().getPulse15());
            preparedStatement.setString(17, patient.getPulse().getPulse16());
            preparedStatement.setString(18, patient.getPulse().getPulse17());
            preparedStatement.setString(19, patient.getPulse().getPulse18());
            preparedStatement.setString(20, patient.getPulse().getPulse19());
            preparedStatement.setString(21, patient.getPulse().getPulse20());
            preparedStatement.setString(22, patient.getPulse().getPulse21());
            preparedStatement.setString(23, patient.getPulse().getPulse22());
            preparedStatement.setString(24, patient.getPulse().getPulse23());
            preparedStatement.setString(25, patient.getPulse().getPulse24());
            preparedStatement.setString(26, patient.getPulse().getOther());
            preparedStatement.setInt(27, Main.patientID);
            preparedStatement.execute();
        } catch (SQLException ex) {
            System.out.println("something wrong with updating PULSE");
            System.out.println(""+ex);
        }


        int treatmentNumber = 1;
        for(Treatment treatment: patient.getTreatments()) {
            ResultSet result = null;
            try {
                String sql = "select * from TREATMENT where PATIENT_ID="+ Main.patientID+ " and TREATMENT_ID=" + treatmentNumber;
                result=createStatement.executeQuery(sql);
                if(result.next()){
                    try {
                        sql = "update TREATMENT set PATIENT_ID=?, TREATMENT_ID=?, TREATMENT_DATE=?, TREATMENT1=?, TREATMENT2=?, TREATMENT3=?, TREATMENT4=?, TREATMENT5=?, TREATMENT6=? where PATIENT_ID=? and TREATMENT_ID=" + treatmentNumber;
                        PreparedStatement preparedStatement = conn.prepareStatement(sql);
                        preparedStatement.setInt(1, Main.patientID);
                        preparedStatement.setInt(2, treatmentNumber);
                        preparedStatement.setString(3, treatment.getDate());
                        preparedStatement.setString(4, treatment.getTreatment1());
                        preparedStatement.setString(5, treatment.getTreatment2());
                        preparedStatement.setString(6, treatment.getTreatment3());
                        preparedStatement.setString(7, treatment.getTreatment4());
                        preparedStatement.setString(8, treatment.getTreatment5());
                        preparedStatement.setString(9, treatment.getTreatment6());
                        preparedStatement.setInt(10, Main.patientID);
                        preparedStatement.execute();
                    } catch (SQLException ex) {
                        System.out.println("something wrong with updating TREATMENT");
                        System.out.println("" + ex);
                    }
                }else{
                    try {
                        sql = "insert into TREATMENT (PATIENT_ID, TREATMENT_ID, TREATMENT_DATE, TREATMENT1, TREATMENT2, TREATMENT3, TREATMENT4, TREATMENT5, TREATMENT6) VALUES (?,?,?,?,?,?,?,?,?)";
                        PreparedStatement preparedStatement = conn.prepareStatement(sql);
                        preparedStatement.setInt(1, Main.patientID);
                        preparedStatement.setInt(2, treatmentNumber);
                        preparedStatement.setString(3, treatment.getDate());
                        preparedStatement.setString(4, treatment.getTreatment1());
                        preparedStatement.setString(5, treatment.getTreatment2());
                        preparedStatement.setString(6, treatment.getTreatment3());
                        preparedStatement.setString(7, treatment.getTreatment4());
                        preparedStatement.setString(8, treatment.getTreatment5());
                        preparedStatement.setString(9, treatment.getTreatment6());
                        preparedStatement.execute();
                    }catch (SQLException ex) {
                        System.out.println("something wrong with updating TREATMENT");
                        System.out.println("" + ex);
                    }
                }
            }catch (SQLException ex) {
                System.out.println("something wrong with TREATMENT");
                System.out.println("" + ex);
            }
            treatmentNumber++;
        }

        try {
            String sql = "update FINAL set PATIENT_ID=?, DATE=?, ASSASSMENT=?, RESULT=? where PATIENT_ID=?";
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setInt(1, Main.patientID );
            preparedStatement.setString(2, patient.getFinal().getDate());
            preparedStatement.setString(3, patient.getFinal().getAssessment());
            preparedStatement.setString(4, patient.getFinal().getResult());
            preparedStatement.setInt(5, Main.patientID);
            preparedStatement.execute();
        } catch (SQLException ex) {
            System.out.println("something wrong with updating FINAL");
            System.out.println(""+ex);
        }
    }

    public ArrayList<PatientForChooseTable> getAllPatients(){
        String sql = "select * from PATIENT_DATA";
        ArrayList<PatientForChooseTable> patients = null;
        try {
            ResultSet rs = createStatement.executeQuery(sql);
            patients = new ArrayList<>();

            while (rs.next()){
                PatientForChooseTable actualPatient = new PatientForChooseTable(rs.getInt("PATIENT_ID"),rs.getString("NAME"),rs.getString("BIRTHDATE"), rs.getString("LAST_MODIFIED"));
                patients.add(actualPatient);
            }
        } catch (SQLException ex) {
            System.out.println("Valami baj van a userek kiolvasásakor");
            System.out.println(""+ex);
        }
        return patients;
    }

    public void getPatient(int id) {
        Patient patient=Patient.getInstance();
        patient.setPatientData(getPatientData(id));
        patient.setPsyche(getPsyche(id));
        patient.setHistory(getHistory(id));
        patient.setActual(getActual(id));
        patient.setTcm(getTcm(id));
        patient.setPulse(getPulse(id));
        patient.setTreatments(getTreatments(id));
        patient.setFinal(getFinal(id));
    }

    private int getID(){
            String sql = "select max(PATIENT_ID) as id from PATIENT_DATA";
            int patiendID=0;
            try {
                ResultSet rs = createStatement.executeQuery(sql);
                rs.next();
                patiendID = rs.getInt("id");
            } catch (SQLException ex) {
                System.out.println("couldn!t get patient id");
            }
            return patiendID;
    }

    public PatientData getPatientData(int id) {
        String sql = "select * from PATIENT_DATA where PATIENT_ID=" + id;
        PatientData patientData = null;
        try {
            ResultSet rs = createStatement.executeQuery(sql);
            rs.next();
            patientData = new PatientData(
                    rs.getString("NAME"),
                    rs.getString("MOTHER_NAME"),
                    rs.getString("BIRTHPLACE"),
                    rs.getString("BIRTHDATE"),
                    rs.getString("FAMILY_STATUS"),
                    rs.getString("JOB"),
                    rs.getString("EMAIL"),
                    rs.getString("PHONE"),
                    rs.getString("GENDER"),
                    rs.getString("LAST_MODIFIED"));
        } catch (SQLException ex) {
            System.out.println("PATIENT_DATA no patient with the id " + id);
        }
        return patientData;
    }

    public Psyche getPsyche(int id) {
        String sql = "select * from PSYCHE where PATIENT_ID=" + id;
        Psyche psyche = null;
        try {
            ResultSet rs = createStatement.executeQuery(sql);
            rs.next();
            psyche = new Psyche(
                    rs.getString("PSYCHE1"),
                    rs.getString("PSYCHE2"),
                    rs.getString("PSYCHE3"));
        } catch (SQLException ex) {
            System.out.println("PSYCHE no patient with the id " + id);
        }
        return psyche;
    }

    public History getHistory(int id) {
        String sql = "select * from HISTORY where PATIENT_ID=" + id;
        History history = null;
        try {
            ResultSet rs = createStatement.executeQuery(sql);
            rs.next();
            history = new History(
                    rs.getString("HISTORY1"),
                    rs.getString("HISTORY2"),
                    rs.getString("HISTORY3"),
                    rs.getString("HISTORY4"),
                    rs.getString("HISTORY5"),
                    rs.getString("HISTORY6"),
                    rs.getString("HISTORY7"),
                    rs.getString("HISTORY8"),
                    rs.getString("HISTORY9"));
        } catch (SQLException ex) {
            System.out.println("HISTORY no patient with the id " + id);
        }
        return history;
    }

    public Actual getActual(int id) {
        String sql = "select * from ACTUAL where PATIENT_ID=" + id;
        Actual actual = null;
        try {
            ResultSet rs = createStatement.executeQuery(sql);
            rs.next();
            actual = new Actual(
                    rs.getString("ACTUAL1"),
                    rs.getString("ACTUAL2"),
                    rs.getString("ACTUAL3"),
                    rs.getString("ACTUAL4"),
                    rs.getString("ACTUAL5"));
        } catch (SQLException ex) {
            System.out.println("no patient with the id " + id);
        }
        return actual;
    }

    public Tcm getTcm(int id) {
        String sql = "select * from TCM where PATIENT_ID=" + id;
        Tcm tcm = null;
        try {
            ResultSet rs = createStatement.executeQuery(sql);
            rs.next();
            tcm = new Tcm(
                    rs.getString("TCM1"),
                    rs.getString("TCM2"),
                    rs.getString("TCM3"),
                    rs.getString("TCM4"),
                    rs.getString("TCM5"),
                    rs.getString("TCM6"),
                    rs.getString("TCM7"),
                    rs.getString("TCM8"));
        } catch (SQLException ex) {
            System.out.println("no patient with the id " + id);
        }
        return tcm;
    }

    public Pulse getPulse(int id) {
        String sql = "select * from PULSE where PATIENT_ID=" + id;
        Pulse pulse = null;
        try {
            ResultSet rs = createStatement.executeQuery(sql);
            rs.next();
            pulse = new Pulse(
                    rs.getString("PULSE1"),
                    rs.getString("PULSE2"),
                    rs.getString("PULSE3"),
                    rs.getString("PULSE4"),
                    rs.getString("PULSE5"),
                    rs.getString("PULSE6"),
                    rs.getString("PULSE7"),
                    rs.getString("PULSE8"),
                    rs.getString("PULSE9"),
                    rs.getString("PULSE10"),
                    rs.getString("PULSE11"),
                    rs.getString("PULSE12"),
                    rs.getString("PULSE13"),
                    rs.getString("PULSE14"),
                    rs.getString("PULSE15"),
                    rs.getString("PULSE16"),
                    rs.getString("PULSE17"),
                    rs.getString("PULSE18"),
                    rs.getString("PULSE19"),
                    rs.getString("PULSE20"),
                    rs.getString("PULSE21"),
                    rs.getString("PULSE22"),
                    rs.getString("PULSE23"),
                    rs.getString("PULSE24"),
                    rs.getString("OTHER"));
        } catch (SQLException ex) {
            System.out.println("no patient with the id " + id);
        }
        return pulse;
    }

    public ArrayList<Treatment> getTreatments(int id){
        String sql = "select * from TREATMENT where PATIENT_ID="+id+" order by  TREATMENT_ID";
        ArrayList<Treatment> treatments = null;
        try {
            ResultSet rs = createStatement.executeQuery(sql);
            treatments = new ArrayList<>();
            while (rs.next()){
                Treatment actualTreatment = new Treatment(
                        rs.getString("TREATMENT_DATE"),
                        rs.getString("TREATMENT1"),
                        rs.getString("TREATMENT2"),
                        rs.getString("TREATMENT3"),
                        rs.getString("TREATMENT4"),
                        rs.getString("TREATMENT5"),
                        rs.getString("TREATMENT6"));
                treatments.add(actualTreatment);
            }
        } catch (SQLException ex) {
            System.out.println("Valami baj van a kulcsok lekérdezésekor");
            System.out.println(""+ex);
        }
        return treatments;
    }

    public Final getFinal(int id) {
        String sql = "select * from FINAL where PATIENT_ID=" + id;
        Final finalOpinion = null;
        try {
            ResultSet rs = createStatement.executeQuery(sql);
            rs.next();
            finalOpinion = new Final(
                    rs.getString("DATE"),
                    rs.getString("ASSASSMENT"),
                    rs.getString("RESULT"));
        } catch (SQLException ex) {
            System.out.println("FINAL no patient with the id " + id);
        }
        return finalOpinion;
    }

    //-----------STATISTIC-----------
    public double getManPercent(){
        String sql = "select count(*) as everyone from PATIENT_DATA";
        double all = 0;
        double mans = 0;
        double result=0;
        try {
            ResultSet rs = createStatement.executeQuery(sql);
            rs.next();
            all=rs.getInt("everyone");
        } catch (SQLException ex) {
            System.out.println("no patient with the id ");
        }


        sql = "select count(*) as mans from PATIENT_DATA where GENDER='férfi'";
        try {
            ResultSet rs = createStatement.executeQuery(sql);
            rs.next();
            mans=rs.getInt("mans");
        } catch (SQLException ex) {
            System.out.println("no patient with the id ");
        }

        result=mans/all*100;

        return result;
    }

    public ResultForPieChart getresultForPieChart(){
        int healed=getresult("gyógyult");
        int partiallyHealed=getresult("részben gyógyult");
        int notHealed=getresult("nem gyógyult");
        int other=getresult("egyéb");

        return new ResultForPieChart(healed, partiallyHealed, notHealed, other);
    }

    private int getresult(String result){
        String sql = "select count(*) as condition from FINAL where RESULT='"+result+"'";
        int data=0;
        try {
            ResultSet rs = createStatement.executeQuery(sql);
            rs.next();
            data=rs.getInt("condition");
        } catch (SQLException ex) {
            System.out.println("no result");
        }
        return data;
    }

    //-----------SYMPTOMS-----------

    public void addSymptoms(ArrayList<Symptom> symptoms) {
        try {
            conn.createStatement().executeUpdate("delete from SYMPTOMS where PATIENT_ID=" + Main.patientID);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            String sql = "insert into SYMPTOMS (PATIENT_ID, NAME, LOCATION, TYPE, IMPORTANT) VALUES (?,?,?,?,?)";
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            for(Symptom symptom: symptoms) {
                preparedStatement.setInt(1, Integer.parseInt(symptom.getPatientID()));
                preparedStatement.setString(2, symptom.getName());
                preparedStatement.setString(3, symptom.getLocation());
                preparedStatement.setInt(4, Integer.parseInt(symptom.getType()));
                preparedStatement.setBoolean(5, symptom.getImportant());
                preparedStatement.execute();
            }
        } catch (SQLException ex) {
            System.out.println("something wrong with adding PSYCHE");
            System.out.println("" + ex);
        }
    }

    public ArrayList<Symptom> getSymptoms(int id){
        String sql = "select * from SYMPTOMS where PATIENT_ID="+id;
        ArrayList<Symptom> symptoms = new ArrayList<>();
        try {
            ResultSet rs = createStatement.executeQuery(sql);
            while (rs.next()){
                Symptom actualSymptom = new Symptom(
                        Integer.parseInt(rs.getString("PATIENT_ID")),
                        rs.getString("NAME"),
                        rs.getString("LOCATION"),
                        Integer.parseInt(rs.getString("TYPE")),
                        rs.getBoolean("IMPORTANT"));
                symptoms.add(actualSymptom);
            }
            rs.close();
        } catch (SQLException ex) {
            System.out.println("something wrong with getting symptoms");
            System.out.println(""+ex);
        }
        return symptoms;
    }


    public void saveSymptoms(String radiobuttonSave, String textFieldSave, String checkBoxSave, String comboBoxSave, String spinnerSave) {
        String sql="select * from SYMPTOMS_SAVE where PATIENT_ID=" + Main.patientID;
        ResultSet rs;
        try {
                rs = createStatement.executeQuery(sql);
            if(!rs.next()) {
                try {
                    sql = "insert into SYMPTOMS_SAVE (PATIENT_ID, RADIOBUTTONS, TEXTFIELDS, CHECKBOXES, COMBOBOXES, SPINNERS) VALUES (?,?,?,?,?,?)";
                    PreparedStatement preparedStatement = conn.prepareStatement(sql);
                    preparedStatement.setInt(1, Main.patientID);
                    preparedStatement.setString(2, radiobuttonSave);
                    preparedStatement.setString(3, textFieldSave);
                    preparedStatement.setString(4, checkBoxSave);
                    preparedStatement.setString(5, comboBoxSave);
                    preparedStatement.setString(6, spinnerSave);
                    preparedStatement.execute();
                } catch (SQLException ex) {
                    System.out.println("something wrong with adding PSYCHE");
                    System.out.println("" + ex);
                }
            }else{
                sql = "update SYMPTOMS_SAVE set PATIENT_ID=?, RADIOBUTTONS=?, TEXTFIELDS=?, CHECKBOXES=?, COMBOBOXES=?, SPINNERS=? where PATIENT_ID=?";
                PreparedStatement preparedStatement = conn.prepareStatement(sql);
                preparedStatement.setInt(1, Main.patientID);
                preparedStatement.setString(2, radiobuttonSave);
                preparedStatement.setString(3, textFieldSave);
                preparedStatement.setString(4, checkBoxSave);
                preparedStatement.setString(5, comboBoxSave);
                preparedStatement.setString(6, spinnerSave);
                preparedStatement.setInt(7, Main.patientID);
                preparedStatement.execute();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public ArrayList<String> loadSymptoms(){
        String sql = "select * from SYMPTOMS_SAVE where PATIENT_ID=" + Main.patientID;
        ArrayList<String> result = new ArrayList<>();
        try {
            ResultSet rs = createStatement.executeQuery(sql);
            rs.next();
            result.add(rs.getString("RADIOBUTTONS"));
            result.add(rs.getString("TEXTFIELDS"));
            result.add(rs.getString("CHECKBOXES"));
            result.add(rs.getString("COMBOBOXES"));
            result.add(rs.getString("SPINNERS"));
        } catch (SQLException ex) {
            System.out.println("no patient with the id " + Main.patientID);
        }
        return result;
    }

    public void saveImage(String imageName, File imageFile) {
        String sql="select * from IMAGES where PATIENT_ID=" + Main.patientID;
        ResultSet rs;
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(imageFile);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            rs = createStatement.executeQuery(sql);
            if(!rs.next()) {
                if(imageName.equals("ear.jpg")){
                    sql = "insert into IMAGES (PATIENT_ID, EAR) VALUES (?,?)";
                }else if(imageName.equals("tongue.jpg")){
                    sql = "insert into IMAGES (PATIENT_ID, TONGUE) VALUES (?,?)";
                }
                try {
                    PreparedStatement preparedStatement = conn.prepareStatement(sql);
                    preparedStatement.setInt(1, Main.patientID);
                    preparedStatement.setBinaryStream(2, fis, (int) imageFile.length());
                    preparedStatement.execute();
                } catch (SQLException ex) {
                    System.out.println("something wrong with adding IMAGE");
                    System.out.println("" + ex);
                }
            }else{
                if(imageName.equals("ear.jpg")){
                    sql = "update IMAGES set EAR=? where PATIENT_ID=" + Main.patientID;
                } else if(imageName.equals("tongue.jpg")){
                    sql = "update IMAGES set TONGUE=? where PATIENT_ID=" + Main.patientID;
                }
                PreparedStatement preparedStatement = conn.prepareStatement(sql);
                preparedStatement.setBinaryStream(1, fis, (int) imageFile.length());
                preparedStatement.execute();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public void loadImages(ManagePatientController managePatientController) {
        String sql = "select EAR, TONGUE from IMAGES where PATIENT_ID=" + Main.patientID;
        try {
            ResultSet rs = createStatement.executeQuery(sql);
            if(rs.next()) {
                InputStream ear=null;
                InputStream tongue=null;
                try {
                    ear = rs.getBlob("EAR").getBinaryStream();
                    Image img=new Image(ear);
                    managePatientController.setImage("ear.jpg", img);
                    ear.close();
                }catch (Exception e){
                    //no ear picture
                    managePatientController.setImage("ear");
                }
                try {
                    tongue = rs.getBlob("TONGUE").getBinaryStream();
                    Image img=new Image(tongue);
                    managePatientController.setImage("tongue.jpg", img);
                    tongue.close();
                }catch (Exception e){
                    //no tongue picture
                    managePatientController.setImage("tongue");
                }
            }else{
                managePatientController.setImage();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public File getPictureFile(String imageViewId) {
        File file=null;
        String sql="";
        String columnLabel="";
        if(imageViewId.equals("earImageView")){
            sql="select EAR from IMAGES where  PATIENT_ID=" + Main.patientID;
            columnLabel="EAR";
        }else if(imageViewId.equals("tongueImageView")){
            sql="select TONGUE from IMAGES where  PATIENT_ID=" + Main.patientID;
            columnLabel="TONGUE";
        }
        try {
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();
            rs.next();
            Blob blob = rs.getBlob(columnLabel);
            byte [] array = blob.getBytes( 1, ( int ) blob.length() );
            file = File.createTempFile("something-", ".jpg", new File("."));
            FileOutputStream out = new FileOutputStream( file );
            out.write( array );
            out.close();
            file.deleteOnExit();

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return file;
    }

    public void saveImageDescription(String earText, String tongueText) {
        try {
            String sql = "insert into IMAGES (PATIENT_ID, EAR_DESCRIPTION, TONGUE_DESCRIPTION) VALUES (?,?,?)";
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setInt(1, Main.patientID );
            preparedStatement.setString(2, earText);
            preparedStatement.setString(3, tongueText);
            preparedStatement.execute();
            System.out.println("save");
        } catch (SQLException ex) {
            System.out.println("something wrong with adding IMAGES DESCRIPTION");
            System.out.println(""+ex);
        }
    }

    public void updateImageDescription(String earText, String tongueText) {
        try {
            String sql = "update IMAGES set EAR_DESCRIPTION=?, TONGUE_DESCRIPTION=? where PATIENT_ID=" + Main.patientID;
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setString(1, earText);
            preparedStatement.setString(2, tongueText);
            preparedStatement.execute();
        } catch (SQLException ex) {
            System.out.println("something wrong with adding IMAGES DESCRIPTION");
            System.out.println(""+ex);
        }
    }

    public ArrayList<String> getImageDescriptions() {
        String sql = "select EAR_DESCRIPTION, TONGUE_DESCRIPTION from IMAGES where PATIENT_ID=" + Main.patientID;
        ArrayList<String> descriptions= new ArrayList<>();
        try {
            ResultSet rs = createStatement.executeQuery(sql);
            rs.next();
            descriptions.add(rs.getString("EAR_DESCRIPTION"));
            descriptions.add(rs.getString("TONGUE_DESCRIPTION"));
            System.out.println(descriptions.get(0));
        } catch (SQLException ex) {
            System.out.println("no picture description with the id " + Main.patientID);
        }
        return descriptions;
    }

    public void deletePatient(int id) {
        try {
            PreparedStatement preparedStatement = conn.prepareStatement("DELETE FROM ACTUAL WHERE PATIENT_ID = " + id);
            preparedStatement.executeUpdate();
            preparedStatement = conn.prepareStatement("DELETE FROM FINAL WHERE PATIENT_ID = " + id);
            preparedStatement.executeUpdate();
            preparedStatement = conn.prepareStatement("DELETE FROM HISTORY WHERE PATIENT_ID = " + id);
            preparedStatement.executeUpdate();
            preparedStatement = conn.prepareStatement("DELETE FROM IMAGES WHERE PATIENT_ID = " + id);
            preparedStatement.executeUpdate();
            preparedStatement = conn.prepareStatement("DELETE FROM PATIENT_DATA WHERE PATIENT_ID = " + id);
            preparedStatement.executeUpdate();
            preparedStatement = conn.prepareStatement("DELETE FROM PSYCHE WHERE PATIENT_ID = " + id);
            preparedStatement.executeUpdate();
            preparedStatement = conn.prepareStatement("DELETE FROM PULSE WHERE PATIENT_ID = " + id);
            preparedStatement.executeUpdate();
            preparedStatement = conn.prepareStatement("DELETE FROM SYMPTOMS WHERE PATIENT_ID = " + id);
            preparedStatement.executeUpdate();
            preparedStatement = conn.prepareStatement("DELETE FROM SYMPTOMS_SAVE WHERE PATIENT_ID = " + id);
            preparedStatement.executeUpdate();
            preparedStatement = conn.prepareStatement("DELETE FROM TCM WHERE PATIENT_ID = " + id);
            preparedStatement.executeUpdate();
            preparedStatement = conn.prepareStatement("DELETE FROM TREATMENT WHERE PATIENT_ID = " + id);
            preparedStatement.executeUpdate();
            preparedStatement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteTreatment(int treatmentId) {
        try {
            conn.createStatement().executeUpdate("delete from TREATMENT where PATIENT_ID=" + Main.patientID + " and TREATMENT_ID=" + treatmentId);
            System.out.println(treatmentId);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public int getFontSize(){
        String sql = "select FONT_SIZE from SETTINGS";
        int fontSize=13;
        try {
            ResultSet rs = createStatement.executeQuery(sql);
            rs.next();
            fontSize=rs.getInt("FONT_SIZE");
            System.out.println(fontSize);
        } catch (SQLException ex) {
            System.out.println("no font size");
        }
        return fontSize;
    }

    public String getFonFamily(){
        String sql = "select FONT_FAMILY from SETTINGS";
        String fontFamily="";
        try {
            ResultSet rs = createStatement.executeQuery(sql);
            rs.next();
            fontFamily=rs.getString("FONT_FAMILY");
        } catch (SQLException ex) {
            System.out.println("no font size");
        }
        return fontFamily;
    }

    public void updateFontSizes(int fontSize){
        try {
            conn.createStatement().executeUpdate("UPDATE SETTINGS set FONT_SIZE=" + fontSize);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void updateFontFemily(String fontFamily){
        try {
            conn.createStatement().executeUpdate("UPDATE SETTINGS set FONT_FAMILY=" + "'" + fontFamily + "'");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
