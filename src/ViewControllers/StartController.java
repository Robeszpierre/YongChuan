package ViewControllers;

import Controller.Main;
import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.*;

public class StartController {
    @FXML
    VBox background;

    public void getchoosePatientScreen(MouseEvent mouseEvent) {
        Main.getchoosePatientScreen();
    }
}
