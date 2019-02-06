package ViewControllers;

import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;


public class FiveElementsController {

    @FXML
    AnchorPane fiveElementsAnchorPane;
    @FXML
    TextFlow textFlow1;
    @FXML
    TextFlow textFlow2;
    @FXML
    TextFlow textFlow3;
    @FXML
    TextFlow textFlow4;
    @FXML
    TextFlow textFlow5;
    @FXML
    ScrollPane scrollPane1;
    @FXML
    ScrollPane scrollPane2;
    @FXML
    ScrollPane scrollPane3;
    @FXML
    ScrollPane scrollPane4;
    @FXML
    ScrollPane scrollPane5;

    public AnchorPane getFiveElementsAnchorPane() {
        return fiveElementsAnchorPane;
    }

    public TextFlow getTextFlow1() {
        return textFlow1;
    }

    public TextFlow getTextFlow2() {
        return textFlow2;
    }

    public TextFlow getTextFlow3() {
        return textFlow3;
    }

    public TextFlow getTextFlow4() {
        return textFlow4;
    }

    public TextFlow getTextFlow5() {
        return textFlow5;
    }

    public ScrollPane getScrollPane1() {
        return scrollPane1;
    }

    public ScrollPane getScrollPane2() {
        return scrollPane2;
    }

    public ScrollPane getScrollPane3() {
        return scrollPane3;
    }

    public ScrollPane getScrollPane4() {
        return scrollPane4;
    }

    public ScrollPane getScrollPane5() {
        return scrollPane5;
    }

    public void setTexts(ObservableList<String> tcmListDefaultValues, ObservableList<String> items, boolean selected) {
        clearTextFlows();
        if(selected){
            for(String s: items){
                int id=getSelectedId(s, tcmListDefaultValues);
                if(0<=id && id<=17){
                    addText(textFlow1, s);
                }else if(17<id && id<=28){
                    addText(textFlow2, s );
                }else if(28<id && id<=32){
                    if(id==29){
                        addText(textFlow2, "Lázadó Máj Qi-", Color.RED);
                        addText(textFlow3, "-Támadja a lépet", Color.RED);
                    }else if(id==30){
                        addText(textFlow2, "Lázadó Máj Qi-", Color.BLUE);
                        addText(textFlow3, "-Támadja a Gyomrot", Color.BLUE);
                    }else if(id==31){
                        addText(textFlow2, "Máj Tűz-", Color.CORAL);
                        addText(textFlow5, "-Sérti a Tüdőt", Color.CORAL);
                    }else{
                        addText(textFlow1, "Szív és-", Color.SILVER);
                        addText(textFlow2, "-Máj Vér Hiány", Color.SILVER);
                    }
                }else if(32<id && id<=45){
                    addText(textFlow5, s);
                }else if(id==46){
                    addText(textFlow2, "Tüdő és-", Color.SEAGREEN);
                    addText(textFlow1, "-Szív Qi Hiány", Color.SEAGREEN);
                }else if(46<id && id<=53){
                    addText(textFlow3, s);
                }else if(53<id && id<=57){
                    if(id==54){
                        addText(textFlow3, "Lép és-", Color.LAWNGREEN);
                        addText(textFlow1, "-Szív Vér Hiány", Color.LAWNGREEN);
                    }else if(id==55){
                        addText(textFlow3, "Lép és-", Color.CHOCOLATE);
                        addText(textFlow5, "-Tüdő Qi Hiány", Color.CHOCOLATE);
                    }else if(id==56){
                        addText(textFlow3, "Lép és-", Color.DARKCYAN);
                        addText(textFlow2, "-Máj Vér Hiány", Color.DARKCYAN);
                    }else{
                        addText(textFlow2, "Nedvesség Máj Qi Pangással-", Color.ROYALBLUE);
                        addText(textFlow3, "-Elzárja a Lépet", Color.ROYALBLUE);
                    }
                }else if(57<id && id<=65){
                    addText(textFlow4, s);
                }else if(65<id && id<=69) {
                    if (id == 66) {
                        addText(textFlow4, "Vese és-", Color.DARKRED);
                        addText(textFlow2, "-Máj Yin Hiány", Color.DARKRED);
                    } else if (id == 67) {
                        addText(textFlow4, "Vese és-", Color.PINK);
                        addText(textFlow1, "-Szív Nincsenek Harmóniában", Color.PINK);
                    } else if (id == 68) {
                        addText(textFlow4, "Vese és-", Color.YELLOWGREEN);
                        addText(textFlow5, "-Tüdő Yin Hiány", Color.YELLOWGREEN);
                    } else {
                        addText(textFlow4, "Vese és-", Color.PURPLE);
                        addText(textFlow3, "-Lép Yang Hiány", Color.PURPLE);
                    }
                }else if(70<id && id<=80){
                    addText(textFlow3, s);
                }else if(id==81){
                    addText(textFlow3, "Gyomor és-", Color.NAVY);
                    addText(textFlow3, "-Lép Qi Hiány", Color.NAVY);
                }else if(81<id && id<=86){
                    addText(textFlow1, s);
                }else if(86<id && id<=94){
                    addText(textFlow5, s);
                }else if(94<id && id<=97){
                    addText(textFlow2, s);
                }else if(id==98){
                    addText(textFlow2, "Nedves Forróság az Epehólyagban-", Color.LIMEGREEN);
                    addText(textFlow2, "-és a Májban", Color.LIMEGREEN);
                }else if(98<id && id<=101){
                    addText(textFlow4, s);
                }
            }
        }
    }

    private void addText(TextFlow element, String text, Color color) {
        Text t=new Text(text + System.lineSeparator());
        t.setFill(color);
        element.getChildren().add(t);
    }

    private void addText(TextFlow element, String text){
        Text t=new Text(text + System.lineSeparator());
        element.getChildren().add(t);
    }


    private void clearTextFlows(){
        textFlow1.getChildren().clear();
        textFlow2.getChildren().clear();
        textFlow3.getChildren().clear();
        textFlow4.getChildren().clear();
        textFlow5.getChildren().clear();
    }

    private int getSelectedId(String s, ObservableList<String> tcmListDefaultValues){
        int id=0;
        for(String defaultValue: tcmListDefaultValues){
            if(s.equals(defaultValue)){
                return id;
            }
            id++;
        }
        return -1;
    }

    //a Fa elemhez a Maj es az Epeholyag
    //Fém: Tudo, Vastagbel
    //Viz: Vese, Húgyhólyag
    //Föld: Lep, Gyomor
    //Tűz: Szív es Vekonybel, illetve itt meg a HaromMelegito es Szivburok
}
