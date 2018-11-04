package ViewControllers;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

import java.time.LocalDate;

public class ThreatmentController {

    @FXML
    DatePicker threatmentDatePicker;

    @FXML
    public void initialize() {
        threatmentDatePicker.getEditor().focusedProperty().addListener((obs, oldVal, newVal) ->
                threatmentDatePicker.setValue(LocalDate.now()));
    }
}


