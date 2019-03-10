package ViewControllers;


import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TitledPane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class TreatmentController {

    @FXML
    DatePicker treatmentDatePicker;
    @FXML
    TextArea treatment1TextArea;
    @FXML
    TextArea treatment2TextArea;
    @FXML
    TextArea treatment3TextArea;
    @FXML
    TextArea treatment4TextArea;
    @FXML
    TextArea treatment5TextArea;
    @FXML
    TextArea treatment6TextArea;
    @FXML
    StackPane treatmentStackPane1;
    @FXML
    StackPane treatmentStackPane2;
    @FXML
    TextFlow treatmentTextFlow;
    @FXML
    TitledPane titledPane1;
    @FXML
    TitledPane titledPane2;
    @FXML
    TitledPane titledPane3;
    @FXML
    TitledPane titledPane4;
    @FXML
    TitledPane titledPane5;
    @FXML
    TitledPane titledPane6;

    private ArrayList<TextArea> treatmentTextAreas;

    @FXML
    public void initialize() {
        try {
            String date = treatmentDatePicker.getValue().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        }catch (Exception e){
            treatmentDatePicker.setValue(LocalDate.now());
        }

        treatmentTextAreas=new ArrayList<>();
        treatmentTextAreas.add(treatment1TextArea);
        treatmentTextAreas.add(treatment2TextArea);
        treatmentTextAreas.add(treatment3TextArea);
        treatmentTextAreas.add(treatment4TextArea);
        treatmentTextAreas.add(treatment5TextArea);
        treatmentTextAreas.add(treatment6TextArea);

        addChangeListener(treatment1TextArea, titledPane1);
        addChangeListener(treatment2TextArea, titledPane2);
        addChangeListener(treatment3TextArea, titledPane3);
        addChangeListener(treatment4TextArea, titledPane4);
        addChangeListener(treatment5TextArea, titledPane5);
        addChangeListener(treatment6TextArea, titledPane6);
    }

    public String getTreatmentDate(){
        try {
            return treatmentDatePicker.getValue().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        }catch (Exception e){
            return "no date";
        }
    }

    public void changeEditMode(Boolean editable) {
        treatmentStackPane1.setVisible(!editable);
        treatmentStackPane2.setVisible(editable);

        if (!editable) {
            treatmentTextFlow.getChildren().clear();
            Text text1 = new Text("Kezelés időpontja: ");
            Text text2 = new Text(getTreatmentDate() + "\n\n\n");
            text2.getStyleClass().add("date");
            treatmentTextFlow.getChildren().addAll(text1, text2);

            for (TextArea ta : treatmentTextAreas) {
                TitledPane tp = (TitledPane) ta.getParent().getParent();
                if (!ta.getText().equals("")) {
                    Text label = new Text(tp.getText() + "\n\n");
                    label.getStyleClass().add("labelText");
                    Text content = new Text(ta.getText() + "\n\n\n");
                    treatmentTextFlow.getChildren().addAll(label, content);
                }
            }
        }
    }

    public String getTreatment1TextArea(){
        return treatment1TextArea.getText();
    }
    public String getTreatment2TextArea(){
        return treatment2TextArea.getText();
    }
    public String getTreatment3TextArea(){
        return treatment3TextArea.getText();
    }
    public String getTreatment4TextArea(){
        return treatment4TextArea.getText();
    }
    public String getTreatment5TextArea(){
        return treatment5TextArea.getText();
    }
    public String getTreatment6TextArea(){
        return treatment6TextArea.getText();
    }

    public void setTreatment1TextArea(String content){
        treatment1TextArea.setText(content);
    }
    public void setTreatment2TextArea(String content){
        treatment2TextArea.setText(content);
    }
    public void setTreatment3TextArea(String content){
        treatment3TextArea.setText(content);
    }
    public void setTreatment4TextArea(String content){
        treatment4TextArea.setText(content);
    }
    public void setTreatment5TextArea(String content){
        treatment5TextArea.setText(content);
    }
    public void setTreatment6TextArea(String content){
        treatment6TextArea.setText(content);
    }
    public void setTreatmentDatePicker(String content){
        treatmentDatePicker.setValue(LocalDate.parse(content));
    }

    public void addChangeListener(TextArea tarea, TitledPane tp){
        MeridiansController.arrowColorChanger(tarea, tp);
    }


    public void setGreenArrows() {
        if(!treatment1TextArea.getText().trim().equals("")){
            titledPane1.getStyleClass().add("green-arrow");
        }
        if(!treatment2TextArea.getText().trim().equals("")){
            titledPane2.getStyleClass().add("green-arrow");
        }
        if(!treatment3TextArea.getText().trim().equals("")){
            titledPane3.getStyleClass().add("green-arrow");
        }
        if(!treatment4TextArea.getText().trim().equals("")){
            titledPane4.getStyleClass().add("green-arrow");
        }
        if(!treatment5TextArea.getText().trim().equals("")){
            titledPane5.getStyleClass().add("green-arrow");
        }
        if(!treatment6TextArea.getText().trim().equals("")){
            titledPane6.getStyleClass().add("green-arrow");
        }
    }
}


