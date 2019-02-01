package ViewControllers;

import Controller.Main;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.*;

import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;

public class StartController implements Initializable, ControlledScreen{

    ScreensController myController;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        int r=getRandomNumber();
        backgroundVBox.getStyleClass().add("background" + r);

    }

    private int getRandomNumber(){
        Random r = new Random();
        int low = 1;
        int high = 13;
        int result = r.nextInt(high-low) + low;
        return result;
    }

    public void setScreenParent(ScreensController screenParent){
        myController = screenParent;
    }

    @FXML
    VBox backgroundVBox;
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
