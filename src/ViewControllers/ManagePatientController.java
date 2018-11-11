package ViewControllers;

import Controller.Main;
import Modell.*;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;


public class ManagePatientController {

    @FXML
    SplitPane splitPane;
    @FXML
    ChoiceBox<String> pulse1Choicebox;
    @FXML
    ChoiceBox<String> pulse2Choicebox;
    @FXML
    ChoiceBox<String> pulse3Choicebox;
    @FXML
    ChoiceBox<String> pulse4Choicebox;
    @FXML
    ChoiceBox<String> pulse5Choicebox;
    @FXML
    ChoiceBox<String> pulse6Choicebox;
    @FXML
    ChoiceBox<String> pulse7Choicebox;
    @FXML
    ChoiceBox<String> pulse8Choicebox;
    @FXML
    ChoiceBox<String> pulse9Choicebox;
    @FXML
    ChoiceBox<String> pulse10Choicebox;
    @FXML
    ChoiceBox<String> pulse11Choicebox;
    @FXML
    ChoiceBox<String> pulse12Choicebox;
    @FXML
    ChoiceBox<String> pulse13Choicebox;
    @FXML
    ChoiceBox<String> pulse14Choicebox;
    @FXML
    ChoiceBox<String> pulse15Choicebox;
    @FXML
    ChoiceBox<String> pulse16Choicebox;
    @FXML
    ChoiceBox<String> pulse17Choicebox;
    @FXML
    ChoiceBox<String> pulse18Choicebox;
    @FXML
    ChoiceBox<String> pulse19Choicebox;
    @FXML
    ChoiceBox<String> pulse20Choicebox;
    @FXML
    ChoiceBox<String> pulse21Choicebox;
    @FXML
    ChoiceBox<String> pulse22Choicebox;
    @FXML
    ChoiceBox<String> pulse23Choicebox;
    @FXML
    ChoiceBox<String> pulse24Choicebox;
    @FXML
    ChoiceBox<String> finalOpinionChoiceBox;
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
    TextArea tcm1TextArea;
    @FXML
    TextArea tcm2TextArea;
    @FXML
    TextArea tcm3TextArea;
    @FXML
    TextArea tcm4TextArea;
    @FXML
    TextArea tcm5TextArea;
    @FXML
    TextArea tcm6TextArea;
    @FXML
    TextArea tcm7TextArea;
    @FXML
    TextArea tcm8TextArea;
    @FXML
    Button editTextAreasButton;
    @FXML
    TabPane therapyTabPane;
    @FXML
    TabPane jointTabPane;
    @FXML
    DatePicker finalOpinionDatePicker;
    @FXML
    StackPane psychicStackPane1;
    @FXML
    StackPane psychicStackPane2;
    @FXML
    ScrollPane psychicScrollPane;
    @FXML
    TextFlow psychicTextFlow;
    @FXML
    StackPane clinicalHistoryStackPane1;
    @FXML
    StackPane clinicalHistoryStackPane2;
    @FXML
    ScrollPane clinicalHistoryScrollPane;
    @FXML
    TextFlow clinicalHistoryTextFlow;
    @FXML
    StackPane actualStackPane1;
    @FXML
    StackPane actualStackPane2;
    @FXML
    ScrollPane actualScrollPane;
    @FXML
    TextFlow actualTextFlow;
    @FXML
    StackPane tcmStackPane1;
    @FXML
    StackPane tcmStackPane2;
    @FXML
    ScrollPane tcmScrollPane;
    @FXML
    TextFlow tcmTextFlow;
    @FXML
    TextField personalDataTextField1;
    @FXML
    TextField personalDataTextField2;
    @FXML
    TextField personalDataTextField3;
    @FXML
    TextField personalDataTextField4;
    @FXML
    TextField personalDataTextField5;
    @FXML
    TextField personalDataTextField6;
    @FXML
    TextField personalDataTextField7;
    @FXML
    DatePicker personalDataDatePicker;
    @FXML
    VBox personalDataVbox;
    @FXML
    HBox hbox;
    @FXML
    StackPane personalDataStackPane1;
    @FXML
    StackPane personalDataStackPane2;
    @FXML
    Label personalDataLabel1;
    @FXML
    Label personalDataLabel2;
    @FXML
    Label personalDataLabel3;
    @FXML
    Label personalDataLabel4;
    @FXML
    Label personalDataLabel5;
    @FXML
    Label personalDataLabel6;
    @FXML
    Label personalDataLabel7;
    @FXML
    Label personalDataLabel8;
    @FXML
    Label personalDataLabel9;
    @FXML
    ChoiceBox<String> genderChoiceBoxx;
    @FXML
    TextArea pulseTextArea2;
    @FXML
    TextArea pulseTextArea1;
    @FXML
    TextArea finalTextArea;
    @FXML
    StackPane finalStackPane1;
    @FXML
    StackPane finalStackPane2;
    @FXML
    Button treatmentOverViewButton;
    @FXML
    Button addNewTreatmentButton;
    @FXML
    TextFlow finalTextFlow;
    @FXML
    StackPane pulseStackPane1;
    @FXML
    StackPane pulseStackPane2;
    @FXML
    Label pulseLabel1;
    @FXML
    Label pulseLabel2;
    @FXML
    Label pulseLabel3;
    @FXML
    Label pulseLabel4;
    @FXML
    Label pulseLabel5;
    @FXML
    Label pulseLabel6;
    @FXML
    Label pulseLabel7;
    @FXML
    Label pulseLabel8;
    @FXML
    Label pulseLabel9;
    @FXML
    Label pulseLabel10;
    @FXML
    Label pulseLabel11;
    @FXML
    Label pulseLabel12;
    @FXML
    Label pulseLabel13;
    @FXML
    Label pulseLabel14;
    @FXML
    Label pulseLabel15;
    @FXML
    Label pulseLabel16;
    @FXML
    Label pulseLabel17;
    @FXML
    Label pulseLabel18;
    @FXML
    Label pulseLabel19;
    @FXML
    Label pulseLabel20;
    @FXML
    Label pulseLabel21;
    @FXML
    Label pulseLabel22;
    @FXML
    Label pulseLabel23;
    @FXML
    Label pulseLabel24;
    @FXML
    Label genderWarningLabel;
    @FXML
    Label patientNameWarningLabel;
    @FXML
    Label birthDateWarningLabel;


