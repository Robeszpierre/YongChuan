package Modell.Database;

import java.sql.*;

public class DB_Config {
    final String JDBC_DRIVER = "org.apache.derby.jdbc.EmbeddedDriver";
    final String URL = "jdbc:derby:YongQuanDB;create=true";
    final String URL2 = "jdbc:derby:;shutdown=true";
    final String USERNAME = "sagodi";
    final String PASSWORD = "zsuzsa";

    //Létrehozzuk a kapcsolatot (hidat)
    Connection conn = null;
    Statement createStatement = null;
    DatabaseMetaData dbmd = null;

    //create Database
    public DB_Config() {
        //trying to get alive
        try {
            conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);

            System.out.println("the bridge is created");
        } catch (SQLException ex) {
            System.out.println("Valami baj van a connection (híd) létrehozásakor.");
            System.out.println("" + ex);
        }

        //Ha életre kelt, csinálunk egy megpakolható teherautót
        if (conn != null) {
            try {
                createStatement = conn.createStatement();
            } catch (SQLException ex) {
                System.out.println("Valami baj van van a createStatament (teherautó) létrehozásakor.");
                System.out.println("" + ex);
            }
        }

        //Check if the database is empty? Check if the table exists.
        try {
            dbmd = conn.getMetaData();
        } catch (SQLException ex) {
            System.out.println("Valami baj van a DatabaseMetaData (adatbázis leírása) létrehozásakor..");
            System.out.println("" + ex);
        }


        //create Tables

    }

    public void shutDown(){
        try {
            DriverManager.getConnection(URL2);

        } catch (SQLException ex) {
            if (ex.getSQLState().equals("XJ015")) {
                System.out.println("Derby shutdown normally");
            } else {
                System.out.println("Could not close the Database | " +ex);
            }
        }
    }

    public String getUSERNAME() {
        return USERNAME;
    }

    public String getPASSWORD() {
        return PASSWORD;
    }
}
