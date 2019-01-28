package ViewControllers;

import Controller.Main;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.*;

import java.net.URL;
import java.util.ResourceBundle;

public class StartController implements Initializable, ControlledScreen{

    ScreensController myController;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    public void setScreenParent(ScreensController screenParent){
        myController = screenParent;
    }

    @FXML
    VBox background;
    @FXML
    AnchorPane main;

    @FXML
    public void getchoosePatientScreen(MouseEvent mouseEvent) {
        myController.setScreen(Main.screen2ID);
    }


    public void getStartScreen(MouseEvent mouseEvent) {
        myController.setScreen(Main.screen4ID);
    }

    public void getSetting(MouseEvent mouseEvent) {
        myController.setScreen(Main.screen5ID);
    }
}
