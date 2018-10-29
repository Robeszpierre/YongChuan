package Controller;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.Locale;

public class Main extends Application {

    private Stage primaryStage;
    private static ScreenController screenController;

    @Override
    public void start(Stage primaryStage) throws Exception{
        Locale.setDefault(new Locale("hu", "HUN"));

        this.primaryStage = primaryStage;
        Parent root = FXMLLoader.load(getClass().getResource("../View/startScreen.fxml"));

        Scene scene = new Scene(root);

        primaryStage.setTitle("YongChuan");
        primaryStage.setMaximized(true);
        primaryStage.setScene(scene);
        primaryStage.show();
        scene.getStylesheets().add(this.getClass().getResource("../View/view.css").toExternalForm());

        addSetScreens(scene);
    }

    private void addSetScreens(Scene scene) throws Exception{
        this.screenController = new ScreenController(scene);
        screenController.addScreen("startScreen", FXMLLoader.load(getClass().getResource( "../View/startScreen.fxml" )));
        screenController.addScreen("managePatient", FXMLLoader.load(getClass().getResource( "../View/managePatient.fxml" )));
        screenController.addScreen("choosePatient", FXMLLoader.load(getClass().getResource( "../View/choosePatient.fxml" )));
        screenController.addScreen("personalData", FXMLLoader.load(getClass().getResource( "../View/personalData.fxml" )));
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
        launch(args);
    }
}
