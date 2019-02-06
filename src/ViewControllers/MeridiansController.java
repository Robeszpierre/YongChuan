package ViewControllers;

import Controller.Main;
import Modell.Meridians;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Accordion;
import javafx.scene.control.TextArea;
import javafx.scene.control.TitledPane;
import javafx.scene.layout.StackPane;

import java.util.ArrayList;

public class MeridiansController {

    @FXML
    TextArea textArea1;
    @FXML
    TextArea textArea2;
    @FXML
    TextArea textArea3;
    @FXML
    TextArea textArea4;
    @FXML
    TextArea textArea5;
    @FXML
    TextArea textArea6;
    @FXML
    TextArea textArea7;
    @FXML
    TextArea textArea8;
    @FXML
    TextArea textArea9;
    @FXML
    TextArea textArea10;
    @FXML
    TextArea textArea11;
    @FXML
    TextArea textArea12;
    @FXML
    TextArea textArea13;
    @FXML
    TextArea textArea14;
    @FXML
    TextArea textArea15;
    @FXML
    TextArea textArea16;
    @FXML
    TextArea textArea17;
    @FXML
    TextArea textArea18;
    @FXML
    TextArea textArea19;
    @FXML
    TextArea textArea20;
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
    TitledPane normalMeridiansTitledPane;
    @FXML
    TitledPane extraOrdinaryMeridiansTitledPane;
    @FXML
    Accordion accordion1;
    @FXML
    Accordion accordion2;
    @FXML
    StackPane meridianImageStackPane;
    @FXML
    StackPane mainImageStackPane;

    ArrayList<TextArea> textAreas;

    @FXML
    public void initialize(){
        textAreas=getTextAreas();
        arrows();
        showMeridians();
        changeMeridianAccordions();
    }

    private void changeMeridianAccordions() {
        normalMeridiansTitledPane.expandedProperty().addListener(observable -> {
            if(normalMeridiansTitledPane.isExpanded()){
                mainImageStackPane.setOpacity(0.2);
                mainImageStackPane.setStyle("-fx-background-image: url(img/Meridians/meridian.png);" +
                        "-fx-background-repeat: no-repeat;" +
                        "-fx-background-size: stretch;");
            }else{
                mainImageStackPane.setStyle("");
                ObservableList<TitledPane> a = accordion1.getPanes();
                for(TitledPane b: a){
                    b.setExpanded(false);
                }
                meridianImageStackPane.setStyle("");
            }
        });

        extraOrdinaryMeridiansTitledPane.expandedProperty().addListener(observable -> {
            if(extraOrdinaryMeridiansTitledPane.isExpanded()){
                mainImageStackPane.setOpacity(1);
                mainImageStackPane.setStyle("");
            }else{
                ObservableList<TitledPane> a = accordion2.getPanes();
                for(TitledPane b: a){
                    b.setExpanded(false);
                }
            }
        });
    }

    private void showMeridians() {
        changePictureListener(titledPane1, "img/Meridians/tudo.png", meridianImageStackPane);
        changePictureListener(titledPane2, "img/Meridians/vastagbel.png", meridianImageStackPane);
        changePictureListener(titledPane3, "img/Meridians/gyomor.png", meridianImageStackPane);
        changePictureListener(titledPane4, "img/Meridians/lep.png", meridianImageStackPane);
        changePictureListener(titledPane5, "img/Meridians/sziv.png", meridianImageStackPane);
        changePictureListener(titledPane6, "img/Meridians/vekkonybel.png", meridianImageStackPane);
        changePictureListener(titledPane7, "img/Meridians/hogyholyag.png", meridianImageStackPane);
        changePictureListener(titledPane8, "img/Meridians/vese.png", meridianImageStackPane);
        changePictureListener(titledPane9, "img/Meridians/szivburok.png", meridianImageStackPane);
        changePictureListener(titledPane10, "img/Meridians/haromMelegito.png", meridianImageStackPane);
        changePictureListener(titledPane11, "img/Meridians/epeholyag.png", meridianImageStackPane);
        changePictureListener(titledPane12, "img/Meridians/maj.png", meridianImageStackPane);


        changePictureListener(titledPane13, "img/Meridians/dumai.png", mainImageStackPane);
        changePictureListener(titledPane14, "img/Meridians/renmai.png", mainImageStackPane);
        changePictureListener(titledPane15, "img/Meridians/chongmai.png", mainImageStackPane);
        changePictureListener(titledPane16, "img/Meridians/daimai.png", mainImageStackPane);
        changePictureListener(titledPane17, "img/Meridians/yinqiaomai.png", mainImageStackPane);
        changePictureListener(titledPane18, "img/Meridians/yangqiaomai.png", mainImageStackPane);
        changePictureListener(titledPane19, "img/Meridians/yinweimai.png", mainImageStackPane);
        changePictureListener(titledPane20, "img/Meridians/yangweimai.png", mainImageStackPane);
    }

    private void arrows(){
        addChangeListener(textArea1, titledPane1);
        addChangeListener(textArea2, titledPane2);
        addChangeListener(textArea3, titledPane3);
        addChangeListener(textArea4, titledPane4);
        addChangeListener(textArea5, titledPane5);
        addChangeListener(textArea6, titledPane6);
        addChangeListener(textArea7, titledPane7);
        addChangeListener(textArea8, titledPane8);
        addChangeListener(textArea9, titledPane9);
        addChangeListener(textArea10, titledPane10);
        addChangeListener(textArea11, titledPane11);
        addChangeListener(textArea12, titledPane12);
        addChangeListener(textArea13, titledPane13);
        addChangeListener(textArea14, titledPane14);
        addChangeListener(textArea15, titledPane15);
        addChangeListener(textArea16, titledPane16);
        addChangeListener(textArea17, titledPane17);
        addChangeListener(textArea18, titledPane18);
        addChangeListener(textArea19, titledPane19);
        addChangeListener(textArea20, titledPane20);
    }