    @FXML
    TextArea treatment1TextArea;


    Boolean patientDataEditable =true;
    Boolean treatmentEditable=true;
    Patient patient= Patient.getInstance();

    ArrayList<ChoiceBox> choiceBoxes;
    ArrayList<TextArea>  psychicTextAreas;
    ArrayList<TextArea>  clinicalHistoryTextAreas;
    ArrayList<TextArea>  actualTextAreas;
    ArrayList<TextArea> tcmTextAreas;
    ArrayList<ArrayList<TextArea>> allTextareas;
    ArrayList<TextFlow> textFlows;
    ArrayList<TextField> personalDateTextFields;

    ArrayList<TreatmentController> treatmentControllers=new ArrayList<>();

    @FXML
    public void initialize(){
        fixEditSplitPane();
        initPulseChoicboxes();
        makeListOfTextAreas();
        makelistOfTextFlows();
        makeListOfpersonalDateTextFields();
        personalDataBindings();
        setDatePickers();
        setPulseBindings();
        addListeners();
    }

    public void load() {
        System.out.println(Main.getNewPatient());
        if(Main.getNewPatient()) {
            System.out.println("uj");
        }else{
            System.out.println("regi");

        }
    }


    private void setPulseBindings() {
        pulseLabel1.textProperty().bind(pulse1Choicebox.valueProperty());
        pulseLabel2.textProperty().bind(pulse2Choicebox.valueProperty());
        pulseLabel3.textProperty().bind(pulse3Choicebox.valueProperty());
        pulseLabel4.textProperty().bind(pulse4Choicebox.valueProperty());
        pulseLabel5.textProperty().bind(pulse5Choicebox.valueProperty());
        pulseLabel6.textProperty().bind(pulse6Choicebox.valueProperty());
        pulseLabel7.textProperty().bind(pulse7Choicebox.valueProperty());
        pulseLabel8.textProperty().bind(pulse8Choicebox.valueProperty());
        pulseLabel9.textProperty().bind(pulse9Choicebox.valueProperty());
        pulseLabel10.textProperty().bind(pulse10Choicebox.valueProperty());
        pulseLabel11.textProperty().bind(pulse11Choicebox.valueProperty());
        pulseLabel12.textProperty().bind(pulse12Choicebox.valueProperty());
        pulseLabel13.textProperty().bind(pulse13Choicebox.valueProperty());
        pulseLabel14.textProperty().bind(pulse14Choicebox.valueProperty());
        pulseLabel15.textProperty().bind(pulse15Choicebox.valueProperty());
        pulseLabel16.textProperty().bind(pulse16Choicebox.valueProperty());
        pulseLabel17.textProperty().bind(pulse17Choicebox.valueProperty());
        pulseLabel18.textProperty().bind(pulse18Choicebox.valueProperty());
        pulseLabel19.textProperty().bind(pulse19Choicebox.valueProperty());
        pulseLabel20.textProperty().bind(pulse20Choicebox.valueProperty());
        pulseLabel21.textProperty().bind(pulse21Choicebox.valueProperty());
        pulseLabel22.textProperty().bind(pulse22Choicebox.valueProperty());
        pulseLabel23.textProperty().bind(pulse23Choicebox.valueProperty());
        pulseLabel24.textProperty().bind(pulse24Choicebox.valueProperty());
        pulseTextArea1.textProperty().bind(pulseTextArea2.textProperty());

    }

