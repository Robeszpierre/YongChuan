package ViewControllers;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Side;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;


public class ManagePatientController {

    @FXML
    SplitPane splitPane;
    @FXML
    ChoiceBox pulse1Choicebox;
    @FXML
    ChoiceBox pulse2Choicebox;
    @FXML
    ChoiceBox pulse3Choicebox;
    @FXML
    ChoiceBox pulse4Choicebox;
    @FXML
    ChoiceBox pulse5Choicebox;
    @FXML
    ChoiceBox pulse6Choicebox;
    @FXML
    ChoiceBox pulse7Choicebox;
    @FXML
    ChoiceBox pulse8Choicebox;
    @FXML
    ChoiceBox pulse9Choicebox;
    @FXML
    ChoiceBox pulse10Choicebox;
    @FXML
    ChoiceBox pulse11Choicebox;
    @FXML
    ChoiceBox pulse12Choicebox;
    @FXML
    ChoiceBox pulse13Choicebox;
    @FXML
    ChoiceBox pulse14Choicebox;
    @FXML
    ChoiceBox pulse15Choicebox;
    @FXML
    ChoiceBox pulse16Choicebox;
    @FXML
    ChoiceBox pulse17Choicebox;
    @FXML
    ChoiceBox pulse18Choicebox;
    @FXML
    ChoiceBox pulse19Choicebox;
    @FXML
    ChoiceBox pulse20Choicebox;
    @FXML
    ChoiceBox pulse21Choicebox;
    @FXML
    ChoiceBox pulse22Choicebox;
    @FXML
    ChoiceBox pulse23Choicebox;
    @FXML
    ChoiceBox pulse24Choicebox;
    @FXML
    ChoiceBox finalOpinionChoiceBox;
    @FXML
    TextArea psychic1TextArea;
    @FXML
    TextArea psychic2TextArea;
    @FXML
    TextArea psychic3TextArea;
    @FXML
    TextArea clinicalHistory1TextArea;
    @FXML
    TextArea clinicalHistory2TextArea;
    @FXML
    TextArea clinicalHistory3TextArea;
    @FXML
    TextArea clinicalHistory4TextArea;
    @FXML
    TextArea clinicalHistory5TextArea;
    @FXML
    TextArea clinicalHistory6TextArea;
    @FXML
    TextArea clinicalHistory7TextArea;
    @FXML
    TextArea clinicalHistory8TextArea;
    @FXML
    TextArea clinicalHistory9TextArea;
    @FXML
    TextArea actual1TextArea;
    @FXML
    TextArea actual2TextArea;
    @FXML
    TextArea actual3TextArea;
    @FXML
    TextArea actual4TextArea;
    @FXML
    TextArea actual5TextArea;
    @FXML
    TextArea hko1TextArea;
    @FXML
    TextArea hko2TextArea;
    @FXML
    TextArea hko3TextArea;
    @FXML
    TextArea hko4TextArea;
    @FXML
    TextArea hko5TextArea;
    @FXML
    TextArea hko6TextArea;
    @FXML
    TextArea hko7TextArea;
    @FXML
    TextArea hko8TextArea;
    @FXML
    Button editTextAreasButton;
    @FXML
    TabPane therapyTabPane;
    @FXML
    TabPane jointTabPane;
    @FXML
    DatePicker finalOpinionDatePicker;

    Boolean editable=false;

    ArrayList<ChoiceBox> choiceBoxes;
    ArrayList<TextArea>  psychicTextAreas;
    ArrayList<TextArea>  clinicalHistoryTextAreas;
    ArrayList<TextArea>  actualTextAreas;
    ArrayList<TextArea>  hkoTextAreas;
    ArrayList<ArrayList<TextArea>> allTextareas;

    @FXML
    public void initialize(){
        fixEditSplitPane();
        initPulseChoicboxes();
        makeListOfTextAreas();
    }

    private void makeListOfTextAreas() {
        psychicTextAreas=new ArrayList<TextArea>();
        psychicTextAreas.add(psychic1TextArea);
        psychicTextAreas.add(psychic2TextArea);
        psychicTextAreas.add(psychic3TextArea);

        clinicalHistoryTextAreas=new ArrayList<TextArea>();
        clinicalHistoryTextAreas.add(clinicalHistory1TextArea);
        clinicalHistoryTextAreas.add(clinicalHistory2TextArea);
        clinicalHistoryTextAreas.add(clinicalHistory3TextArea);
        clinicalHistoryTextAreas.add(clinicalHistory4TextArea);
        clinicalHistoryTextAreas.add(clinicalHistory5TextArea);
        clinicalHistoryTextAreas.add(clinicalHistory6TextArea);
        clinicalHistoryTextAreas.add(clinicalHistory7TextArea);
        clinicalHistoryTextAreas.add(clinicalHistory8TextArea);
        clinicalHistoryTextAreas.add(clinicalHistory9TextArea);

        actualTextAreas=new ArrayList<TextArea>();
        actualTextAreas.add(actual1TextArea);
        actualTextAreas.add(actual2TextArea);
        actualTextAreas.add(actual3TextArea);
        actualTextAreas.add(actual4TextArea);
        actualTextAreas.add(actual5TextArea);

        hkoTextAreas=new ArrayList<TextArea>();
        hkoTextAreas.add(hko1TextArea);
        hkoTextAreas.add(hko2TextArea);
        hkoTextAreas.add(hko3TextArea);
        hkoTextAreas.add(hko4TextArea);
        hkoTextAreas.add(hko5TextArea);
        hkoTextAreas.add(hko6TextArea);
        hkoTextAreas.add(hko7TextArea);
        hkoTextAreas.add(hko8TextArea);

        allTextareas=new ArrayList<ArrayList<TextArea>>();
        allTextareas.add(psychicTextAreas);
        allTextareas.add(clinicalHistoryTextAreas);
        allTextareas.add(actualTextAreas);
        allTextareas.add(hkoTextAreas);
    }