    private void changePictureListener(TitledPane titledPane, String url, StackPane stackPane) {
            titledPane.expandedProperty().addListener((observable, oldValue, newValue) -> {
                if (newValue){
                    stackPane.setStyle("-fx-background-image: url(" + url + ");" +
                            "-fx-background-repeat: no-repeat;" +
                            "-fx-background-size: stretch;");
                }
            });
    }


    public ArrayList<TextArea> getTextAreas() {
        ArrayList<TextArea> meridians= new ArrayList<TextArea>();
        meridians.add(textArea1);
        meridians.add(textArea2);
        meridians.add(textArea3);
        meridians.add(textArea4);
        meridians.add(textArea5);
        meridians.add(textArea6);
        meridians.add(textArea7);
        meridians.add(textArea8);
        meridians.add(textArea9);
        meridians.add(textArea10);
        meridians.add(textArea11);
        meridians.add(textArea12);
        meridians.add(textArea13);
        meridians.add(textArea14);
        meridians.add(textArea15);
        meridians.add(textArea16);
        meridians.add(textArea17);
        meridians.add(textArea18);
        meridians.add(textArea19);
        meridians.add(textArea20);

        return meridians;
    }

    public void addChangeListener(TextArea tarea, TitledPane tp){
        arrowColorChanger(tarea, tp);
    }

    static void arrowColorChanger(TextArea tarea, TitledPane tp) {
        tarea.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                if (!tarea.getText().trim().equals("")) {
                    if (!tp.getStyleClass().contains("green-arrow")) {
                        tp.getStyleClass().add("green-arrow");
                    }
                } else {
                    tp.getStyleClass().remove("green-arrow");
                }
            }
        });
    }

    public void load(){
        Meridians m=Main.db.getMeridians();
        System.out.println(m.getMeridian1());
        textArea1.setText(m.getMeridian1());
        textArea2.setText(m.getMeridian2());
        textArea3.setText(m.getMeridian3());
        textArea4.setText(m.getMeridian4());
        textArea5.setText(m.getMeridian5());
        textArea6.setText(m.getMeridian6());
        textArea7.setText(m.getMeridian7());
        textArea8.setText(m.getMeridian8());
        textArea9.setText(m.getMeridian9());
        textArea10.setText(m.getMeridian10());
        textArea11.setText(m.getMeridian11());
        textArea12.setText(m.getMeridian12());
        textArea13.setText(m.getMeridian13());
        textArea14.setText(m.getMeridian14());
        textArea15.setText(m.getMeridian15());
        textArea16.setText(m.getMeridian16());
        textArea17.setText(m.getMeridian17());
        textArea18.setText(m.getMeridian18());
        textArea19.setText(m.getMeridian19());
        textArea20.setText(m.getMeridian20());
    }

    public void save(){
        Meridians m=makeMeridianTextAreas();
        Main.db.saveMeridians(m);
    }

    public void update(){
        Meridians m=makeMeridianTextAreas();
        Main.db.updateMeridians(m);
    }

    public Meridians makeMeridianTextAreas() {
        Meridians m=new Meridians(
                textArea1.getText(),
                textArea2.getText(),
                textArea3.getText(),
                textArea4.getText(),
                textArea5.getText(),
                textArea6.getText(),
                textArea7.getText(),
                textArea8.getText(),
                textArea9.getText(),
                textArea10.getText(),
                textArea11.getText(),
                textArea12.getText(),
                textArea13.getText(),
                textArea14.getText(),
                textArea15.getText(),
                textArea16.getText(),
                textArea17.getText(),
                textArea18.getText(),
                textArea19.getText(),
                textArea20.getText()
        );
    return m;
    }

    public void clear() {
        textArea1.setText("");
        textArea2.setText("");
        textArea3.setText("");
        textArea4.setText("");
        textArea5.setText("");
        textArea6.setText("");
        textArea7.setText("");
        textArea8.setText("");
        textArea9.setText("");
        textArea10.setText("");
        textArea11.setText("");
        textArea12.setText("");
        textArea13.setText("");
        textArea14.setText("");
        textArea15.setText("");
        textArea16.setText("");
        textArea17.setText("");
        textArea18.setText("");
        textArea19.setText("");
        textArea20.setText("");
    }

    public void changeEditMode(boolean editable){
        textArea1.setEditable(editable);
        textArea2.setEditable(editable);
        textArea3.setEditable(editable);
        textArea4.setEditable(editable);
        textArea5.setEditable(editable);
        textArea6.setEditable(editable);
        textArea7.setEditable(editable);
        textArea8.setEditable(editable);
        textArea9.setEditable(editable);
        textArea10.setEditable(editable);
        textArea11.setEditable(editable);
        textArea12.setEditable(editable);
        textArea13.setEditable(editable);
        textArea14.setEditable(editable);
        textArea15.setEditable(editable);
        textArea16.setEditable(editable);
        textArea17.setEditable(editable);
        textArea18.setEditable(editable);
        textArea19.setEditable(editable);
        textArea20.setEditable(editable);
    };

}
