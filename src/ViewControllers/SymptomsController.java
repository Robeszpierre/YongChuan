package ViewControllers;

import Controller.Main;
import Modell.Symptom;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class SymptomsController {

    @FXML
    TabPane symptomsTabPane;
    @FXML
    TabPane jointsTabPane;
    @FXML
    ToggleGroup group1;
    @FXML
    ToggleGroup group2;
    @FXML
    ToggleGroup group3;
    @FXML
    ToggleGroup group4;
    @FXML
    ToggleGroup group5;
    @FXML
    ToggleGroup group6;
    @FXML
    ToggleGroup group7;
    @FXML
    ToggleGroup group8;
    @FXML
    ToggleGroup group9;
    @FXML
    ToggleGroup group10;
    @FXML
    ToggleGroup group11;
    @FXML
    ToggleGroup group12;
    @FXML
    ToggleGroup group13;
    @FXML
    ToggleGroup group14;
    @FXML
    ToggleGroup group15;
    @FXML
    ToggleGroup group16;
    @FXML
    ToggleGroup group17;
    @FXML
    ToggleGroup group18;
    @FXML
    ToggleGroup group19;
    @FXML
    ToggleGroup group20;
    @FXML
    ToggleGroup group21;
    @FXML
    ToggleGroup group22;
    @FXML
    ToggleGroup group23;
    @FXML
    ToggleGroup group24;
    @FXML
    ToggleGroup group25;
    @FXML
    ToggleGroup group26;
    @FXML
    ToggleGroup group27;
    @FXML
    ToggleGroup group28;
    @FXML
    ToggleGroup group29;
    @FXML
    ToggleGroup group30;
    @FXML
    ToggleGroup group31;
    @FXML
    ToggleGroup group32;
    @FXML
    ToggleGroup group33;
    @FXML
    ToggleGroup group34;
    @FXML
    ToggleGroup group35;
    @FXML
    ToggleGroup group36;
    @FXML
    ToggleGroup group37;
    @FXML
    ToggleGroup group38;
    @FXML
    ToggleGroup group39;
    @FXML
    ToggleGroup group40;
    @FXML
    ToggleGroup group41;
    @FXML
    ToggleGroup group42;
    @FXML
    ToggleGroup group43;
    @FXML
    ToggleGroup group44;
    @FXML
    ToggleGroup group45;
    @FXML
    ToggleGroup group46;
    @FXML
    ToggleGroup group47;
    @FXML
    ToggleGroup group48;
    @FXML
    ToggleGroup group49;
    @FXML
    ToggleGroup group50;
    @FXML
    ToggleGroup group51;
    @FXML
    ToggleGroup group52;
    @FXML
    ToggleGroup group53;
    @FXML
    ToggleGroup group54;
    @FXML
    ToggleGroup group55;
    @FXML
    ToggleGroup group56;
    @FXML
    ToggleGroup group57;
    @FXML
    ToggleGroup group58;
    @FXML
    ToggleGroup group59;
    @FXML
    ToggleGroup group60;
    @FXML
    ToggleGroup group61;
    @FXML
    ToggleGroup group62;
    @FXML
    ToggleGroup group63;
    @FXML
    ToggleGroup group64;
    @FXML
    ToggleGroup group65;
    @FXML
    ToggleGroup group66;
    @FXML
    ToggleGroup group67;
    @FXML
    ToggleGroup group68;
    @FXML
    ToggleGroup group69;
    @FXML
    ToggleGroup group70;
    @FXML
    ToggleGroup group71;
    @FXML
    ToggleGroup group72;
    @FXML
    ToggleGroup group73;
    @FXML
    ToggleGroup group74;
    @FXML
    ToggleGroup group75;
    @FXML
    ToggleGroup group76;
    @FXML
    ToggleGroup group77;
    @FXML
    ToggleGroup group78;
    @FXML
    ToggleGroup group79;
    @FXML
    ToggleGroup group80;
    @FXML
    ToggleGroup group81;
    @FXML
    ToggleGroup group82;
    @FXML
    ToggleGroup group83;
    @FXML
    ToggleGroup group84;
    @FXML
    ToggleGroup group85;
    @FXML
    ToggleGroup group86;
    @FXML
    ToggleGroup group87;
    @FXML
    ToggleGroup group88;
    @FXML
    ToggleGroup group89;
    @FXML
    ToggleGroup group90;
    @FXML
    ToggleGroup group91;
    @FXML
    ToggleGroup group92;
    @FXML
    ToggleGroup group93;
    @FXML
    ToggleGroup group94;
    @FXML
    ToggleGroup group95;
    @FXML
    ToggleGroup group96;
    @FXML
    ToggleGroup group97;
    @FXML
    ToggleGroup group98;
    @FXML
    ToggleGroup group99;
    @FXML
    ToggleGroup group100;
    @FXML
    ToggleGroup group101;
    @FXML
    ToggleGroup group102;
    @FXML
    ToggleGroup group103;
    @FXML
    ToggleGroup group104;
    @FXML
    ToggleGroup group105;
    @FXML
    ToggleGroup group106;
    @FXML
    ToggleGroup group107;
    @FXML
    TextField group5TextField;
    @FXML
    TextField group36TextField;
    @FXML
    ComboBox<String> group15ComboBox1;
    @FXML
    ComboBox<String> group15ComboBox2;
    @FXML
    ComboBox<String> group78ComboBox;
    @FXML
    ComboBox<String> group86ComboBox;
    @FXML
    ComboBox<String> group107ComboBox;
    @FXML
    TextField headTextField1;
    @FXML
    TextField headTextField2;
    @FXML
    TextField headTextField3;
    @FXML
    TextField headTextField4;
    @FXML
    TextField headTextField5;
    @FXML
    TextField headTextField6;
    @FXML
    Label headLabel1;
    @FXML
    Label headLabel2;
    @FXML
    Label headLabel3;
    @FXML
    Label headLabel4;
    @FXML
    Label headLabel5;
    @FXML
    Label headLabel6;
    @FXML
    TextField faceColorTextField;
    @FXML
    TextField shitTextField1;
    @FXML
    TextField shitTextField2;
    @FXML
    TextField shitTextField3;
    @FXML
    ComboBox<String> dailyFluidComboBox;
    @FXML
    TextField dailyFluidTextField;
    @FXML
    Spinner<Integer> urinationCountSpinner;
    @FXML
    Spinner<Integer> mensesSpinner1;
    @FXML
    Spinner<Integer> mensesSpinner2;
    @FXML
    Spinner<Integer> mensesSpinner3;
    @FXML
    Spinner<Integer> mensesSpinner4;
    @FXML
    Spinner<Integer> mensesSpinner5;
    @FXML
    ComboBox<Integer> mensesComboBox1;
    @FXML
    ComboBox<Integer> mensesComboBox2;
    @FXML
    ComboBox<String> mensesComboBox3;
    @FXML
    TextField spineTextField1;
    @FXML
    TextField spineTextField2;
    @FXML
    TextField spineTextField3;
    @FXML
    TextField spineTextField4;
    @FXML
    TextField spineTextField5;
    @FXML
    TextField spineTextField6;
    @FXML
    TextField spineTextField7;
    @FXML
    TextField spineTextField8;
    @FXML
    TextField spineTextField9;
    @FXML
    TextField spineTextField10;
    @FXML
    TextField spineTextField11;
    @FXML
    ComboBox<String> spineComboBox1;
    @FXML
    ComboBox<String> spineComboBox2;
    @FXML
    ComboBox<String> spineComboBox3;

    private ArrayList<ToggleGroup> toggleGroups;
    private  ArrayList<Symptom> symptoms=new ArrayList<>();
    private ArrayList<JointsController> jointsControllers=new ArrayList<>();

    private Stage mainStage;
    private ManagePatientController managePatientController;

    @FXML
    public void initialize() {
        addTab();
        makeToggleGroup();
        addListeners();
    }

    private void addListeners() {
        group1.selectedToggleProperty().addListener(new ChangeListener<Toggle>() {
            public void changed(ObservableValue<? extends Toggle> ov,
                                Toggle old_toggle, Toggle new_toggle) {

                RadioButton selectedRadioButton = (RadioButton) group1.getSelectedToggle();
                String toogleGroupValue = selectedRadioButton.getText();
                if(toogleGroupValue.equals("Nem jellemző") || toogleGroupValue.equals("Nem megkérdezett")){
                    headLabel1.setVisible(false);
                    headLabel2.setVisible(false);
                    headLabel3.setVisible(false);
                    headLabel4.setVisible(false);
                    headLabel5.setVisible(false);
                    headLabel6.setVisible(false);
                    headTextField1.setVisible(false);
                    headTextField2.setVisible(false);
                    headTextField3.setVisible(false);
                    headTextField4.setVisible(false);
                    headTextField5.setVisible(false);
                    headTextField6.setVisible(false);
                }else{
                    headLabel1.setVisible(true);
                    headLabel2.setVisible(true);
                    headLabel3.setVisible(true);
                    headLabel4.setVisible(true);
                    headLabel5.setVisible(true);
                    headLabel6.setVisible(true);
                    headTextField1.setVisible(true);
                    headTextField2.setVisible(true);
                    headTextField3.setVisible(true);
                    headTextField4.setVisible(true);
                    headTextField5.setVisible(true);
                    headTextField6.setVisible(true);
                }
            }

        });
    }

    private void addTab(){
        try {
            Tab tab = new Tab();
            jointsTabPane.getTabs().add(tab);
            int tabNum=jointsTabPane.getTabs().size();
            tab.setText(tabNum + ". izület");
            FXMLLoader fxmlLoader = new FXMLLoader();
            tab.setContent((AnchorPane) fxmlLoader.load(this.getClass().getResource("/joints.fxml").openStream()));
            JointsController jointsController = (JointsController) fxmlLoader.getController();
            jointsControllers.add(jointsController);
            jointsController.setLocation(String.valueOf(tabNum));

            jointsTabPane.getSelectionModel().select(tabNum-1);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void addNewTab(MouseEvent mouseEvent) {
        addTab();
    }

    private void makeToggleGroup(){
        toggleGroups=new ArrayList<>();
        toggleGroups.add(group1);
        toggleGroups.add(group2);
        toggleGroups.add(group3);
        toggleGroups.add(group4);
        toggleGroups.add(group5);
        toggleGroups.add(group6);
        toggleGroups.add(group7);
        toggleGroups.add(group8);
        toggleGroups.add(group9);
        toggleGroups.add(group10);
        toggleGroups.add(group11);
        toggleGroups.add(group12);
        toggleGroups.add(group13);
        toggleGroups.add(group14);
        toggleGroups.add(group15);
        toggleGroups.add(group16);
        toggleGroups.add(group17);
        toggleGroups.add(group18);
        toggleGroups.add(group19);
        toggleGroups.add(group20);
        toggleGroups.add(group21);
        toggleGroups.add(group22);
        toggleGroups.add(group23);
        toggleGroups.add(group24);
        toggleGroups.add(group25);
        toggleGroups.add(group26);
        toggleGroups.add(group27);
        toggleGroups.add(group28);
        toggleGroups.add(group29);
        toggleGroups.add(group30);
        toggleGroups.add(group31);
        toggleGroups.add(group32);
        toggleGroups.add(group33);
        toggleGroups.add(group34);
        toggleGroups.add(group35);
        toggleGroups.add(group36);
        toggleGroups.add(group37);
        toggleGroups.add(group38);
        toggleGroups.add(group39);
        toggleGroups.add(group40);
        toggleGroups.add(group41);
        toggleGroups.add(group42);
        toggleGroups.add(group43);
        toggleGroups.add(group44);
        toggleGroups.add(group45);
        toggleGroups.add(group46);
        toggleGroups.add(group47);
        toggleGroups.add(group48);
        toggleGroups.add(group49);
        toggleGroups.add(group50);
        toggleGroups.add(group51);
        toggleGroups.add(group52);
        toggleGroups.add(group53);
        toggleGroups.add(group54);
        toggleGroups.add(group55);
        toggleGroups.add(group56);
        toggleGroups.add(group57);
        toggleGroups.add(group58);
        toggleGroups.add(group59);
        toggleGroups.add(group60);
        toggleGroups.add(group61);
        toggleGroups.add(group62);
        toggleGroups.add(group63);
        toggleGroups.add(group64);
        toggleGroups.add(group65);
        toggleGroups.add(group66);
        toggleGroups.add(group67);
        toggleGroups.add(group68);
        toggleGroups.add(group69);
        toggleGroups.add(group70);
        toggleGroups.add(group71);
        toggleGroups.add(group72);
        toggleGroups.add(group73);
        toggleGroups.add(group74);
        toggleGroups.add(group75);
        toggleGroups.add(group76);
        toggleGroups.add(group77);
        toggleGroups.add(group78);
        toggleGroups.add(group79);
        toggleGroups.add(group80);
        toggleGroups.add(group81);
        toggleGroups.add(group82);
        toggleGroups.add(group83);
        toggleGroups.add(group84);
        toggleGroups.add(group85);
        toggleGroups.add(group86);
        toggleGroups.add(group87);
        toggleGroups.add(group88);
        toggleGroups.add(group89);
        toggleGroups.add(group90);
        toggleGroups.add(group91);
        toggleGroups.add(group92);
        toggleGroups.add(group93);
        toggleGroups.add(group94);
        toggleGroups.add(group95);
        toggleGroups.add(group96);
        toggleGroups.add(group97);
        toggleGroups.add(group98);
        toggleGroups.add(group99);
        toggleGroups.add(group100);
        toggleGroups.add(group101);
        toggleGroups.add(group102);
        toggleGroups.add(group103);
        toggleGroups.add(group104);
        toggleGroups.add(group105);
        toggleGroups.add(group106);
        toggleGroups.add(group107);
    }

    @FXML
    private void saveButton(ActionEvent actionEvent) {
        ArrayList<Integer> radioButtonChoices=new ArrayList<>();
        radioButtonChoices=getRadioButtonChoices();

        symptoms=getSymptoms();

        for (JointsController j: jointsControllers){
            ArrayList<Symptom> jSymptoms=j.getSymptoms();
            for(Symptom symptom: jSymptoms){
                symptoms.add(symptom);
            }
        }

        Main.db.addTreatments(symptoms);

        Stage stage = (Stage) symptomsTabPane.getScene().getWindow();
        stage.close();

        managePatientController.refreshSymptoms();
        mainStage.show();
    }

    private ArrayList<Integer> getRadioButtonChoices(){
        ArrayList<Integer> radioButtonChoices=new ArrayList<>();
        int choice=0;
        for(ToggleGroup g: toggleGroups){
                RadioButton selectedRadioButton = (RadioButton) g.getSelectedToggle();
                String toogleGroupValue = selectedRadioButton.getText();
                if(toogleGroupValue.equals("Nem jellemző")){
                    choice=0;
                }else if(toogleGroupValue.equals("Ritka")){
                    choice=1;
                }else if(toogleGroupValue.equals("Gyakori")){
                    choice=2;
                }else if(toogleGroupValue.equals("Nem megkérdezett")){
                    choice=3;
                }
            radioButtonChoices.add(choice);
        }
        return radioButtonChoices;
    }

    private ArrayList<Symptom> getSymptoms(){
        ArrayList<Symptom> symptoms=new ArrayList<>();
        int i=1;
        for(ToggleGroup g: toggleGroups){
            Symptom symptom=new Symptom();
            symptom.setType("-1");
            RadioButton selectedRadioButton = (RadioButton) g.getSelectedToggle();
            String toogleGroupValue = selectedRadioButton.getText();
            if(toogleGroupValue.equals("Ritka")){
                symptom.setType("0");
            }else if(toogleGroupValue.equals("Gyakori")){
                symptom.setType("1");
            }
            if(symptom.getType().equals("0") || symptom.getType().equals("1")){
                symptom.setPatientID(String.valueOf(Main.patientID));

                ObservableList<Node> nodes=selectedRadioButton.getParent().getChildrenUnmodifiable();
                CheckBox c=(CheckBox) nodes.get(0);
                symptom.setName(c.getText());

                if(i==1){
                    if(!headTextField1.getText().equals("")){
                        symptom.setName(symptom.getName() + " - Helye/érintett meridiánok: " + headTextField1.getText());
                    }
                    if(!headTextField2.getText().equals("")){
                        symptom.setName(symptom.getName() + " - jellege: " + headTextField2.getText());
                    }
                    if(!headTextField3.getText().equals("")){
                        symptom.setName(symptom.getName() + " - gyakorisága: " + headTextField3.getText());
                    }
                    if(!headTextField5.getText().equals("")){
                        symptom.setName(symptom.getName() + " - fejfájást ronja: " + headTextField5.getText());
                    }
                    if(!headTextField6.getText().equals("")){
                        symptom.setName(symptom.getName() + " - fejfájást javítja: " + headTextField6.getText());
                    }
                    if(!headTextField4.getText().equals("")){
                        symptom.setName(symptom.getName() + " - egyéb: " + headTextField4.getText());
                    }


                }
                if(i==5 && !group5TextField.getText().equals("")){
                    symptom.setName(symptom.getName() + " - ideje: " + group5TextField.getText());
                }
                if(i==36 && !group36TextField.getText().equals("")){
                    symptom.setName(symptom.getName() + " - színe: " + group36TextField.getText());
                }
                if(i==15){
                    if(!(group15ComboBox1.getValue()==null)) {
                        symptom.setName(symptom.getName() + " " + group15ComboBox1.getValue() + "on");
                    }
                    if(!(group15ComboBox2.getValue()==null)) {
                        symptom.setName(symptom.getName() + " - jellege: " + group15ComboBox2.getValue());
                    }
                }
                if(i==78 && !(group78ComboBox.getValue()==null)){
                        symptom.setName(symptom.getName() + " " + group78ComboBox.getValue() + " oldalon");
                }
                if(i==86 && !(group86ComboBox.getValue()==null)){
                    if(group86ComboBox.getValue().equals("igen")) {
                        symptom.setName(symptom.getName() + " - hajlamos hólyaghurutra");
                    }else{
                        symptom.setName(symptom.getName() + " - nem hajlamos hólyaghurutra");
                    }
                }
                if(i==107 && !(group107ComboBox.getValue()==null)){
                    symptom.setName(symptom.getName() + " - színe: " + group107ComboBox.getValue());
                }

                VBox v= (VBox) c.getParent().getParent();

                if(v.getId().equals("vbox1")){
                    symptom.setLocation("1");
                }else if(v.getId().equals("vbox2")){
                    symptom.setLocation("2");
                }else if(v.getId().equals("vbox3")){
                    symptom.setLocation("3");
                }else if(v.getId().equals("vbox4")){
                    symptom.setLocation("3");
                }else if(v.getId().equals("vbox5")){
                    symptom.setLocation("4");
                }else if(v.getId().equals("vbox6")){
                    symptom.setLocation("4");
                }
                symptoms.add(symptom);
            }
            i++;
        }

        if(!faceColorTextField.getText().equals("")){
            symptoms.add(new Symptom(Main.patientID, "Arc színe: " + faceColorTextField.getText(), "3" ,0));
        }
        if(!shitTextField1.getText().equals("") || !shitTextField2.getText().equals("") || !shitTextField3.getText().equals("")){
            Symptom symptom=new Symptom(Main.patientID, "Széklet", "0" ,0);
            if(!shitTextField1.getText().equals("")){
                symptom.setName(symptom.getName() + " - gyakorisága: " + shitTextField1.getText());
            }
            if(!shitTextField2.getText().equals("")){
                symptom.setName(symptom.getName() + " - állaga: " + shitTextField2.getText());
            }
            if(!shitTextField3.getText().equals("")){
                symptom.setName(symptom.getName() + " - színe: " + shitTextField3.getText());
            }
            symptoms.add(symptom);
        }

        if(!dailyFluidTextField.getText().equals("") || !(dailyFluidComboBox.getValue()==null)){
            Symptom symptom=new Symptom(Main.patientID, "Napi folyadékbevitel ", "4" ,0);
            if(!dailyFluidTextField.getText().equals("")){
                symptom.setName(symptom.getName() + " - mennyisége: " + dailyFluidTextField.getText() + " liter");
            }
            if(!(dailyFluidComboBox.getValue()==null)){
                symptom.setName(symptom.getName() + " - hőmérséklete:: " + dailyFluidComboBox.getValue());
            }
            symptoms.add(symptom);
        }

        if(!(urinationCountSpinner.getValue()==0)){
            symptoms.add(new Symptom(Main.patientID, "Napiközbeni vizeletürítések száma: " + urinationCountSpinner.getValue(), "4" ,0));
        }

        if(!(mensesSpinner1.getValue()==0)){
            Symptom symptom=new Symptom(Main.patientID, "", "4" ,0);
            if(!(mensesSpinner1.getValue()==0)){
                symptom.setName(symptom.getName() + "Első menses: " + mensesSpinner1.getValue() + " évesen");
            }
            if(!(mensesSpinner2.getValue()==0)){
                symptom.setName(symptom.getName() + " - utolsó: " + mensesSpinner2.getValue() + " évesen");
            }else{
                symptom.setName(symptom.getName() + " - még van mensese");
            }
            symptoms.add(symptom);
        }

        if(!(mensesComboBox1.getValue()==null)){
            Symptom symptom=new Symptom(Main.patientID, "", "4" ,0);
            if(!(mensesComboBox1.getValue()==null)){
                symptom.setName(symptom.getName() + "Vérzés színe: " + mensesComboBox1.getValue());
            }
            if(!(mensesComboBox2.getValue()==null)){
                symptom.setName(symptom.getName() + " - vérzés mennyisége: " + mensesComboBox2.getValue());
            }
            symptoms.add(symptom);
        }
        if(!(mensesComboBox3.getValue()==null)){
            Symptom symptom=new Symptom(Main.patientID, "", "4" ,0);
            if(!(mensesComboBox3.getValue()==null)){
                symptom.setName(symptom.getName() + "Ciklus hossza: " + mensesComboBox3.getValue());
            }
            if(!(mensesSpinner3.getValue()==0)){
                symptom.setName(symptom.getName() + " - napok száma: " + mensesSpinner3.getValue());
            }
            if(!(mensesSpinner4.getValue()==0)){
                symptom.setName(symptom.getName() + " - " + mensesSpinner4.getValue() + " nap");
            }
            symptoms.add(symptom);
        }
        if(!(mensesSpinner5.getValue()==0)){
            Symptom symptom=new Symptom(Main.patientID, "Cikluson belüli " + mensesSpinner5.getValue() + " napos a vérzés", "4" ,0);
            symptoms.add(symptom);
        }



        if(!spineTextField1.getText().equals("")){
            Symptom symptom=new Symptom(Main.patientID, spineTextField1.getText() + " gerincszakasz/csigolya érintett", "5" ,0);
            symptoms.add(symptom);
        }
        if(!spineTextField2.getText().equals("")){
            Symptom symptom=new Symptom(Main.patientID, "Panasz fennálásnak ideje: " +spineTextField2.getText(), "5" ,0);
            symptoms.add(symptom);
        }
        if(!spineTextField3.getText().equals("")){
            Symptom symptom=new Symptom(Main.patientID, "Kisugárzás: " +spineTextField3.getText(), "5" ,0);
            symptoms.add(symptom);
        }
        if(!spineTextField4.getText().equals("")){
            Symptom symptom=new Symptom(Main.patientID, "Érintett meridián(ok): " +spineTextField4.getText(), "5" ,0);
            symptoms.add(symptom);
        }
        if(!spineTextField5.getText().equals("")){
            Symptom symptom=new Symptom(Main.patientID, "Érzékeny (trigger, Ah Shi pontok: " +spineTextField5.getText(), "5" ,0);
            symptoms.add(symptom);
        }
        if(spineComboBox1.getValue().equals("igen")){
            Symptom symptom=new Symptom(Main.patientID, "Fennáll éjszaka a fájdalom", "5" ,0);
            symptoms.add(symptom);
        }
        if(!spineTextField6.getText().equals("")){
            Symptom symptom=new Symptom(Main.patientID, "Fájdalom jellege: " +spineTextField6.getText(), "5" ,0);
            symptoms.add(symptom);
        }
        if(!spineTextField7.getText().equals("")){
            Symptom symptom=new Symptom(Main.patientID, "Fájdalmat rontja: " +spineTextField7.getText(), "5" ,0);
            symptoms.add(symptom);
        }
        if(!spineTextField8.getText().equals("")){
            Symptom symptom=new Symptom(Main.patientID, "Fájdalmat javítja: " +spineTextField8.getText(), "5" ,0);
            symptoms.add(symptom);
        }
        if(spineComboBox2.getValue().equals("igen")){
            Symptom symptom=new Symptom(Main.patientID, "Mozgáskorlátozott", "5" ,0);
            symptoms.add(symptom);
        }
        if(!(spineComboBox3.getValue()==null)){
            symptoms.add(new Symptom(Main.patientID, "Derék fázékony? - " + spineComboBox3.getValue(), "5" ,0));
        }
        if(!spineTextField9.getText().equals("")){
            Symptom symptom=new Symptom(Main.patientID, "Korábbi sérülés: " +spineTextField9.getText(), "5" ,0);
            symptoms.add(symptom);
        }
        if(!spineTextField10.getText().equals("")){
            Symptom symptom=new Symptom(Main.patientID, "Korábbi műtét: " +spineTextField10.getText(), "5" ,0);
            symptoms.add(symptom);
        }
        if(!spineTextField11.getText().equals("")){
            Symptom symptom=new Symptom(Main.patientID, "Egyéb: " +spineTextField11.getText(), "5" ,0);
            symptoms.add(symptom);
        }
        return symptoms;
    }

    public void setMainStage(Stage mainStage) {
        this.mainStage = mainStage;
    }

    public void setManagePatientController(ManagePatientController managePatientController) {
        this.managePatientController = managePatientController;
    }
}