    private void initPulseChoicboxes() {
        choiceBoxes=new ArrayList<ChoiceBox>();
        choiceBoxes.add(pulse1Choicebox);
        choiceBoxes.add(pulse2Choicebox);
        choiceBoxes.add(pulse3Choicebox);
        choiceBoxes.add(pulse4Choicebox);
        choiceBoxes.add(pulse5Choicebox);
        choiceBoxes.add(pulse6Choicebox);
        choiceBoxes.add(pulse7Choicebox);
        choiceBoxes.add(pulse8Choicebox);
        choiceBoxes.add(pulse9Choicebox);
        choiceBoxes.add(pulse10Choicebox);
        choiceBoxes.add(pulse11Choicebox);
        choiceBoxes.add(pulse12Choicebox);
        choiceBoxes.add(pulse13Choicebox);
        choiceBoxes.add(pulse14Choicebox);
        choiceBoxes.add(pulse15Choicebox);
        choiceBoxes.add(pulse16Choicebox);
        choiceBoxes.add(pulse17Choicebox);
        choiceBoxes.add(pulse18Choicebox);
        choiceBoxes.add(pulse19Choicebox);
        choiceBoxes.add(pulse20Choicebox);
        choiceBoxes.add(pulse21Choicebox);
        choiceBoxes.add(pulse22Choicebox);
        choiceBoxes.add(pulse23Choicebox);
        choiceBoxes.add(pulse24Choicebox);

        ObservableList<String> firstColumn = FXCollections.observableArrayList("────────","felületes","közép","mély");
        ObservableList<String> secondColumn = FXCollections.observableArrayList("────────","gyors","normális","lassú");
        ObservableList<String> thirdColumn = FXCollections.observableArrayList("────────","erőteljes","normális","gyenge");
        ObservableList<String> fortthColumn = FXCollections.observableArrayList("────────","szabályos","kihagyó");


        int i=0;
        for(ChoiceBox cbox: choiceBoxes){
            int result=i%4;
            switch (result) {
                case 0:
                    cbox.setItems(firstColumn);
                    break;
                case 1:
                    cbox.setItems(secondColumn);
                    break;
                case 2:
                    cbox.setItems(thirdColumn);
                    break;
                case 3:
                    cbox.setItems(fortthColumn);
                    break;
            }
            i++;
            cbox.getSelectionModel().selectFirst();
        }
    }

    private void fixEditSplitPane() {
        splitPane.heightProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
                double height = splitPane.getHeight();
                double dividerPositionFromTop = 30;
                splitPane.setDividerPosition(0, 1-dividerPositionFromTop/height);
            }
        });
    }

    //Szerkesztés button clicked
    @FXML
    private void changeTextearesEditability(){
        if(editable){
            editable=false;
            editTextAreasButton.setText("Szerkesztés");
        }else{
            editable=true;
            editTextAreasButton.setText("Szerkesztés befejezése");
        }
        for(ArrayList<TextArea> textAreasPlace: allTextareas){
            for(TextArea tarea: textAreasPlace){
                tarea.setEditable(editable);
            }
        }
        if(!editable) {
            disableUnUsedTitledPanes();
        }else{
            enableAllTitledPanes();
        }
    }

    private void enableAllTitledPanes() {
        for(ArrayList<TextArea> textAreasPlace: allTextareas){
            for(TextArea tarea: textAreasPlace){
                    TitledPane tp= (TitledPane) tarea.getParent().getParent();
                    tp.setDisable(false);
            }
        }
    }

    private void disableUnUsedTitledPanes(){
        for(ArrayList<TextArea> textAreasPlace: allTextareas){
            for(TextArea tarea: textAreasPlace){
                if(tarea.getText().equals("")){
                    TitledPane tp= (TitledPane) tarea.getParent().getParent();
                    tp.setDisable(true);
                }
            }
        }
    }


    public void addNewThreatment(MouseEvent mouseEvent) {
        try {
            int numberOfTabs=therapyTabPane.getTabs().size();
            Tab tab = new Tab();
            therapyTabPane.getTabs().add(numberOfTabs-1,tab);
            tab.setContent((Node) FXMLLoader.load(this.getClass().getResource("../View/threatment.fxml")));
            tab.setText(String.valueOf(numberOfTabs));
            therapyTabPane.getSelectionModel().select(numberOfTabs-1);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void setToday(MouseEvent mouseEvent) {
        finalOpinionDatePicker.setValue(LocalDate.now());
    }
}


