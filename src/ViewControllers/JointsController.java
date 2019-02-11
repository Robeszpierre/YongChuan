package ViewControllers;

import Controller.Main;
import Modell.Symptom;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

import java.util.ArrayList;


public class JointsController {

    @FXML
    TextField jointsTextField1;
    @FXML
    TextField jointsTextField2;
    @FXML
    TextField jointsTextField3;
    @FXML
    TextField jointsTextField4;
    @FXML
    TextField jointsTextField5;
    @FXML
    TextField jointsTextField6;
    @FXML
    TextField jointsTextField7;
    @FXML
    TextField jointsTextField8;
    @FXML
    TextField jointsTextField9;
    @FXML
    TextField jointsTextField10;
    @FXML
    TextField jointsTextField11;
    @FXML
    TextField jointsTextField12;
    @FXML
    ComboBox<String> jointsCombobox1;
    @FXML
    ComboBox<String> jointsCombobox2;
    @FXML
    ComboBox<String> jointsCombobox3;

    private String location="";

    public ArrayList<Symptom> getSymptoms(){
        ArrayList<Symptom> symptoms=new ArrayList<>();
        if(!jointsTextField1.getText().equals("")){
            symptoms.add(new Symptom(Main.patientID, "Panasz helye: " + jointsTextField1.getText(), "6."+location ,0));
        }
        if(!jointsTextField2.getText().equals("")){
            symptoms.add(new Symptom(Main.patientID, "Panasz fennállásának ideje: " + jointsTextField2.getText(), "6."+location ,0));
        }
        if(!jointsTextField3.getText().equals("")){
            Symptom symptom=new Symptom(Main.patientID, "Kisugárzás: " +jointsTextField3.getText(), "6."+location ,0);
            symptoms.add(symptom);
        }
        if(!jointsTextField4.getText().equals("")){
            Symptom symptom=new Symptom(Main.patientID, "Érintett meridián(ok): " +jointsTextField4.getText(), "6."+location ,0);
            symptoms.add(symptom);
        }
        if(!jointsTextField5.getText().equals("")){
            Symptom symptom=new Symptom(Main.patientID, "Érzékeny (trigger, Ah Shi pontok: " +jointsTextField5.getText(), "6."+location ,0);
            symptoms.add(symptom);
        }
        if(!(jointsCombobox1.getValue()==null)) {
            if (jointsCombobox1.getValue().equals("igen")) {
                Symptom symptom = new Symptom(Main.patientID, "Fennáll éjszaka a fájdalom", "6." + location, 0);
                symptoms.add(symptom);
            }
        }
        if(!jointsTextField6.getText().equals("")){
            Symptom symptom=new Symptom(Main.patientID, "Fájdalom jellege: " +jointsTextField6.getText(), "6."+location ,0);
            symptoms.add(symptom);
        }
        if(!jointsTextField7.getText().equals("")){
            Symptom symptom=new Symptom(Main.patientID, "Fájdalmat rontja: " +jointsTextField7.getText(), "6."+location ,0);
            symptoms.add(symptom);
        }
        if(!jointsTextField8.getText().equals("")){
            Symptom symptom=new Symptom(Main.patientID, "Fájdalmat javítja: " +jointsTextField8.getText(), "6."+location ,0);
            symptoms.add(symptom);
        }
        if(!(jointsCombobox2.getValue()==null)) {
            if (jointsCombobox2.getValue().equals("igen")) {
                Symptom symptom = new Symptom(Main.patientID, "Mozgáskorlátozott", "6." + location, 0);
                symptoms.add(symptom);
            }
        }
        if(!jointsTextField9.getText().equals("")){
            Symptom symptom=new Symptom(Main.patientID, "Egyéb kísérő tünetek: " +jointsTextField9.getText(), "6."+location ,0);
            symptoms.add(symptom);
        }
        if(!jointsTextField10.getText().equals("")){
            Symptom symptom=new Symptom(Main.patientID, "Korábbi sérülés: " +jointsTextField10.getText(), "6."+location ,0);
            symptoms.add(symptom);
        }
        if(!jointsTextField11.getText().equals("")){
            Symptom symptom=new Symptom(Main.patientID, "Korábbi műtét: " +jointsTextField11.getText(), "6."+location ,0);
            symptoms.add(symptom);
        }
        if(!(jointsCombobox3.getValue()==null)){
            symptoms.add(new Symptom(Main.patientID, "Panaszok szimmetrikusak? - " + jointsCombobox3.getValue(), "6."+location ,0));
        }
        if(!jointsTextField12.getText().equals("")){
            Symptom symptom=new Symptom(Main.patientID, "Egyéb: " +jointsTextField12.getText(), "6."+location ,0);
            symptoms.add(symptom);
        }
        return symptoms;
    }

    public ArrayList<TextField> getTextFields(){
        ArrayList<TextField> textFields=new ArrayList<>();
        textFields.add(jointsTextField1);
        textFields.add(jointsTextField2);
        textFields.add(jointsTextField3);
        textFields.add(jointsTextField4);
        textFields.add(jointsTextField5);
        textFields.add(jointsTextField6);
        textFields.add(jointsTextField7);
        textFields.add(jointsTextField8);
        textFields.add(jointsTextField9);
        textFields.add(jointsTextField10);
        textFields.add(jointsTextField11);
        textFields.add(jointsTextField12);
        return textFields;
    }

    public ArrayList<ComboBox> getComboBoxes() {
        ArrayList<ComboBox> comboBoxes = new ArrayList<>();
        comboBoxes.add(jointsCombobox1);
        comboBoxes.add(jointsCombobox2);
        comboBoxes.add(jointsCombobox3);
        return comboBoxes;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
