package Modell.Database;

import Controller.Main;
import Modell.*;
import ViewControllers.ManagePatientController;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DB_Controller extends DB_CreateTables {

    public DB_Controller() {

    }

    public void addPatient(Patient patient){
        try {
            String sql = "insert into PATIENT_DATA (NAME, MOTHER_NAME, BIRTHPLACE, BIRTHDATE, FAMILY_STATUS, JOB, EMAIL, PHONE, GENDER) values (?,?,?,?,?,?,?,?,?)";
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
            preparedStatement.execute();
        } catch (SQLException ex) {
            System.out.println("something wrong with adding PATIENT_DATA");
            System.out.println(""+ex);
        }

        try {
            String sql = "insert into PSYCHE (PATIENT_ID, PSYCHE1, PSYCHE2, PSYCHE3) VALUES (?,?,?,?)";
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setInt(1, patient.getPatient_ID() );
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
            preparedStatement.setInt(1, patient.getPatient_ID() );
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
            preparedStatement.setInt(1, patient.getPatient_ID() );
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
            preparedStatement.setInt(1, patient.getPatient_ID() );
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
            preparedStatement.setInt(1, patient.getPatient_ID() );
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
            preparedStatement.setInt(1, patient.getPatient_ID() );
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
            String sql = "update PATIENT_DATA set NAME=?, MOTHER_NAME=?, BIRTHPLACE=?, BIRTHDATE=?, FAMILY_STATUS=?, JOB=?, EMAIL=?, PHONE=?, GENDER=? where PATIENT_ID=?";
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
            preparedStatement.setInt(10, patient.getPatient_ID());
            preparedStatement.execute();
        } catch (SQLException ex) {
            System.out.println("something wrong with updating PATIENT_DATA");
            System.out.println(""+ex);
        }

        try {
            String sql = "update PSYCHE set PATIENT_ID=?, PSYCHE1=?, PSYCHE2=?, PSYCHE3=? where PATIENT_ID=?";
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setInt(1, patient.getPatient_ID() );
            preparedStatement.setString(2, patient.getPsyche().getPsyche1());
            preparedStatement.setString(3, patient.getPsyche().getPsyche2());
            preparedStatement.setString(4, patient.getPsyche().getPsyche3());
            preparedStatement.setInt(5, patient.getPatient_ID());
            preparedStatement.execute();
        } catch (SQLException ex) {
            System.out.println("something wrong with updating PSYCHE");
            System.out.println(""+ex);
        }

        try {
            String sql = "update HISTORY set PATIENT_ID=?, HISTORY1=?, HISTORY2=?, HISTORY3=?, HISTORY4=?, HISTORY5=?, HISTORY6=?, HISTORY7=?, HISTORY8=?, HISTORY9=? where PATIENT_ID=?";
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setInt(1, patient.getPatient_ID() );
            preparedStatement.setString(2, patient.getHistory().getHistory1());
            preparedStatement.setString(3, patient.getHistory().getHistory2());
            preparedStatement.setString(4, patient.getHistory().getHistory3());
            preparedStatement.setString(5, patient.getHistory().getHistory4());
            preparedStatement.setString(6, patient.getHistory().getHistory5());
            preparedStatement.setString(7, patient.getHistory().getHistory6());
            preparedStatement.setString(8, patient.getHistory().getHistory7());
            preparedStatement.setString(9, patient.getHistory().getHistory8());
            preparedStatement.setString(10, patient.getHistory().getHistory9());
            preparedStatement.setInt(11, patient.getPatient_ID());
            preparedStatement.execute();
        } catch (SQLException ex) {
            System.out.println("something wrong with updating HISTORY");
            System.out.println(""+ex);
        }

        try {
            String sql = "update ACTUAL set PATIENT_ID=?, ACTUAL1=?, ACTUAL2=?, ACTUAL3=?, ACTUAL4=?, ACTUAL5=? where PATIENT_ID=?";
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setInt(1, patient.getPatient_ID() );
            preparedStatement.setString(2, patient.getActual().getActual1());
            preparedStatement.setString(3, patient.getActual().getActual2());
            preparedStatement.setString(4, patient.getActual().getActual3());
            preparedStatement.setString(5, patient.getActual().getActual4());
            preparedStatement.setString(6, patient.getActual().getActual5());
            preparedStatement.setInt(7, patient.getPatient_ID());
            preparedStatement.execute();
        } catch (SQLException ex) {
            System.out.println("something wrong with updating ACTUAL");
            System.out.println(""+ex);
        }

        try {
            String sql = "update TCM set PATIENT_ID=?, TCM1=?, TCM2=?, TCM3=?, TCM4=?, TCM5=?, TCM6=?, TCM7=?, TCM8=? where PATIENT_ID=?";
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setInt(1, patient.getPatient_ID() );
            preparedStatement.setString(2, patient.getTcm().getTcm1());
            preparedStatement.setString(3, patient.getTcm().getTcm2());
            preparedStatement.setString(4, patient.getTcm().getTcm3());
            preparedStatement.setString(5, patient.getTcm().getTcm4());
            preparedStatement.setString(6, patient.getTcm().getTcm5());
            preparedStatement.setString(7, patient.getTcm().getTcm6());
            preparedStatement.setString(8, patient.getTcm().getTcm7());
            preparedStatement.setString(9, patient.getTcm().getTcm8());
            preparedStatement.setInt(10, patient.getPatient_ID());
            preparedStatement.execute();
        } catch (SQLException ex) {
            System.out.println("something wrong with updating TCM");
            System.out.println(""+ex);
        }

        try {
            String sql = "update PULSE set PATIENT_ID=?, PULSE1=?, PULSE2=?, PULSE3=?, PULSE4=?, PULSE5=?, PULSE6=?, PULSE7=?, PULSE8=?, PULSE9=?, PULSE10=?, PULSE11=?, PULSE12=?, PULSE13=?, PULSE14=?, PULSE15=?, PULSE16=?, PULSE17=?, PULSE18=?, PULSE19=?, PULSE20=?, PULSE21=?, PULSE22=?, PULSE23=?, PULSE24=?, OTHER=? where PATIENT_ID=?";
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setInt(1, patient.getPatient_ID() );
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
            preparedStatement.setInt(27, patient.getPatient_ID());
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
                        preparedStatement.setInt(1, patient.getPatient_ID());
                        preparedStatement.setInt(2, treatmentNumber);
                        preparedStatement.setString(3, treatment.getDate());
                        preparedStatement.setString(4, treatment.getTreatment1());
                        preparedStatement.setString(5, treatment.getTreatment2());
                        preparedStatement.setString(6, treatment.getTreatment3());
                        preparedStatement.setString(7, treatment.getTreatment4());
                        preparedStatement.setString(8, treatment.getTreatment5());
                        preparedStatement.setString(9, treatment.getTreatment6());
                        preparedStatement.setInt(10, patient.getPatient_ID());
                        preparedStatement.execute();
                        System.out.println("updatelve");
                    } catch (SQLException ex) {
                        System.out.println("something wrong with updating TREATMENT");
                        System.out.println("" + ex);
                    }
                }else{
                    try {
                        sql = "insert into TREATMENT (PATIENT_ID, TREATMENT_ID, TREATMENT_DATE, TREATMENT1, TREATMENT2, TREATMENT3, TREATMENT4, TREATMENT5, TREATMENT6) VALUES (?,?,?,?,?,?,?,?,?)";
                        PreparedStatement preparedStatement = conn.prepareStatement(sql);
                        preparedStatement.setInt(1, patient.getPatient_ID());
                        preparedStatement.setInt(2, treatmentNumber);
                        preparedStatement.setString(3, treatment.getDate());
                        preparedStatement.setString(4, treatment.getTreatment1());
                        preparedStatement.setString(5, treatment.getTreatment2());
                        preparedStatement.setString(6, treatment.getTreatment3());
                        preparedStatement.setString(7, treatment.getTreatment4());
                        preparedStatement.setString(8, treatment.getTreatment5());
                        preparedStatement.setString(9, treatment.getTreatment6());
                        preparedStatement.execute();
                        System.out.println("hozzaadva");
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
            preparedStatement.setInt(1, patient.getPatient_ID() );
            preparedStatement.setString(2, patient.getFinal().getDate());
            preparedStatement.setString(3, patient.getFinal().getAssessment());
            preparedStatement.setString(4, patient.getFinal().getResult());
            preparedStatement.setInt(5, patient.getPatient_ID());
            preparedStatement.execute();
        } catch (SQLException ex) {
            System.out.println("something wrong with updating FINAL");
            System.out.println(""+ex);
        }
    }

    public void getPatient(int id) {
        Patient patient=Patient.getInstance();
        patient.setPatientData(getPatientDate(id));
        patient.setPsyche(getPsyche(id));
        patient.setHistory(getHistory(id));
        patient.setActual(getActual(id));
        patient.setTcm(getTcm(id));
        patient.setPulse(getPulse(id));
        patient.setTreatments(getTreatments(id));
        patient.setFinal(getFinal(id));
    }

    public PatientData getPatientDate(int id) {
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
                    rs.getString("GENDER"));
        } catch (SQLException ex) {
            System.out.println("no patient with the id " + id);
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
            System.out.println("no patient with the id " + id);
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
            System.out.println("no patient with the id " + id);
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
            System.out.println("no patient with the id " + id);
        }
        return finalOpinion;
    }


}
