package ViewControllers;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.input.MouseEvent;

import java.time.LocalDate;

public class ThreatmentController {

    @FXML
    DatePicker threatmentDatePicker;

    public void setCurrentDate(ActionEvent actionEvent) {

    }

    public void setToday(MouseEvent mouseEvent) {
        threatmentDatePicker.setValue(LocalDate.now());
    }
}