    private void setDatePickers() {

    }

    private void personalDataBindings() {
        personalDataLabel1.textProperty().bind(personalDataTextField1.textProperty());
        personalDataLabel2.textProperty().bind(personalDataTextField2.textProperty());
        personalDataLabel3.textProperty().bind(personalDataTextField3.textProperty());
        personalDataLabel4.textProperty().bindBidirectional(personalDataDatePicker.valueProperty(), personalDataDatePicker.getConverter());
        personalDataLabel5.textProperty().bind(personalDataTextField4.textProperty());
        personalDataLabel6.textProperty().bind(personalDataTextField5.textProperty());
        personalDataLabel7.textProperty().bind(personalDataTextField6.textProperty());
        personalDataLabel8.textProperty().bind(personalDataTextField7.textProperty());
        personalDataLabel9.textProperty().bind(genderChoiceBoxx.valueProperty());
    }

    private void makeListOfpersonalDateTextFields() {
        personalDateTextFields=new ArrayList<TextField>();
        personalDateTextFields.add(personalDataTextField1);
        personalDateTextFields.add(personalDataTextField2);
        personalDateTextFields.add(personalDataTextField3);
        personalDateTextFields.add(personalDataTextField4);
        personalDateTextFields.add(personalDataTextField5);
        personalDateTextFields.add(personalDataTextField6);
        personalDateTextFields.add(personalDataTextField7);
    }

