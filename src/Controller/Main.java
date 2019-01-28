package Controller;

import Modell.Database.DB_Controller;
import ViewControllers.ScreensController;
import javafx.application.Application;
import javafx.beans.binding.Bindings;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

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
    public static String screen5ID = "settings";
    public static String screen5File = "/settings.fxml";

    public static DB_Controller db;

    public static int patientID=1;
    public static Boolean newPatient;

    Stage window;

    private ScreensController mainContainer;
    private Group root;

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
        mainContainer.loadScreen(Main.screen5ID, Main.screen5File);

        mainContainer.setScreen(Main.screen2ID);


        root = new Group();
        root.getChildren().addAll(mainContainer);
        mainContainer.setRoot(root);

        Scene scene = new Scene(root, 500, 500, Color.GREY);
        primaryStage.setScene(scene);

        mainContainer.prefWidthProperty().bind(scene.widthProperty());
        mainContainer.prefHeightProperty().bind(scene.heightProperty());

        primaryStage.setTitle("YongQuan");
        scene.getStylesheets().add(this.getClass().getResource("/font.css").toExternalForm());
        scene.getStylesheets().add(this.getClass().getResource("/view.css").toExternalForm());

        mainContainer.getSettingsController().setSettings();

        window=primaryStage;
        window.setOnCloseRequest(e -> {
            e.consume();
            closeProgram();
        });

        primaryStage.show();

    }


    private void closeProgram() {
        try {
            if (newPatient) {
                mainContainer.getManagePatientController().save();
            } else{
                mainContainer.getManagePatientController().update();
            }
            db.shutDown();
            System.exit(0);
        }catch (NullPointerException e) {
            db.shutDown();
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        db=new DB_Controller();
        launch(args);

    }

    public static Boolean getNewPatient() {
        return newPatient;
    }

    public static void setNewPatient(Boolean newPatient) {
        Main.newPatient = newPatient;
    }
}
