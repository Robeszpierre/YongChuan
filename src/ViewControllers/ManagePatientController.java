package ViewControllers;

import Controller.Main;
import Controller.SecureLocalDateStringConverter;
import Modell.*;
import com.itextpdf.text.*;
import com.itextpdf.text.Font;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfWriter;
import javafx.beans.binding.Bindings;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;
import javafx.stage.Stage;

import java.awt.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;


public class ManagePatientController implements Initializable, ControlledScreen {

    ScreensController myController;
    /**
     * Initializes the controller classgg.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        fixEditSplitPane();
        initPulseChoicboxes();
        makeListOfTitledPanes();
        makeListOfTextAreas();
        makelistOfTextFlows();
        makeListOfpersonalDateTextFields();
        makeListOfTabs();
        personalDataBindings();
        setPulseBindings();
        addListeners();
        setImageBindings();
        tcmListDefaultValues=tcm1ListView1.getItems();
        for(String s: tcmListDefaultValues){
            actualPatientTcmList.add(s);
        }
        tcm1ListView1.setItems(actualPatientTcmList);

        setFiveElementsTab();
        setMeridiansTab();
    }

    public void setMeridiansTab() {
        FXMLLoader fxmlLoader = new FXMLLoader();
        AnchorPane ap= null;
        try {
            ap = (AnchorPane) fxmlLoader.load(this.getClass().getResource("/meridians.fxml").openStream());
        } catch (IOException e) {
            e.printStackTrace();
        }
        MeridiansController meridiansCtroller = (MeridiansController) fxmlLoader.getController();

        meridiansTab.setContent(ap);
        meridiansController=meridiansCtroller;
    }

    private void setFiveElementsTab() {
        FXMLLoader fxmlLoader = new FXMLLoader();
        AnchorPane ap= null;
        try {
            ap = (AnchorPane) fxmlLoader.load(this.getClass().getResource("/fiveElements.fxml").openStream());
        } catch (IOException e) {
            e.printStackTrace();
        }
        FiveElementsController fiveElementsCtroller = (FiveElementsController) fxmlLoader.getController();

        fiveElementsTab.setContent(ap);
        fiveElementsController=fiveElementsCtroller;
    }

    public void setScreenParent(ScreensController screenParent){
        myController = screenParent;
    }


    @FXML
    SplitPane splitPane;
    @FXML
    SplitPane mainSplitPane;
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
    @FXML
    TitledPane titledPane7;
    @FXML
    TitledPane titledPane8;
    @FXML
    TitledPane titledPane9;
    @FXML
    TitledPane titledPane10;
    @FXML
    TitledPane titledPane11;
    @FXML
    TitledPane titledPane12;
    @FXML
    TitledPane titledPane13;
    @FXML
    TitledPane titledPane14;
    @FXML
    TitledPane titledPane15;
    @FXML
    TitledPane titledPane16;
    @FXML
    TitledPane titledPane17;
    @FXML
    TitledPane titledPane18;
    @FXML
    TitledPane titledPane19;
    @FXML
    TitledPane titledPane20;
    @FXML
    TitledPane titledPane21;
    @FXML
    TitledPane titledPane22;
    @FXML
    TitledPane titledPane23;
    @FXML
    TitledPane titledPane24;
    @FXML
    TitledPane titledPane25;
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
    ChoiceBox<String> genderChoiceBox;
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
    TextFlow symptomsTextFlow1;
    @FXML
    TextFlow symptomsTextFlow2;
    @FXML
    TextFlow symptomsTextFlow3;
    @FXML
    TextFlow symptomsTextFlow4;
    @FXML
    TextFlow symptomsTextFlow5;
    @FXML
    TextFlow symptomsTextFlow6;
    @FXML
    TextFlow symptomsTextFlow7;
    @FXML
    TextFlow symptomsTextFlow8;
    @FXML
    TextFlow symptomsTextFlow9;
    @FXML
    TextFlow jointTextFlow1;
    @FXML
    TextFlow jointTextFlow2;
    @FXML
    TextFlow jointTextFlow3;
    @FXML
    TextFlow jointTextFlow4;
    @FXML
    TextFlow jointTextFlow5;
    @FXML
    Tab jointsTab1;
    @FXML
    Tab jointsTab2;
    @FXML
    Tab jointsTab3;
    @FXML
    Tab jointsTab4;
    @FXML
    Tab jointsTab5;
    @FXML
    ImageView earImageView;
    @FXML
    ScrollPane earImageScrollPane;
    @FXML
    ImageView tongueImageView;
    @FXML
    ScrollPane tongueImageScrollPane;
    @FXML
    TextArea earTextArea;
    @FXML
    TextArea tongueTextArea;
    @FXML
    TabPane managePatientTabPane;
    @FXML
    GridPane symptomsGridPane;
    @FXML
    ListView<String> tcm1ListView1;
    @FXML
    ListView<String> tcm1ListView2;
    @FXML
    TextField filterTextField;
    @FXML
    TextField customDiagnoseTextField;
    @FXML
    Tab fiveElementsTab;
    @FXML
    Tab meridiansTab;


    private Boolean patientDataEditable =true;
    private Boolean treatmentEditable=true;
    private Patient patient= Patient.getInstance();

    String gender="";

    ArrayList<ChoiceBox> choiceBoxes;
    ArrayList<TextArea>  psychicTextAreas;
    ArrayList<TextArea>  clinicalHistoryTextAreas;
    ArrayList<TextArea>  actualTextAreas;
    ArrayList<TextArea> tcmTextAreas;
    ArrayList<TextArea> meridianTextAreas;
    ArrayList<ArrayList<TextArea>> allTextareas;
    ArrayList<TextFlow> textFlows;
    ArrayList<TextField> personalDateTextFields;
    ArrayList<TitledPane> titledPanes;
    ObservableList<Tab> managePatientTabs;

    private ObservableList<String> tcmListDefaultValues = FXCollections.observableArrayList();
    private ObservableList<String> actualPatientTcmList = FXCollections.observableArrayList();

    private ArrayList<TreatmentController> treatmentControllers=new ArrayList<>();
    private ManagePatientController managePatientController;
    private Image defaultImage = new Image("View/img/nopicture.jpg");

    private FiveElementsController fiveElementsController;
    private MeridiansController meridiansController;

    public void load() {
        if(Main.getNewPatient()) {
            Patient p=Patient.getInstance();
            p.setPatientData(new PatientData());
            p.setPsyche(new Psyche());
            p.setHistory(new History());
            p.setActual(new Actual());
            p.setActual(new Actual());
            p.setTcm(new Tcm());
            p.setPulse(new Pulse());
            p.setTreatments(new ArrayList<>());
            p.setFinal(new Final());
            setPatient();
            setImage();
            setImageDescriptions();
            isSaved=false;

            for(Tab t: managePatientTabs){
                t.setDisable(true);
            }
            managePatientTabs.get(0).setDisable(false);
            managePatientTabPane.getSelectionModel().select(0);

            tcm1ListView1.getItems().clear();
            for(String s: tcmListDefaultValues){
                actualPatientTcmList.add(s);
            }
            tcm1ListView1.setItems(actualPatientTcmList);
            tcm1ListView2.getItems().clear();
            meridiansController.clear();
        }else{
            isSaved=true;
            Main.db.getPatient(Main.patientID);
            setPatient();
            loadSymptoms();
            loadImages();
            loadImageDescriptions();
            meridiansController.load();
            managePatientTabPane.getSelectionModel().select(0);
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

    public void search(String oldVal, String newVal) {
        if (oldVal != null && (newVal.length() < oldVal.length())) {
            tcm1ListView1.setItems(actualPatientTcmList);
        }
        String value = newVal.toLowerCase();
        ObservableList<String> subentries = FXCollections.observableArrayList();
        for (String entry : tcm1ListView1.getItems()) {
            boolean match = true;
            if (!entry.toLowerCase().contains(value)) {
                match = false;
            }
            if (match) {
                subentries.add(entry);
            }
        }
        tcm1ListView1.setItems(subentries);
        tcm1ListView1.getSelectionModel().selectFirst();
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
        personalDataLabel9.textProperty().bind(genderChoiceBox.valueProperty());
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

    private void makeListOfTabs() {
        managePatientTabs=FXCollections.observableArrayList();
        managePatientTabs=managePatientTabPane.getTabs();
    }

    private void makeListOfTitledPanes() {
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
    }private void makeListOfTextAreas() {
        titledPanes=new ArrayList<TitledPane>();
        titledPanes.add(titledPane1);
        titledPanes.add(titledPane2);
        titledPanes.add(titledPane3);
        titledPanes.add(titledPane4);
        titledPanes.add(titledPane5);
        titledPanes.add(titledPane6);
        titledPanes.add(titledPane7);
        titledPanes.add(titledPane8);
        titledPanes.add(titledPane9);
        titledPanes.add(titledPane10);
        titledPanes.add(titledPane11);
        titledPanes.add(titledPane12);
        titledPanes.add(titledPane13);
        titledPanes.add(titledPane14);
        titledPanes.add(titledPane15);
        titledPanes.add(titledPane16);
        titledPanes.add(titledPane17);
        titledPanes.add(titledPane18);
        titledPanes.add(titledPane19);
        titledPanes.add(titledPane20);
        titledPanes.add(titledPane21);
        titledPanes.add(titledPane22);
        titledPanes.add(titledPane23);
        titledPanes.add(titledPane24);
        titledPanes.add(titledPane25);
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
    private void changeEditabilityClicked(){
        changeEditability();
    }

    public void changeEditability(){
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
        earTextArea.setEditable(!patientDataEditable);
        earTextArea.setEditable(patientDataEditable);
        tongueTextArea.setEditable(!patientDataEditable);
        tongueTextArea.setEditable(patientDataEditable);

        setDataDisplay();

        meridiansController.changeEditMode(patientDataEditable);
    }

    private void setDataDisplay() {
        for(TextFlow tf: textFlows){
            tf.getChildren().clear();
        }
        int whichTab=0;
        for(ArrayList<TextArea> textAreasPlace: allTextareas){
            for(TextArea tarea: textAreasPlace){
                    TitledPane tp=null;
                    if(tarea.getId().equals("tcm1TextArea")){
                         tp= (TitledPane) tarea.getParent().getParent().getParent().getParent();
                    }else {
                        tp = (TitledPane) tarea.getParent().getParent();
                    }
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
            addDateValidator(treatmentController.treatmentDatePicker);

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
            String date=personalDataDatePicker.getValue().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        }catch (Exception e){
            personalDataDatePicker.setValue(LocalDate.now());
        }
    }

    public void addDateValidator(DatePicker datePicker){
        datePicker.getEditor().focusedProperty().addListener(new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> observable, Boolean oldValue, Boolean newValue) {
                {
                    if (oldValue) {
                        isDateValid(datePicker);
                    }
                }
            }
        });
    }

    private void isDateValid(DatePicker datePicker){
        boolean valid=false;
        SecureLocalDateStringConverter checkDate=new SecureLocalDateStringConverter();
        checkDate.fromString(datePicker.getEditor().getText());
        checkDate.fromString2(datePicker.getEditor().getText());
        if(checkDate.hasParseError() && checkDate.hasParseError2()){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Hiba üzenet");
            alert.setHeaderText("Helytelen formátumban töltötte ki a dátumot!");
            alert.setContentText("Kérem az alábbi formátumban töltse ki: éééé. hh. nn. \n Például.: 1974. 05. 11.");

            alert.showAndWait();
            datePicker.getEditor().requestFocus();
        }
    }

    private Patient makePatient() {

        String patientDate;
        try {
            patientDate = personalDataDatePicker.getValue().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        }catch (Exception e){
            patientDate=null;
        }
        Calendar today = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        PatientData patientData = new PatientData(
                personalDataTextField1.getText(),
                personalDataTextField2.getText(),
                personalDataTextField3.getText(),
                patientDate,
                personalDataTextField4.getText(),
                personalDataTextField5.getText(),
                personalDataTextField6.getText(),
                personalDataTextField7.getText(),
                genderChoiceBox.getValue(),
                sdf.format(today.getTime())
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
        PatientData pd=patient.getPatientData();

        personalDataTextField1.setText(pd.getName());
        personalDataTextField2.setText(pd.getMotherName());
        personalDataTextField3.setText(pd.getBirthPlace());
        personalDataDatePicker.setValue(LocalDate.parse(pd.getBirthDate()));
        if(Main.newPatient){
            personalDataDatePicker.setValue(null);
            personalDataDatePicker.getEditor().textProperty().set("");
        }
        personalDataTextField4.setText(pd.getFamilyStatus());
        personalDataTextField5.setText(pd.getJob());
        personalDataTextField6.setText(pd.getEmail());
        personalDataTextField7.setText(pd.getPhone());
        genderChoiceBox.setValue(pd.getGender());
        if(Main.newPatient){
            genderChoiceBox.setValue("────────");
        }

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
        loadTcmToList();
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
        try {
            finalOpinionDatePicker.setValue(LocalDate.parse(f.getDate()));
        }catch (Exception e){
            finalOpinionDatePicker.setValue(null);
        }
        if(Main.newPatient){
            finalOpinionDatePicker.setValue(null);
        }
        finalTextArea.setText(f.getAssessment());
        finalOpinionChoiceBox.setValue(f.getResult());

        if(Main.newPatient){
            finalOpinionChoiceBox.setValue("────────");
        }

        treatmentControllers.clear();
        ObservableList<Tab> tabList = therapyTabPane.getTabs();
        int size=tabList.size();
        therapyTabPane.getTabs().remove(0, size-1);


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

                k++;
        }
        if(Main.newPatient){
            clearElements();
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
        int i=0;
        for(ArrayList<TextArea> textAreasPlace: allTextareas){
            try{
                for(TextArea tarea: textAreasPlace) {
                    TitledPane tp;
                    tp=titledPanes.get(i);
                    MeridiansController.arrowColorChanger(tarea, tp);
                    i++;
                }
            }catch(Exception e){
                e.printStackTrace();
            }
        }
        addChangeListenersForPersonalData();

        addDateValidator(personalDataDatePicker);
        addDateValidator(finalOpinionDatePicker);

        genderChoiceBox.getSelectionModel().selectedIndexProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observableValue, Number number, Number number2) {
                gender=genderChoiceBox.getItems().get((Integer) number2);
                symptomsGridPane.getStyleClass().clear();
                if(gender.equals("férfi")){
                    symptomsGridPane.getStyleClass().add("male-image");
                }else if(gender.equals("nő")){
                    symptomsGridPane.getStyleClass().add("female-image");
                }
            }
        });

        filterTextField.textProperty().addListener(new ChangeListener() {
            public void changed(ObservableValue observable, Object oldVal,
                                Object newVal) {
                search((String) oldVal, (String) newVal);
            }
        });

        addFiveElementsListeners();
    }

    private void addFiveElementsListeners() {
        ObservableList<SplitPane.Divider> dividers = mainSplitPane.getDividers();
        SplitPane.Divider divider=dividers.get(0);
        divider.positionProperty().addListener((observable, oldValue, newValue) -> {
            changeElementsTextPositions();
        });

        Stage s=Main.getWindow();
        s.widthProperty().addListener((observable, oldValue, newValue) -> {
            changeElementsTextPositions();
        });
        s.heightProperty().addListener((observable, oldValue, newValue) -> {
            changeElementsTextPositions();
        });
    }

    private void changeElementsTextPositions(){
        double width=fiveElementsController.getFiveElementsAnchorPane().getWidth();
        double height=fiveElementsController.getFiveElementsAnchorPane().getHeight();

        double circleHeight=height/4.53;

        fiveElementsController.getScrollPane1().setPrefHeight(circleHeight);
        fiveElementsController.getScrollPane2().setPrefHeight(circleHeight);
        fiveElementsController.getScrollPane3().setPrefHeight(circleHeight);
        fiveElementsController.getScrollPane4().setPrefHeight(circleHeight);
        fiveElementsController.getScrollPane5().setPrefHeight(circleHeight);
        fiveElementsController.getScrollPane6().setPrefHeight(circleHeight);

        double width1=width/2-100;
        double height1=height/13;

        double width2=width/6.3-100;
        double height2=height/3.5;

        double width3=width/1.2-100;
        double height3=height/3.5;

        double width4=width/3.47-100;
        double height4=height/1.5;

        double width5=width/1.42-100;
        double height5=height/1.5;

        double width6=width/1-100;
        double height6=height/1.5;


        setScrollPaneAnchors(width1, height1, fiveElementsController.getScrollPane1());
        setScrollPaneAnchors(width2, height2, fiveElementsController.getScrollPane2());
        setScrollPaneAnchors(width3, height3, fiveElementsController.getScrollPane3());
        setScrollPaneAnchors(width4, height4, fiveElementsController.getScrollPane4());
        setScrollPaneAnchors(width5, height5, fiveElementsController.getScrollPane5());
        setScrollPaneAnchors(width6, height6, fiveElementsController.getScrollPane5());
    };

    private boolean selected=false;

    @FXML
    public void fiveElementsSelected(Event event) {
        selected=!selected;
        changeElementsTextPositions();
        fiveElementsController.setTexts(tcmListDefaultValues, tcm1ListView2.getItems(), selected);
    }

    private void setScrollPaneAnchors(double left, double top, ScrollPane scrollPane){
        AnchorPane.setLeftAnchor(scrollPane, left);
        AnchorPane.setTopAnchor(scrollPane, top);
    }

    private void addChangeListenersForPersonalData(){
        personalDataTextField1.textProperty().addListener((observable, oldValue, newValue) -> {
            if(!personalDataTextField1.getText().trim().equals("")){
                patientNameWarningLabel.setVisible(false);
            }else{
                patientNameWarningLabel.setVisible(true);
            }
            setMandatoryFields();
        });

        personalDataDatePicker.getEditor().textProperty().addListener((observable, oldValue, newValue) -> {
            if(!personalDataDatePicker.getEditor().getText().equals("")){
                birthDateWarningLabel.setVisible(false);
            }else{
                birthDateWarningLabel.setVisible(true);
            }
            setMandatoryFields();
        });

        genderChoiceBox.valueProperty().addListener((observable, oldValue, newValue) ->  {
            if (!genderChoiceBox.getValue().equals("────────")) {
                genderWarningLabel.setVisible(false);
            } else {
                genderWarningLabel.setVisible(true);
            }
            setMandatoryFields();
        });
    }

    private void setMandatoryFields(){
        if(!(patientNameWarningLabel.visibleProperty().get()) && !(birthDateWarningLabel.visibleProperty().get()) && !(genderWarningLabel.visibleProperty().get())){
            for(Tab t: managePatientTabs){
                t.setDisable(false);
            }
        }else{
            for(Tab t: managePatientTabs){
                t.setDisable(true);
            }
            managePatientTabs.get(0).setDisable(false);
        }
        save();
    }

    private boolean isSaved=false;
    public void save(){
        if(birthDateWarningLabel.isVisible() || patientNameWarningLabel.isVisible() || genderWarningLabel.isVisible()){
            //doesn't save the informations
        }else {
            if(isSaved){

            }else {
                Patient patient = makePatient();
                Main.db.addPatient(patient);
                Main.db.saveImageDescription(earTextArea.getText(), tongueTextArea.getText());
                meridiansController.save();
                Main.newPatient=false;
                isSaved=true;
            }
        }
    }

    public void update(){
        Patient patient = makePatient();
        Main.db.updatePatient(patient);
        Main.db.updateImageDescription(earTextArea.getText(), tongueTextArea.getText());
        meridiansController.update();
    }

    public void chooseOtherPatient(MouseEvent mouseEvent) {
            Main.newPatient=false;
            update();
        myController.choosePatientController.refreshTableData();
        myController.setScreen("choose");
    }

    public Boolean getPatientDataEditable() {
        return patientDataEditable;
    }

    public void setPatientDataEditable(Boolean patientDataEditable) {
        this.patientDataEditable = patientDataEditable;
    }

    public void showSymptomsWindow(MouseEvent mouseEvent) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader();
            TabPane t=(TabPane) fxmlLoader.load(getClass().getResource("/symptoms.fxml").openStream());
            SymptomsController symptomsController = (SymptomsController) fxmlLoader.getController();
            symptomsController.setSymptomValues();
            Stage stage = new Stage();
            stage.setTitle("Tünetek");
            stage.getIcons().add(new Image(this.getClass().getResource("/View/img/tcm.png").toString()));
            stage.setScene(new Scene(t));

            stage.show();
            stage.setMaximized(true);
            symptomsController.setCurrentStage(stage); //injects the stage into symptomsController
            symptomsController.setOnCloseRequest();
            symptomsController.disableMenses(gender);
            t.getStylesheets().add(this.getClass().getResource("/font.css").toExternalForm());
            t.getStylesheets().add(this.getClass().getResource("/symptoms.css").toExternalForm());
            t.styleProperty().bind(Bindings.format("-fx-font-size: " + myController.getSettingsController().getFontSize() + "; -fx-font-family: " + myController.getSettingsController().getFontFamily()));
            Stage currentStage;
            currentStage=(Stage) splitPane.getScene().getWindow();
            currentStage.hide();
            symptomsController.setMainStage(currentStage);
            symptomsController.setManagePatientController(myController.managePatientController);

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void refreshSymptoms(){
        ArrayList<Symptom> s=Main.db.getSymptoms(Main.patientID);
        loadSymptoms();
    }

    public void loadSymptoms(){
        clearElements();
        ArrayList<Symptom> symptoms=Main.db.getSymptoms(Main.patientID);
        SortedSet activeTabs=new TreeSet();
        for(Symptom s:symptoms){
            Text separator=new Text(" █ ");
            separator.setFill(Color.rgb(0, 97, 255, 0.4));
            separator.setStyle("-fx-font-weight: 900");
            Text text=new Text(s.getName());
            text.setFill(Color.rgb(0, 0, 0));
            if(s.getImportant()){
                text.setFill(Color.RED);
            }
            double type=Double.parseDouble(s.getLocation());
                if (type == 1) {
                    symptomsSort(s, separator, text, symptomsTextFlow1, symptomsTextFlow2);
                }
                else if (type == 2) {
                    symptomsSort(s, separator, text, symptomsTextFlow3, symptomsTextFlow4);
                }
                else if (type == 3) {
                    symptomsSort(s, separator, text, symptomsTextFlow5, symptomsTextFlow6);
                }
                else if (type == 4) {
                    symptomsSort(s, separator, text, symptomsTextFlow7, symptomsTextFlow8);
                }
                else if (type == 5) {
                    symptomsSort(s, separator, text, symptomsTextFlow9);
                }
                else{
                    int correctType=(int) Math.round((type-6)*10);
                    int i=1;
                    while (i!=correctType){
                        i+=1;
                    }
                    activeTabs.add(i);
                    if(i==0){
                        symptomsSort(s, separator, text, jointTextFlow1);
                    }
                    else if(i==1){
                        symptomsSort(s, separator, text, jointTextFlow2);
                    }
                    else if(i==2){
                        symptomsSort(s, separator, text, jointTextFlow3);
                    }
                    else if(i==3){
                        symptomsSort(s, separator, text, jointTextFlow4);
                    }
                    else{
                        symptomsSort(s, separator, text, jointTextFlow5);
                    }
                }
        }

        jointsTab1.setDisable(true); jointsTab2.setDisable(true); jointsTab3.setDisable(true); jointsTab4.setDisable(true); jointsTab5.setDisable(true);

        Iterator<Integer> it = activeTabs.iterator();
        Integer current = 0;
        while(it.hasNext() ) {
            current = it.next()+1;
            if(current==1){
                jointsTab1.setDisable(false);
            }else if(current==2){
                jointsTab2.setDisable(false);
            }else if(current==3){
                jointsTab3.setDisable(false);
            }else if(current==4){
                jointsTab4.setDisable(false);
            }else if(current==5){
                jointsTab5.setDisable(false);
            }
        }
    }

    private void symptomsSort(Symptom s, Text separator, Text text, TextFlow symptomsTextFlow) {
            if(symptomsTextFlow.getChildren().size()>0){
                symptomsTextFlow.getChildren().add(separator);
            }
            symptomsTextFlow.getChildren().add(text);
    }

    private void symptomsSort(Symptom s, Text separator, Text text, TextFlow symptomsTextFlow1, TextFlow symptomsTextFlow2) {
        if(Integer.parseInt(s.getType())==1) {
            if(symptomsTextFlow1.getChildren().size()>0){
                symptomsTextFlow1.getChildren().add(separator);
            }
            symptomsTextFlow1.getChildren().add(text);
        }else{
            if(symptomsTextFlow2.getChildren().size()>0){
                symptomsTextFlow2.getChildren().add(separator);
            }
            symptomsTextFlow2.getChildren().add(text);
        }
    }

    private void clearElements() {
        symptomsTextFlow1.getChildren().clear();
        symptomsTextFlow2.getChildren().clear();
        symptomsTextFlow3.getChildren().clear();
        symptomsTextFlow4.getChildren().clear();
        symptomsTextFlow5.getChildren().clear();
        symptomsTextFlow6.getChildren().clear();
        symptomsTextFlow7.getChildren().clear();
        symptomsTextFlow8.getChildren().clear();
        symptomsTextFlow9.getChildren().clear();
        jointTextFlow1.getChildren().clear();
        jointTextFlow2.getChildren().clear();
        jointTextFlow3.getChildren().clear();
        jointTextFlow4.getChildren().clear();
        jointTextFlow5.getChildren().clear();
    }

    private long currentTime=0;
    private long lastTime=0;
    boolean isdblClicked=false;

    @FXML
    public void openImage(MouseEvent mouseEvent) {
            long diff = 0;
            currentTime = System.currentTimeMillis();

            if(lastTime!=0 && currentTime!=0){
                diff=currentTime-lastTime;

                if( diff<=300)
                    isdblClicked=true;
                else
                    isdblClicked=false;
            }

            lastTime=currentTime;

            if(isdblClicked) {
                String id="";
                ImageView imageView= (ImageView) mouseEvent.getSource();
                id=imageView.getId();
                File file2 = Main.db.getPictureFile(id);
                openFile(file2);
            }
    }

    public void addImage(MouseEvent mouseEvent) {
        try {

            FXMLLoader fxmlLoader = new FXMLLoader();
            AnchorPane ap=(AnchorPane) fxmlLoader.load(this.getClass().getResource("/dropImage.fxml").openStream());
            DropImageController dropImageController = (DropImageController) fxmlLoader.getController();
            Button b= (Button) mouseEvent.getSource();
            String id=b.getId();

            String imageName=getImageName(id);
            dropImageController.setImageName(imageName);
            dropImageController.setParentController(myController.managePatientController);

            Stage stage = new Stage();
            stage.setTitle("Kép");
            stage.getIcons().add(new Image(this.getClass().getResource("/View/img/tcm.png").toString()));
            stage.setScene(new Scene(ap));

            Stage currentStage;
            currentStage=(Stage) splitPane.getScene().getWindow();
            currentStage.hide();
            dropImageController.setParentStage(currentStage);
            stage.setResizable(false);
            stage.show();

            stage.setOnCloseRequest(e -> {
                e.consume();
                stage.close();
                currentStage.show();
            });
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private String getImageName(String id) {
        String imageName="";
        if(id.equals("addEarImageButton")){
            imageName="ear.jpg";
        }else if(id.equals("addTongueImageButton")){
            imageName="tongue.jpg";
        }
        return imageName;
    }

    public void setImage(String imageName, Image image){
        if(imageName.equals("ear.jpg")){
            earImageView.setImage(image);
        }else if(imageName.equals("tongue.jpg")){
            tongueImageView.setImage(image);
        }
    }

    private void setImageBindings() {
        earImageScrollPane.setFitToHeight(true);
        earImageView.fitWidthProperty().bind(earImageScrollPane.widthProperty());
        earImageView.fitHeightProperty().bind(earImageScrollPane.heightProperty());
        tongueImageScrollPane.setFitToHeight(true);
        tongueImageView.fitWidthProperty().bind(earImageScrollPane.widthProperty());
        tongueImageView.fitHeightProperty().bind(earImageScrollPane.heightProperty());
    }

    public void setImage () {
        earImageView.setImage(defaultImage);
        tongueImageView.setImage(defaultImage);
    }

    public void setImage (String name) {
        if(name.equals("ear")) {
            earImageView.setImage(defaultImage);
        }else if(name.equals("tongue")) {
            tongueImageView.setImage(defaultImage);
        }
    }

    private void loadImages() {
        Main.db.loadImages(myController.getManagePatientController());
    }

    private void setImageDescriptions() {
        earTextArea.setText("");
        tongueTextArea.setText("");
    }

    private void loadImageDescriptions() {
        ArrayList<String> descriptions=Main.db.getImageDescriptions();
        earTextArea.setText(descriptions.get(0));
        tongueTextArea.setText(descriptions.get(1));
    }

    public void deleteLastTreatment(MouseEvent mouseEvent) {
        int tabNums=therapyTabPane.getTabs().size();
        if(tabNums>1 && tabNums>patient.getTreatments().size()+1){
            therapyTabPane.getTabs().remove(tabNums-2);
            Main.db.deleteTreatment(tabNums-1);
            treatmentControllers.remove(treatmentControllers.size()-1);
        }
    }

    @FXML
    public void addDiagnose(MouseEvent mouseEvent) {
        if(customDiagnoseTextField.getText().isEmpty()) {
            changeElementPosition(tcm1ListView1, tcm1ListView2);
            filterTextField.setText("");
        }else{
            tcm1ListView2.getItems().add(customDiagnoseTextField.getText());
            tcm1TextArea.setText(tcm1TextArea.getText()+customDiagnoseTextField.getText()+"~");
            customDiagnoseTextField.setText("");
        }
    }

    @FXML
    public void deleteDiagnose(MouseEvent mouseEvent) {
        changeElementPosition(tcm1ListView2, tcm1ListView1);
    }

    private void changeElementPosition(ListView<String> listView1, ListView<String> listView2){
        try {
            String item = listView1.getSelectionModel().getSelectedItem();
            int itemIndex = listView1.getSelectionModel().getSelectedIndex();
            listView1.getItems().remove(itemIndex);
            listView2.getItems().add(item);

            tcm1TextArea.setText("");
            for(String s: tcm1ListView2.getItems()){
                tcm1TextArea.setText(tcm1TextArea.getText()+s+"~");
            }
        }catch (Exception e){
            //no more element or element not selected
        }
    }

    private void loadTcmToList() {
        tcm1ListView1.getItems().clear();
        tcm1ListView2.getItems().clear();
        String[] diagnoses = tcm1TextArea.getText().split("~");

        for(String diagnose: diagnoses){
            boolean isDefaultValue = isDefaultValue(diagnose);
            if(!isDefaultValue){
                tcm1ListView2.getItems().add(diagnose);
            }
        }

        for(String d: tcmListDefaultValues){
            boolean isInDb=isInDb(d, diagnoses);
            if(!isInDb){
                tcm1ListView1.getItems().add(d);
            }else{
                tcm1ListView2.getItems().add(d);
            }
        }
        actualPatientTcmList=tcm1ListView1.getItems();


    }

    private boolean isDefaultValue(String value){
        for(String defaultValue: tcmListDefaultValues){
            if(defaultValue.equals(value)){
                return true;
            }
        }
        return false;
    }

    private boolean isInDb(String d, String[] diagnoses) {
        for(String s:diagnoses){
           if(s.equals(d)){
               return true;
           }
        }
        return false;
    }


    public void createPdf(MouseEvent mouseEvent) throws DocumentException, IOException {
        Document document = new Document();
        String fileName = personalDataTextField1.getText();
        try {
            PdfWriter sdf = PdfWriter.getInstance(document, new FileOutputStream(fileName));
        } catch (DocumentException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        document.open();
        BaseFont baseFont = BaseFont.createFont(BaseFont.HELVETICA, BaseFont.CP1250, BaseFont.NOT_EMBEDDED);

        Font regular = new Font(baseFont, 12, Font.NORMAL);
        Font bold = new Font(baseFont, 16, Font.BOLD);
        Font bigBold = new Font(baseFont, 20, Font.BOLD);
        Font fontBold = new Font(baseFont, 12, Font.BOLDITALIC);

        addTitle("Páciens adatai", document, bold);
        makeParagraph("Páciens neve", personalDataTextField1.getText(), document, regular);
        makeParagraph("Anyja neve", personalDataTextField2.getText(), document, regular);
        makeParagraph("Születési helye", personalDataTextField3.getText(), document, regular);
        makeParagraph("Születési időpontja", personalDataDatePicker.getEditor().getText(), document, regular);
        makeParagraph("Családi állapota", personalDataTextField4.getText(), document, regular);
        makeParagraph("Foglalkozása", personalDataTextField5.getText(), document, regular);
        makeParagraph("E-mail címe", personalDataTextField6.getText(), document, regular);
        makeParagraph("Telefonszáma", personalDataTextField7.getText(), document, regular);
        makeParagraph("Páciens neme", genderChoiceBox.getValue(), document, regular);

        addTitle("Tünetek", document, bold);
        makeParagraph("Fej ritka tünetei", getTextFromTextFlow(symptomsTextFlow1), document, regular);
        makeParagraph("Fej gyakori tünetei", getTextFromTextFlow(symptomsTextFlow2), document, regular);
        makeParagraph("Mellkas ritka tünetei", getTextFromTextFlow(symptomsTextFlow3), document, regular);
        makeParagraph("Mellkas gyakori tünetei", getTextFromTextFlow(symptomsTextFlow4), document, regular);
        makeParagraph("Has ritka tünetei", getTextFromTextFlow(symptomsTextFlow5), document, regular);
        makeParagraph("Has gyakori tünetei", getTextFromTextFlow(symptomsTextFlow6), document, regular);
        makeParagraph("Alhas ritka tünetei", getTextFromTextFlow(symptomsTextFlow7), document, regular);
        makeParagraph("Alhas gyakori tünetei", getTextFromTextFlow(symptomsTextFlow8), document, regular);
        makeParagraph("Gerinc", getTextFromTextFlow(symptomsTextFlow9), document, regular);
        makeParagraph("1. Végtag/izület", getTextFromTextFlow(jointTextFlow1), document, regular);
        makeParagraph("2. Végtag/izület", getTextFromTextFlow(jointTextFlow2), document, regular);
        makeParagraph("3. Végtag/izület", getTextFromTextFlow(jointTextFlow3), document, regular);
        makeParagraph("4. Végtag/izület", getTextFromTextFlow(jointTextFlow4), document, regular);
        makeParagraph("5. Végtag/izület", getTextFromTextFlow(jointTextFlow5), document, regular);

        addTitle("Meridiánok", document, bold);
        meridianTextAreas=new ArrayList<TextArea>();
        meridianTextAreas.add(meridiansController.textArea1);
        meridianTextAreas.add(meridiansController.textArea2);
        meridianTextAreas.add(meridiansController.textArea3);
        meridianTextAreas.add(meridiansController.textArea4);
        meridianTextAreas.add(meridiansController.textArea5);
        meridianTextAreas.add(meridiansController.textArea6);
        meridianTextAreas.add(meridiansController.textArea7);
        meridianTextAreas.add(meridiansController.textArea8);
        meridianTextAreas.add(meridiansController.textArea9);
        meridianTextAreas.add(meridiansController.textArea10);
        meridianTextAreas.add(meridiansController.textArea11);
        meridianTextAreas.add(meridiansController.textArea12);
        meridianTextAreas.add(meridiansController.textArea13);
        meridianTextAreas.add(meridiansController.textArea14);
        meridianTextAreas.add(meridiansController.textArea15);
        meridianTextAreas.add(meridiansController.textArea16);
        meridianTextAreas.add(meridiansController.textArea17);
        meridianTextAreas.add(meridiansController.textArea18);
        meridianTextAreas.add(meridiansController.textArea19);
        meridianTextAreas.add(meridiansController.textArea20);
        addSection(meridianTextAreas, document, regular);

        addTitle("Pszichikum", document, bold);
        addSection(psychicTextAreas, document, regular);

        addTitle("Kórtörténet", document, bold);
        addSection(clinicalHistoryTextAreas, document, regular);

        addTitle("Aktuális", document, bold);
        addSection(actualTextAreas, document, regular);

        ArrayList<TextArea> pdfTcmTextAreas = new ArrayList<>();
        pdfTcmTextAreas.add(tcm2TextArea);
        pdfTcmTextAreas.add(tcm3TextArea);
        pdfTcmTextAreas.add(tcm4TextArea);
        pdfTcmTextAreas.add(tcm5TextArea);
        pdfTcmTextAreas.add(tcm6TextArea);
        pdfTcmTextAreas.add(tcm7TextArea);
        pdfTcmTextAreas.add(tcm8TextArea);

        String content = tcm1ListView2.getItems().toString();

        addTitle("HKO Diagnózis", document, bold);
        makeParagraph("HKO diagnózisok", content, document, regular);
        addSection(pdfTcmTextAreas, document, regular);

        addTitle("Kezelések", document, bigBold);

        int k=0;
        for(TreatmentController treatmentController: treatmentControllers){
            addTitle(k+1 + ". Kezelés", document, bold);
            String date;
            try {
                date = treatmentController.treatmentDatePicker.getValue().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
            } catch (Exception e) {
                date = "";
            }
            makeParagraph("Kezelés dátuma", date, document, regular);
            makeParagraph("Romlás", treatmentController.treatment1TextArea.getText(), document, regular);
            makeParagraph("Javulás", treatmentController.treatment2TextArea.getText(), document, regular);
            makeParagraph("Egyéb", treatmentController.treatment3TextArea.getText(), document, regular);
            makeParagraph("Újabb javaslatok", treatmentController.treatment4TextArea.getText(), document, regular);
            makeParagraph("Terápia (pontok, masszázs, moxa, köpöly stb.)", treatmentController.treatment5TextArea.getText(), document, regular);
            makeParagraph("Manuálterápia", treatmentController.treatment6TextArea.getText(), document, regular);
            k++;
        }

        addTitle("Záróvélemény", document, bold);
        String date;
        try {
            date = finalOpinionDatePicker.getValue().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        } catch (Exception e) {
            date = "";
        }
        makeParagraph("Záróvélemény kelte", date, document, regular);
        makeParagraph("Értékelés", finalTextArea.getText(), document, regular);
        makeParagraph("Páciens állapota", finalOpinionChoiceBox.getValue(), document, regular);


        document.close();

        File file = new File(fileName);
        openFile(file);
    }

    private String getTextFromTextFlow(TextFlow textFlow){
        StringBuilder sb = new StringBuilder();
        int i=0;
        for (Node node : textFlow.getChildren()) {
            if (node instanceof Text && i%2!=1) {
                if(i!=0) {
                    sb.append(", ");
                }
                sb.append(((Text) node).getText());
                System.out.println(node);
            }
            i++;
        }
        String fullText = sb.toString();
        return fullText;
    }

    private void addSection(ArrayList<TextArea> textAreas, Document document, Font regular) throws DocumentException, IOException {
        for(TextArea ta: textAreas){
            TitledPane tp = (TitledPane) ta.getParent().getParent();
            makeParagraph(tp.getText(), ta.getText(), document, regular);
        }
    }

    private void addTitle(String title, Document document, Font bold) throws DocumentException {
        document.add(new Paragraph("\n"));
        document.add(new Paragraph(title, bold));
    }

    private void makeParagraph(String description, String content, Document document, Font regular) throws DocumentException, IOException {
        BaseFont baseFont = BaseFont.createFont(BaseFont.HELVETICA, BaseFont.CP1250, BaseFont.NOT_EMBEDDED);
        Font fontBold = new Font(baseFont, 12, Font.BOLDITALIC);

        if(!(content.equals(""))) {
            Phrase p = new Phrase(description, fontBold);
            Phrase p2 = new Phrase(": " + content + "\n", regular);
            document.add(p);
            document.add(p2);
        }
    }

    private void openFile(File file) {
        if (Desktop.isDesktopSupported()) {
            new Thread(() -> {
                try {
                    Desktop.getDesktop().open(file);
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }).start();
        }
    }
}


