package ViewControllers;

import Controller.Main;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.input.MouseEvent;

import java.net.URL;
import java.util.ResourceBundle;

public class PersonalDataController implements Initializable, ControlledScreen {

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
    ComboBox genderCombobox;

    @FXML
    public void initialize(){
        setButtonItems();
    }


    private void setButtonItems(){
        genderCombobox.getItems().addAll("férfi", "nő");
    }

    public void addNewPatientData(MouseEvent mouseEvent) {

    }


}
