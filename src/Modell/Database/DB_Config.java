package Modell.Database;

import java.sql.*;

public class DB_Config {
    final String JDBC_DRIVER = "org.apache.derby.jdbc.EmbeddedDriver";
    final String URL = "jdbc:derby:YongQuanDB;create=true";
    final String URL2 = "jdbc:derby:YongQuanDB;shutdown=true";
    final String USERNAME = "";
    final String PASSWORD = "";

    //Létrehozzuk a kapcsolatot (hidat)
    Connection conn = null;
    Statement createStatement = null;
    DatabaseMetaData dbmd = null;

    //create Database
    public DB_Config() {
        //Megpróbáljuk életre kelteni
        try {
            conn = DriverManager.getConnection(URL);
            System.out.println("A híd létrejött");
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

        //Megnézzük, hogy üres-e az adatbázis? Megnézzük, létezik-e az adott adattábla.
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
            DriverManager.getConnection("jdbc:derby:;shutdown=true");

        } catch (SQLException ex) {
            if (ex.getSQLState().equals("XJ015")) {
                System.out.println("Derby shutdown normally");
            } else {
                System.out.println("Could not close the Database | " +ex);
            }
        }
    }
}
