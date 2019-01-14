package Controller;

import Modell.Database.DB_Controller;
import ViewControllers.ScreensController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Rectangle2D;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Screen;
import javafx.stage.Stage;

import java.awt.*;
import java.util.Locale;

public class Main extends Application {

    public static String screen1ID = "start";
    public static String screen1File = "/startScreen.fxml";
    public static String screen2ID = "choose";
    public static String screen2File = "/choosePatient.fxml";
    public static String screen3ID = "manage";
    public static String screen3File = "/managePatient.fxml";
    public static String screen4ID = "stat";
    public static String screen4File = "/statistic.fxml";

    public static DB_Controller db;

    public static int patientID=1;
    public static Boolean newPatient;

    Stage window;

    private ScreensController mainContainer;

    @Override
    public void start(Stage primaryStage) throws Exception{
        Locale.setDefault(new Locale("hu", "HUN"));
        primaryStage.setMaximized(true);

        primaryStage.setMinWidth(1100);
        primaryStage.setMinHeight(600);

        mainContainer = new ScreensController();

        mainContainer.loadScreen(Main.screen1ID, Main.screen1File);
        mainContainer.loadScreen(Main.screen2ID, Main.screen2File);
        mainContainer.loadScreen(Main.screen3ID, Main.screen3File);
        mainContainer.loadScreen(Main.screen4ID, Main.screen4File);

        mainContainer.setScreen(Main.screen3ID);


        Group root = new Group();
        root.getChildren().addAll(mainContainer);

        Scene scene = new Scene(root);
        primaryStage.setScene(scene);

        mainContainer.prefWidthProperty().bind(scene.widthProperty());
        mainContainer.prefHeightProperty().bind(scene.heightProperty());


        primaryStage.setTitle("YongQuan");
        root.setStyle("-fx-font-size: 13");
        root.setStyle("-fx-font-family: 'DejaVu Sans'");
        scene.getStylesheets().add(this.getClass().getResource("/view.css").toExternalForm());
        scene.getStylesheets().add(this.getClass().getResource("/font.css").toExternalForm());

        window=primaryStage;
        window.setOnCloseRequest(e -> {
            e.consume();
            clooseProgram();
        });

        primaryStage.show();

    }

    private void clooseProgram() {
        try {
            if (newPatient) {
                mainContainer.getManagePatientController().save();
                System.out.println("save");
            } else{
                mainContainer.getManagePatientController().update();
                System.out.println("update");
            }
            System.exit(0);
        }catch (NullPointerException e) {
            System.exit(0);
        }
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