    private void makelistOfTextFlows() {
        textFlows=new ArrayList<TextFlow>();
        textFlows.add(psychicTextFlow);
        textFlows.add(clinicalHistoryTextFlow);
        textFlows.add(actualTextFlow);
        textFlows.add(tcmTextFlow);
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

        tcmTextAreas =new ArrayList<TextArea>();
        tcmTextAreas.add(tcm1TextArea);
        tcmTextAreas.add(tcm2TextArea);
        tcmTextAreas.add(tcm3TextArea);
        tcmTextAreas.add(tcm4TextArea);
        tcmTextAreas.add(tcm5TextArea);
        tcmTextAreas.add(tcm6TextArea);
        tcmTextAreas.add(tcm7TextArea);
        tcmTextAreas.add(tcm8TextArea);

        allTextareas=new ArrayList<ArrayList<TextArea>>();
        allTextareas.add(psychicTextAreas);
        allTextareas.add(clinicalHistoryTextAreas);
        allTextareas.add(actualTextAreas);
        allTextareas.add(tcmTextAreas);
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
    private void changeEditability(){
            patientDataEditable =!patientDataEditable;
            if(patientDataEditable){
                editTextAreasButton.setText("Áttekintő mód");
            }else{
                editTextAreasButton.setText("Szerkesztő mód");
            }

            psychicStackPane1.setVisible(!patientDataEditable);
            psychicStackPane2.setVisible(patientDataEditable);
            clinicalHistoryStackPane1.setVisible(!patientDataEditable);
            clinicalHistoryStackPane2.setVisible(patientDataEditable);
            actualStackPane1.setVisible(!patientDataEditable);
            actualStackPane2.setVisible(patientDataEditable);
            tcmStackPane1.setVisible(!patientDataEditable);
            tcmStackPane2.setVisible(patientDataEditable);
            personalDataStackPane1.setVisible(!patientDataEditable);
            personalDataStackPane2.setVisible(patientDataEditable);
            pulseStackPane1.setVisible(!patientDataEditable);
            pulseStackPane2.setVisible(patientDataEditable);

            setDataDisplay();
    }

    private void setDataDisplay() {
        for(TextFlow tf: textFlows){
            tf.getChildren().clear();
        }
        int whichTab=0;
        for(ArrayList<TextArea> textAreasPlace: allTextareas){
            for(TextArea tarea: textAreasPlace){
                    TitledPane tp= (TitledPane) tarea.getParent().getParent();
                    if(!tarea.getText().trim().equals("")){
                    Text label = new Text(tp.getText() + "\n\n");
                    label.getStyleClass().add("labelText");
                    Text content = new Text(tarea.getText() + "\n\n\n");
                    switch (whichTab) {
                        case 0:
                        psychicTextFlow.getChildren().addAll(label, content);
                        break;
                        case 1:
                        clinicalHistoryTextFlow.getChildren().addAll(label, content);
                        break;
                        case 2:
                        actualTextFlow.getChildren().addAll(label, content);
                        break;
                        case 3:
                        tcmTextFlow.getChildren().addAll(label, content);
                        break;
                    }
                }
            }
            whichTab++;
        }
    }


    public void addNewThreatment(MouseEvent mouseEvent) {
        addTreatment();
    }

    private void addTreatment() {
        try {
            int numberOfTabs=therapyTabPane.getTabs().size();
            Tab tab = new Tab();
            therapyTabPane.getTabs().add(numberOfTabs-1,tab);
            FXMLLoader fxmlLoader = new FXMLLoader();
            AnchorPane ap=(AnchorPane) fxmlLoader.load(this.getClass().getResource("/treatment.fxml").openStream());
            TreatmentController treatmentController = (TreatmentController) fxmlLoader.getController();

            tab.setContent(ap);
            tab.setText(String.valueOf(numberOfTabs));
            therapyTabPane.getSelectionModel().select(numberOfTabs-1);
            treatmentControllers.add(treatmentController);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public void setTodayForFinal(MouseEvent mouseEvent) {
        try {
            String date = finalOpinionDatePicker.getValue().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        }catch (Exception e){
            finalOpinionDatePicker.setValue(LocalDate.now());
        }
    }

    public void setTodayForBirthDate(MouseEvent mouseEvent) {
        try {
            String date = personalDataDatePicker.getValue().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        }catch (Exception e){
            personalDataDatePicker.setValue(LocalDate.now());
        }
    }

    private Patient makePatient() {

        String patientDate;
        try {
            patientDate = personalDataDatePicker.getValue().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        }catch (Exception e){
            patientDate=null;
        }
        PatientData patientData = new PatientData(
                personalDataTextField1.getText(),
                personalDataTextField2.getText(),
                personalDataTextField3.getText(),
                patientDate,
                personalDataTextField4.getText(),
                personalDataTextField5.getText(),
                personalDataTextField6.getText(),
                personalDataTextField7.getText(),
                genderChoiceBoxx.getValue()
        );
        patient.setPatientData(patientData);

        Psyche psyche=new Psyche(
                psychic1TextArea.getText(),
                psychic2TextArea.getText(),
                psychic3TextArea.getText()
        );
        patient.setPsyche(psyche);

        History history=new History(
                clinicalHistory1TextArea.getText(),
                clinicalHistory2TextArea.getText(),
                clinicalHistory3TextArea.getText(),
                clinicalHistory4TextArea.getText(),
                clinicalHistory5TextArea.getText(),
                clinicalHistory6TextArea.getText(),
                clinicalHistory7TextArea.getText(),
                clinicalHistory8TextArea.getText(),
                clinicalHistory9TextArea.getText()
        );
        patient.setHistory(history);

        Actual actual=new Actual(
                actual1TextArea.getText(),
                actual2TextArea.getText(),
                actual3TextArea.getText(),
                actual4TextArea.getText(),
                actual5TextArea.getText()
        );
        patient.setActual(actual);


        Tcm tcm=new Tcm(
                tcm1TextArea.getText(),
                tcm2TextArea.getText(),
                tcm3TextArea.getText(),
                tcm4TextArea.getText(),
                tcm5TextArea.getText(),
                tcm6TextArea.getText(),
                tcm7TextArea.getText(),
                tcm8TextArea.getText()
        );
        patient.setTcm(tcm);

        Pulse pulse=new Pulse(
                pulse1Choicebox.getValue(),
                pulse2Choicebox.getValue(),
                pulse3Choicebox.getValue(),
                pulse4Choicebox.getValue(),
                pulse5Choicebox.getValue(),
                pulse6Choicebox.getValue(),
                pulse7Choicebox.getValue(),
                pulse8Choicebox.getValue(),
                pulse9Choicebox.getValue(),
                pulse10Choicebox.getValue(),
                pulse11Choicebox.getValue(),
                pulse12Choicebox.getValue(),
                pulse13Choicebox.getValue(),
                pulse14Choicebox.getValue(),
                pulse15Choicebox.getValue(),
                pulse16Choicebox.getValue(),
                pulse17Choicebox.getValue(),
                pulse18Choicebox.getValue(),
                pulse19Choicebox.getValue(),
                pulse20Choicebox.getValue(),
                pulse21Choicebox.getValue(),
                pulse22Choicebox.getValue(),
                pulse23Choicebox.getValue(),
                pulse24Choicebox.getValue(),
                pulseTextArea2.getText()
        );
        patient.setPulse(pulse);

        String finalDate;
        try {
            finalDate = finalOpinionDatePicker.getValue().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        }catch (Exception e){
            finalDate=null;
        }

        Final finalOpinion = new Final(
                finalDate,
                finalTextArea.getText(),
                finalOpinionChoiceBox.getValue()
        );
        patient.setFinal(finalOpinion);

        ArrayList<Treatment> treatments=new ArrayList<>();

        for(TreatmentController tc: treatmentControllers){
            Treatment tr=new Treatment(
                    tc.getTreatmentDate(),
                    tc.getTreatment1TextArea(),
                    tc.getTreatment2TextArea(),
                    tc.getTreatment3TextArea(),
                    tc.getTreatment4TextArea(),
                    tc.getTreatment5TextArea(),
                    tc.getTreatment6TextArea()
            );
            treatments.add(tr);
        }
        patient.setTreatments(treatments);

        return patient;
    }

    public void setPatient(){
        Main.db.getPatient(patient.getPatient_ID());

        PatientData pd=patient.getPatientData();

        personalDataTextField1.setText(pd.getName());
        personalDataTextField2.setText(pd.getMotherName());
        personalDataTextField3.setText(pd.getBirthPlace());
        personalDataDatePicker.setValue(LocalDate.parse(pd.getBirthDate()));
        personalDataTextField4.setText(pd.getFamilyStatus());
        personalDataTextField5.setText(pd.getJob());
        personalDataTextField6.setText(pd.getEmail());
        personalDataTextField7.setText(pd.getPhone());
        genderChoiceBoxx.setValue(pd.getGender());

        psychic1TextArea.setText(patient.getPsyche().getPsyche1());
        psychic2TextArea.setText(patient.getPsyche().getPsyche2());
        psychic3TextArea.setText(patient.getPsyche().getPsyche3());

        History h=patient.getHistory();
        clinicalHistory1TextArea.setText(h.getHistory1());
        clinicalHistory2TextArea.setText(h.getHistory2());
        clinicalHistory3TextArea.setText(h.getHistory3());
        clinicalHistory4TextArea.setText(h.getHistory4());
        clinicalHistory5TextArea.setText(h.getHistory5());
        clinicalHistory6TextArea.setText(h.getHistory6());
        clinicalHistory7TextArea.setText(h.getHistory7());
        clinicalHistory8TextArea.setText(h.getHistory8());
        clinicalHistory9TextArea.setText(h.getHistory9());

        Actual a=patient.getActual();
        actual1TextArea.setText(a.getActual1());
        actual2TextArea.setText(a.getActual2());
        actual3TextArea.setText(a.getActual3());
        actual4TextArea.setText(a.getActual4());
        actual5TextArea.setText(a.getActual5());



        Tcm t=patient.getTcm();
        tcm1TextArea.setText(t.getTcm1());
        tcm2TextArea.setText(t.getTcm2());
        tcm3TextArea.setText(t.getTcm3());
        tcm4TextArea.setText(t.getTcm4());
        tcm5TextArea.setText(t.getTcm5());
        tcm6TextArea.setText(t.getTcm6());
        tcm7TextArea.setText(t.getTcm7());
        tcm8TextArea.setText(t.getTcm8());

        Pulse p=patient.getPulse();
        pulse1Choicebox.setValue(p.getPulse1());
        pulse2Choicebox.setValue(p.getPulse2());
        pulse3Choicebox.setValue(p.getPulse3());
        pulse4Choicebox.setValue(p.getPulse4());
        pulse5Choicebox.setValue(p.getPulse5());
        pulse6Choicebox.setValue(p.getPulse6());
        pulse7Choicebox.setValue(p.getPulse7());
        pulse8Choicebox.setValue(p.getPulse8());
        pulse9Choicebox.setValue(p.getPulse9());
        pulse10Choicebox.setValue(p.getPulse10());
        pulse11Choicebox.setValue(p.getPulse11());
        pulse12Choicebox.setValue(p.getPulse12());
        pulse13Choicebox.setValue(p.getPulse13());
        pulse14Choicebox.setValue(p.getPulse14());
        pulse15Choicebox.setValue(p.getPulse15());
        pulse16Choicebox.setValue(p.getPulse16());
        pulse17Choicebox.setValue(p.getPulse17());
        pulse18Choicebox.setValue(p.getPulse18());
        pulse19Choicebox.setValue(p.getPulse19());
        pulse20Choicebox.setValue(p.getPulse20());
        pulse21Choicebox.setValue(p.getPulse21());
        pulse22Choicebox.setValue(p.getPulse22());
        pulse23Choicebox.setValue(p.getPulse23());
        pulse24Choicebox.setValue(p.getPulse24());
        pulseTextArea2.setText(p.getOther());

        Final f=patient.getFinal();
        finalOpinionDatePicker.setValue(LocalDate.parse(f.getDate()));
        finalTextArea.setText(f.getAssessment());
        finalOpinionChoiceBox.setValue(f.getResult());

        //treatmentControllers.clear();
        //therapyTabPane.getTabs().clear();


        ArrayList<Treatment> tr=patient.getTreatments();
        int i=tr.size();

        int k=0;
        while (k<i){
            addTreatment();
            k++;
        }
        k=0;
        for(TreatmentController treatmentController: treatmentControllers){
                treatmentController.setTreatmentDatePicker(tr.get(k).getDate());
                treatmentController.setTreatment1TextArea(tr.get(k).getTreatment1());
                treatmentController.setTreatment2TextArea(tr.get(k).getTreatment2());
                treatmentController.setTreatment3TextArea(tr.get(k).getTreatment3());
                treatmentController.setTreatment4TextArea(tr.get(k).getTreatment4());
                treatmentController.setTreatment5TextArea(tr.get(k).getTreatment5());
                treatmentController.setTreatment6TextArea(tr.get(k).getTreatment6());
                treatmentController.setGreenArrows();

                treatmentController.addChangeListeners();
                k++;
        }

    }

    public void treatmentOverviewButton(MouseEvent mouseEvent) {
        treatmentEditable=!treatmentEditable;
        addNewTreatmentButton.setVisible(treatmentEditable);
        finalStackPane1.setVisible(!treatmentEditable);
        finalStackPane2.setVisible(treatmentEditable);
        if(treatmentEditable) {
            treatmentOverViewButton.setText("Áttekintő mód");
        }else {
            makeOverView();
        }
        for (TreatmentController t : treatmentControllers) {
            t.changeEditMode(treatmentEditable);
        }
    }

    private void makeOverView() {
        treatmentOverViewButton.setText("Szerkesztő mód");
        finalTextFlow.getChildren().clear();
        String checkContent;
        try {
            checkContent = finalOpinionDatePicker.getValue().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        } catch (Exception e) {
            checkContent = "";
        }
        if (!checkContent.equals("")) {
            Text label = new Text();
            Text content = new Text();
            label.setText("Záróvélemény dátuma: ");
            content.getStyleClass().add("labelText");
            content.setText(checkContent);
            finalTextFlow.getChildren().addAll(label, content);
        }
        checkContent = finalTextArea.getText();
        if (!checkContent.equals("")) {
            Text label = new Text();
            Text content = new Text();
            label.setText("\n\n\nÉrtékelés\n\n");
            label.getStyleClass().add("labelText");
            content.setText(checkContent);
            finalTextFlow.getChildren().addAll(label, content);
        }
        checkContent = finalOpinionChoiceBox.getValue();
        if (!checkContent.equals("────────")) {
            Text label = new Text();
            Text content = new Text();
            label.setText("\n\n\n\n\nVégső vélemény: ");
            content.getStyleClass().add("labelText");
            content.setText(checkContent);
            finalTextFlow.getChildren().addAll(label, content);
        }
    }

    public void addListeners(){
        for(ArrayList<TextArea> textAreasPlace: allTextareas){
            addChangelisteners(textAreasPlace);
        }
        addChangeListenersForPersonalData();

    }

    private void addChangelisteners(ArrayList<TextArea> textAreasPlace) {
        addChangleListeners(textAreasPlace);
    }

    public static void addChangleListeners(ArrayList<TextArea> textAreasPlace) {
        try{
            for(TextArea tarea: textAreasPlace) {
                tarea.textProperty().addListener(new ChangeListener<String>() {
                    @Override
                    public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                        try {
                            TitledPane tp = (TitledPane) tarea.getParent().getParent();
                            if (!tarea.getText().trim().equals("")) {
                                if (!tp.getStyleClass().contains("green-arrow")) {
                                    tp.getStyleClass().add("green-arrow");
                                }
                            } else {
                                tp.getStyleClass().remove("green-arrow");
                            }
                        }catch (Exception e){

                        }
                    }
                });
            }
        }catch(Exception e){

        }
    }

    private void addChangeListenersForPersonalData(){
        personalDataTextField1.textProperty().addListener((observable, oldValue, newValue) -> {
                if(!personalDataTextField1.getText().trim().equals("")){
                    patientNameWarningLabel.setVisible(false);
                }else{
                    patientNameWarningLabel.setVisible(true);
                }
        });

        personalDataDatePicker.valueProperty().addListener((observable, oldValue, newValue) ->  {
                if(!personalDataDatePicker.getValue().format(DateTimeFormatter.ofPattern("yyyy-MM-dd")).equals("")){
                    birthDateWarningLabel.setVisible(false);
                }else{
                    birthDateWarningLabel.setVisible(true);
                }
        });

        genderChoiceBoxx.valueProperty().addListener((observable, oldValue, newValue) ->  {
                if(!genderChoiceBoxx.getValue().equals("")){
                    genderWarningLabel.setVisible(false);
                }else{
                    genderWarningLabel.setVisible(true);
                }
        });

    }

    public void getPatient(MouseEvent mouseEvent) {

    }

    public void upDatePatient(MouseEvent mouseEvent) {
        Patient patient = makePatient();
        Main.db.updatePatient(patient);
    }

    public void save(MouseEvent mouseEvent) {
        Patient patient = makePatient();

        Main.db.addPatient(patient);
    }
}


