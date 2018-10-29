package ViewControllers;

import Controller.Main;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;

import javax.swing.text.TableView;

public class ChoosePatientController {
    @FXML
    TableView patientsTable;

    public void selectPatient(MouseEvent mouseEvent) {
        Main.getmanagePatientScreen();
    }

    public void addNewPatient(MouseEvent mouseEvent) {
        Main.getpersonalDatatScreen();
    }
}
