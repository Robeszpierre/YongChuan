package Modell.Database;

import java.sql.ResultSet;
import java.sql.SQLException;

public class DB_CreateTables extends  DB_Config {


    public DB_CreateTables() {
        try {
            ResultSet rs = dbmd.getTables(null, "APP", "PATIENT_DATA", null);
            if(!rs.next())
            {
                createStatement.execute("CREATE TABLE PATIENT_DATA" +
                        "(" +
                        "    PATIENT_ID INT not null primary key GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1)," +
                        "    NAME varchar(100)," +
                        "    MOTHER_NAME varchar(100)," +
                        "    BIRTHPLACE varchar(100)," +
                        "    BIRTHDATE date," +
                        "    FAMILY_STATUS varchar(100)," +
                        "    JOB varchar(100)," +
                        "    EMAIL varchar(100)," +
                        "    PHONE varchar(30)," +
                        "    GENDER varchar(5)" +
                        ")");
                System.out.println("PATIENT_DATA table created");
            }
        } catch (SQLException ex) {
            System.out.println("something wrong with PATIENT_DATA table creation");
            System.out.println(""+ex);
        }

        try {
            ResultSet rs = dbmd.getTables(null, "APP", "SYMPTOMS", null);
            if(!rs.next())
            {
                createStatement.execute("CREATE TABLE SYMPTOMS" +
                        "(" +
                        "    PATIENT_ID INT," +
                        "    NAME varchar(100)," +
                        "    LOCATION varchar(5)," +
                        "    TYPE int" +
                        ")");
                System.out.println("symptoms table created");
            }
        } catch (SQLException ex) {
            System.out.println("something wrong with symptoms table creation");
            System.out.println(""+ex);
        }

        try {
            ResultSet rs = dbmd.getTables(null, "APP", "PSYCHE", null);
            if(!rs.next())
            {
                createStatement.execute("CREATE TABLE PSYCHE" +
                        "(" +
                        "    PATIENT_ID INT," +
                        "    PSYCHE1 long varchar ," +
                        "    PSYCHE2 long varchar," +
                        "    PSYCHE3 long varchar" +
                        ")");
                System.out.println("PSYCHE table created");
            }
        } catch (SQLException ex) {
            System.out.println("something wrong with PSYCHE table creation");
            System.out.println(""+ex);
        }

        try {
            ResultSet rs = dbmd.getTables(null, "APP", "HISTORY", null);
            if(!rs.next())
            {
                createStatement.execute("CREATE TABLE HISTORY" +
                        "(" +
                        "    PATIENT_ID INT," +
                        "    HISTORY1 long varchar ," +
                        "    HISTORY2 long varchar," +
                        "    HISTORY3 long varchar," +
                        "    HISTORY4 long varchar," +
                        "    HISTORY5 long varchar," +
                        "    HISTORY6 long varchar," +
                        "    HISTORY7 long varchar," +
                        "    HISTORY8 long varchar," +
                        "    HISTORY9 long varchar" +
                        ")");
                System.out.println("HISTORY table created");
            }
        } catch (SQLException ex) {
            System.out.println("something wrong with HISTORY table creation");
            System.out.println(""+ex);
        }

        try {
            ResultSet rs = dbmd.getTables(null, "APP", "ACTUAL", null);
            if(!rs.next())
            {
                createStatement.execute("CREATE TABLE ACTUAL" +
                        "(" +
                        "    PATIENT_ID INT," +
                        "    ACTUAL1 long varchar ," +
                        "    ACTUAL2 long varchar," +
                        "    ACTUAL3 long varchar," +
                        "    ACTUAL4 long varchar," +
                        "    ACTUAL5 long varchar" +
                        ")");
                System.out.println("ACTUAL table created");
            }
        } catch (SQLException ex) {
            System.out.println("something wrong with ACTUAL table creation");
            System.out.println(""+ex);
        }

        try {
            ResultSet rs = dbmd.getTables(null, "APP", "TCM", null);
            if(!rs.next())
            {
                createStatement.execute("CREATE TABLE TCM" +
                        "(" +
                        "    PATIENT_ID INT," +
                        "    TCM1 long varchar ," +
                        "    TCM2 long varchar," +
                        "    TCM3 long varchar," +
                        "    TCM4 long varchar," +
                        "    TCM5 long varchar," +
                        "    TCM6 long varchar," +
                        "    TCM7 long varchar," +
                        "    TCM8 long varchar" +
                        ")");
                System.out.println("TCM table created");
            }
        } catch (SQLException ex) {
            System.out.println("something wrong with TCM table creation");
            System.out.println(""+ex);
        }

        try {
            ResultSet rs = dbmd.getTables(null, "APP", "PULSE", null);
            if(!rs.next())
            {
                createStatement.execute("CREATE TABLE PULSE" +
                        "(" +
                        "    PATIENT_ID INT," +
                        "    PULSE1 long varchar ," +
                        "    PULSE2 long varchar," +
                        "    PULSE3 long varchar," +
                        "    PULSE4 long varchar," +
                        "    PULSE5 long varchar," +
                        "    PULSE6 long varchar," +
                        "    PULSE7 long varchar," +
                        "    PULSE8 long varchar," +
                        "    PULSE9 long varchar," +
                        "    PULSE10 long varchar," +
                        "    PULSE11 long varchar," +
                        "    PULSE12 long varchar," +
                        "    PULSE13 long varchar," +
                        "    PULSE14 long varchar," +
                        "    PULSE15 long varchar," +
                        "    PULSE16 long varchar," +
                        "    PULSE17 long varchar," +
                        "    PULSE18 long varchar," +
                        "    PULSE19 long varchar," +
                        "    PULSE20 long varchar," +
                        "    PULSE21 long varchar," +
                        "    PULSE22 long varchar," +
                        "    PULSE23 long varchar," +
                        "    PULSE24 long varchar," +
                        "    other long varchar" +
                        ")");
                System.out.println("PULSE table created");
            }
        } catch (SQLException ex) {
            System.out.println("something wrong with PULSE table creation");
            System.out.println(""+ex);
        }

        try {
            ResultSet rs = dbmd.getTables(null, "APP", "TREATMENT", null);
            if(!rs.next())
            {
                createStatement.execute("CREATE TABLE TREATMENT" +
                        "(" +
                        "    PATIENT_ID INT," +
                        "    TREATMENT_ID INT," +
                        "    TREATMENT_DATE date," +
                        "    TREATMENT1 long varchar ," +
                        "    TREATMENT2 long varchar," +
                        "    TREATMENT3 long varchar," +
                        "    TREATMENT4 long varchar," +
                        "    TREATMENT5 long varchar," +
                        "    TREATMENT6 long varchar" +
                        ")");
                System.out.println("TREATMENT table created");
            }
        } catch (SQLException ex) {
            System.out.println("something wrong with TREATMENT table creation");
            System.out.println(""+ex);
        }

        try {
            ResultSet rs = dbmd.getTables(null, "APP", "FINAL", null);
            if(!rs.next())
            {
                createStatement.execute("CREATE TABLE FINAL" +
                        "(" +
                        "    PATIENT_ID INT," +
                        "    DATE date," +
                        "    ASSASSMENT long varchar," +
                        "    RESULT varchar(16)" +
                        ")");
                System.out.println("FINAL table created");
            }
        } catch (SQLException ex) {
            System.out.println("something wrong with FINAL table creation");
            System.out.println(""+ex);
        }
    }
}
