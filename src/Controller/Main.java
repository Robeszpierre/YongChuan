package Controller;

import Modell.Database.DB_Controller;
import ViewControllers.ScreensController;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.util.Pair;

import java.util.Locale;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicBoolean;

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

    public static int patientID;
    public static Boolean newPatient;

    private static Stage window;

    private ScreensController mainContainer;
    private Group root;
    private Dialog<Pair<String, String>> dialog;

    @Override
    public void start(Stage primaryStage) throws Exception{
        createDialog();
        while(!authenticate()){

        }
        Locale.setDefault(new Locale("hu", "HUN"));
        primaryStage.setMaximized(true);
        window=primaryStage;

        primaryStage.setMinWidth(1100);
        primaryStage.setMinHeight(600);

        mainContainer = new ScreensController();

        mainContainer.loadScreen(Main.screen1ID, Main.screen1File);
        mainContainer.loadScreen(Main.screen2ID, Main.screen2File);
        mainContainer.loadScreen(Main.screen3ID, Main.screen3File);
        mainContainer.loadScreen(Main.screen4ID, Main.screen4File);
        mainContainer.loadScreen(Main.screen5ID, Main.screen5File);

        mainContainer.setScreen(Main.screen1ID);


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

        window.setOnCloseRequest(e -> {
            e.consume();
            closeProgram();
        });

        window.getIcons().add(new Image(this.getClass().getResource("/img/tcm.png").toString()));

        primaryStage.show();
    }


    public void closeProgram() {
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

    private void createDialog(){
        dialog = new Dialog<>();
        dialog.setTitle("Bejelentkezés");
        dialog.setHeaderText("Kérem adja meg a jelszavát és felhasználónevét!");

// Set the icon (must be included in the project).
        dialog.setGraphic(new ImageView(new Image("img/login.png")));
        Stage stage = (Stage) dialog.getDialogPane().getScene().getWindow();
        stage.getIcons().add(new Image(this.getClass().getResource("/img/login.png").toString()));

        stage.setOnCloseRequest(e -> {
            e.consume();
            closeProgram();
        });


// Set the button types.
        ButtonType loginButtonType = new ButtonType("Bejelentkezés", ButtonBar.ButtonData.OK_DONE);
        ButtonType cancelButtonType = new ButtonType("Kilépés", ButtonBar.ButtonData.OK_DONE);
        dialog.getDialogPane().getButtonTypes().addAll(loginButtonType, cancelButtonType);

// Create the username and password labels and fields.
        GridPane grid = new GridPane();
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(20, 150, 10, 10));

        TextField username = new TextField();
        username.setPromptText("Felhasználónév");
        PasswordField password = new PasswordField();
        password.setPromptText("Jelszó");

        grid.add(new Label("Felhasználónév:"), 0, 0);
        grid.add(username, 1, 0);
        grid.add(new Label("Jelszó:"), 0, 1);
        grid.add(password, 1, 1);

// Enable/Disable login button depending on whether a username was entered.
        Node loginButton = dialog.getDialogPane().lookupButton(loginButtonType);
        loginButton.setDisable(true);

// Do some validation (using the Java 8 lambda syntax).
        username.textProperty().addListener((observable, oldValue, newValue) -> {
            loginButton.setDisable(newValue.trim().isEmpty());
        });

        dialog.getDialogPane().setContent(grid);

// Request focus on the username field by default.
        Platform.runLater(() -> username.requestFocus());

// Convert the result to a username-password-pair when the login button is clicked.
        dialog.setResultConverter(dialogButton -> {
            if (dialogButton == loginButtonType) {
                return new Pair<>(username.getText(), password.getText());
            }else{
                closeProgram();
            }
            return null;
        });
    }

    private boolean authenticate(){
        Optional<Pair<String, String>> result = this.dialog.showAndWait();
        AtomicBoolean correct= new AtomicBoolean(false);

        result.ifPresent(usernamePassword -> {
           if(usernamePassword.getKey().equals(Main.db.getUSERNAME()) && usernamePassword.getValue().equals(Main.db.getPASSWORD())){
               correct.set(true);
           }
        });
        return correct.get();
    }

    public static Boolean getNewPatient() {
        return newPatient;
    }

    public static void setNewPatient(Boolean newPatient) {
        Main.newPatient = newPatient;
    }

    public static Stage getWindow() {
        return window;
    }
}
