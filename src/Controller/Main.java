package Controller;

import Modell.Database.DB_Controller;
import ViewControllers.ManagePatientController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.Locale;

public class Main extends Application {

    public static DB_Controller db;

    private Stage primaryStage;
    private static ScreenController screenController;
    public static int patientID=214;
    public static Boolean newPatient;
    public static ManagePatientController managePatientController;

    @Override
    public void start(Stage primaryStage) throws Exception{
        Locale.setDefault(new Locale("hu", "HUN"));

        this.primaryStage = primaryStage;
        Parent root = FXMLLoader.load(getClass().getResource("/choosePatient.fxml"));

        Scene scene = new Scene(root);

        primaryStage.setTitle("YongChuan");
        primaryStage.setMaximized(true);
        primaryStage.setScene(scene);
        primaryStage.setMinWidth(800);
        primaryStage.setMinHeight(500);
        primaryStage.show();
        root.setStyle("-fx-font-size: 13");
        root.setStyle("-fx-font-family: 'DejaVu Sans'");
        scene.getStylesheets().add(this.getClass().getResource("/view.css").toExternalForm());
        scene.getStylesheets().add(this.getClass().getResource("/font.css").toExternalForm());

        addScreens(scene);

    }

    private void addScreens(Scene scene) throws Exception{
        this.screenController = new ScreenController(scene);
        screenController.addScreen("startScreen", FXMLLoader.load(getClass().getResource( "/startScreen.fxml" )));
        screenController.addScreen("managePatient", FXMLLoader.load(getClass().getResource( "/managePatient.fxml" )));
        screenController.addScreen("choosePatient", FXMLLoader.load(getClass().getResource( "/choosePatient.fxml" )));
        screenController.addScreen("personalData", FXMLLoader.load(getClass().getResource( "/personalData.fxml" )));
    }

    public static void getStartScreen(){
        screenController.activate("startScreen");
    }

    public static void getmanagePatientScreen(){
        screenController.activate("managePatient");
    }

    public static void getchoosePatientScreen(){
        screenController.activate("choosePatient");
    }

    public static void getpersonalDatatScreen(){
        screenController.activate("personalData");
    }


    public static void main(String[] args) {
        db=new DB_Controller();
        launch(args);
        db.shutDown();
    }

    public static Boolean getNewPatient() {
        return newPatient;
    }

    public static void setNewPatient(Boolean newPatient) {
        Main.newPatient = newPatient;
    }
}
