package ViewControllers;

import Controller.Main;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.input.MouseEvent;

public class PersonalDataController {

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
        Main.getmanagePatientScreen();
    }
}
