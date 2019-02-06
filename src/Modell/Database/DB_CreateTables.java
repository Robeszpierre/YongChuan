package Modell.Database;

import java.sql.ResultSet;
import java.sql.SQLException;

public class DB_CreateTables extends  DB_Config {


    public DB_CreateTables() {
        try {
            ResultSet rs = dbmd.getTables(null, getUSERNAME().toUpperCase(), "PATIENT_DATA", null);
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
                        "    GENDER varchar(5)," +
                        "    LAST_MODIFIED date" +
                        ")");
                System.out.println("PATIENT_DATA table created");
            }
        } catch (SQLException ex) {
            System.out.println("something wrong with PATIENT_DATA table creation");
            System.out.println(""+ex);
        }

        try {
            ResultSet rs = dbmd.getTables(null, getUSERNAME().toUpperCase(), "SYMPTOMS", null);
            if(!rs.next())
            {
                createStatement.execute("CREATE TABLE SYMPTOMS" +
                        "(" +
                        "    PATIENT_ID INT," +
                        "    NAME varchar(100)," +
                        "    LOCATION varchar(5)," +
                        "    TYPE int," +
                        "    IMPORTANT BOOLEAN" +
                        ")");
                System.out.println("symptoms table created");
            }
        } catch (SQLException ex) {
            System.out.println("something wrong with symptoms table creation");
            System.out.println(""+ex);
        }

        try {
            ResultSet rs = dbmd.getTables(null, getUSERNAME().toUpperCase(), "PSYCHE", null);
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
            ResultSet rs = dbmd.getTables(null, getUSERNAME().toUpperCase(), "HISTORY", null);
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
            ResultSet rs = dbmd.getTables(null, getUSERNAME().toUpperCase(), "ACTUAL", null);
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
            ResultSet rs = dbmd.getTables(null, getUSERNAME().toUpperCase(), "TCM", null);
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
            ResultSet rs = dbmd.getTables(null, getUSERNAME().toUpperCase(), "PULSE", null);
            if(!rs.next())
            {
                createStatement.execute("CREATE TABLE PULSE" +
                        "(" +
                        "    PATIENT_ID INT," +
                        "    PULSE1 varchar(20) ," +
                        "    PULSE2 varchar(20)," +
                        "    PULSE3 varchar(20)," +
                        "    PULSE4 varchar(20)," +
                        "    PULSE5 varchar(20)," +
                        "    PULSE6 varchar(20)," +
                        "    PULSE7 varchar(20)," +
                        "    PULSE8 varchar(20)," +
                        "    PULSE9 varchar(20)," +
                        "    PULSE10 varchar(20)," +
                        "    PULSE11 varchar(20)," +
                        "    PULSE12 varchar(20)," +
                        "    PULSE13 varchar(20)," +
                        "    PULSE14 varchar(20)," +
                        "    PULSE15 varchar(20)," +
                        "    PULSE16 varchar(20)," +
                        "    PULSE17 varchar(20)," +
                        "    PULSE18 varchar(20)," +
                        "    PULSE19 varchar(20)," +
                        "    PULSE20 varchar(20)," +
                        "    PULSE21 varchar(20)," +
                        "    PULSE22 varchar(20)," +
                        "    PULSE23 varchar(20)," +
                        "    PULSE24 varchar(20)," +
                        "    other long varchar" +
                        ")");
                System.out.println("PULSE table created");
            }
        } catch (SQLException ex) {
            System.out.println("something wrong with PULSE table creation");
            System.out.println(""+ex);
        }

        try {
            ResultSet rs = dbmd.getTables(null, getUSERNAME().toUpperCase(), "TREATMENT", null);
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
            ResultSet rs = dbmd.getTables(null, getUSERNAME().toUpperCase(), "FINAL", null);
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

        try {
            ResultSet rs = dbmd.getTables(null, getUSERNAME().toUpperCase(), "SYMPTOMS_SAVE", null);
            if(!rs.next())
            {
                createStatement.execute("CREATE TABLE SYMPTOMS_SAVE" +
                        "(" +
                        "    PATIENT_ID INT," +
                        "    RADIOBUTTONS long varchar," +
                        "    TEXTFIELDS long varchar," +
                        "    CHECKBOXES long varchar," +
                        "    COMBOBOXES long varchar," +
                        "    SPINNERS long varchar" +
                        ")");
                System.out.println("SYMPTOMS_SAVE table created");
            }
        } catch (SQLException ex) {
            System.out.println("something wrong with SYMPTOMS_SAVE table creation");
            System.out.println(""+ex);
        }
        try {
            ResultSet rs = dbmd.getTables(null, getUSERNAME().toUpperCase(), "IMAGES", null);
            if(!rs.next())
            {
                createStatement.execute("CREATE TABLE IMAGES" +
                        "(" +
                        "    PATIENT_ID INT," +
                        "    EAR blob," +
                        "    EAR_DESCRIPTION long varchar," +
                        "    TONGUE blob," +
                        "    TONGUE_DESCRIPTION long varchar" +
                        ")");
                System.out.println("IMAGES table created");
            }
        } catch (SQLException ex) {
            System.out.println("something wrong with IMAGES table creation");
            System.out.println(""+ex);
        }
        try {
            ResultSet rs = dbmd.getTables(null, getUSERNAME().toUpperCase(), "SETTINGS", null);
            if(!rs.next())
            {
                createStatement.execute("CREATE TABLE SETTINGS" +
                        "(" +
                        "    FONT_SIZE smallint," +
                        "    FONT_FAMILY varchar(100)" +
                        ")");
                System.out.println("SETTINGS table created");
                //insert initial data
                conn.createStatement().executeUpdate("insert into SETTINGS (FONT_SIZE, FONT_FAMILY) values (13, 'DejaVu Sans')");
            }
        } catch (SQLException ex) {
            System.out.println("something wrong with SETTINGS table creation");
            System.out.println(""+ex);
        }

        try {
            ResultSet rs = dbmd.getTables(null, getUSERNAME().toUpperCase(), "MERIDIANS", null);
            if(!rs.next())
            {
                createStatement.execute("CREATE TABLE MERIDIANS" +
                        "(" +
                        "    PATIENT_ID INT," +
                        "    MERIDIAN1 long varchar ," +
                        "    MERIDIAN2 long varchar," +
                        "    MERIDIAN3 long varchar," +
                        "    MERIDIAN4 long varchar," +
                        "    MERIDIAN5 long varchar," +
                        "    MERIDIAN6 long varchar," +
                        "    MERIDIAN7 long varchar," +
                        "    MERIDIAN8 long varchar," +
                        "    MERIDIAN9 long varchar," +
                        "    MERIDIAN10 long varchar," +
                        "    MERIDIAN11 long varchar," +
                        "    MERIDIAN12 long varchar," +
                        "    MERIDIAN13 long varchar," +
                        "    MERIDIAN14 long varchar," +
                        "    MERIDIAN15 long varchar," +
                        "    MERIDIAN16 long varchar," +
                        "    MERIDIAN17 long varchar," +
                        "    MERIDIAN18 long varchar," +
                        "    MERIDIAN19 long varchar," +
                        "    MERIDIAN20 long varchar" +
                        ")");
                System.out.println("MERIDIANS table created");
            }
        } catch (SQLException ex) {
            System.out.println("something wrong with MERIDIANS table creation");
            System.out.println(""+ex);
        }
    }
}
