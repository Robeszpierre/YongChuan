package ViewControllers;

import Controller.Main;
import javafx.beans.binding.Bindings;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Font;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class SettingsController implements Initializable, ControlledScreen {

    @FXML
    Spinner<Integer> textSizeSpinner;
    @FXML
    Label sampleTextLabel;
    @FXML
    ListView<String> fontTypeListView;

    ScreensController myController;

    private String fontFamily;
    private int fontSize;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        addTextSizeListener();
        createFontList();
        addFontFamilyListener();
    }

    public void setSettings(){
        textSizeSpinner.getValueFactory().setValue(Main.db.getFontSize());
        String fontFamily=Main.db.getFonFamily();
        int i=0;
        int index=-1;
        for(String s: fontTypeListView.getItems()){
            if(s.equals(fontFamily)){
                index=i;
                break;
            }
            i++;
        }
        fontTypeListView.scrollTo(index);
        fontTypeListView.getSelectionModel().select(index);
    }

    private void createFontList() {
        List<String> fonts=Font.getFamilies();
        for(String s: fonts){
            fontTypeListView.getItems().add(s);
        }
    }

    private void addFontFamilyListener() {
        fontTypeListView.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
            fontFamily=fontTypeListView.getSelectionModel().getSelectedItem();
            changeSettings();
            Main.db.updateFontFemily(fontFamily);
        });
    }

    private void addTextSizeListener() {
        textSizeSpinner.valueProperty().addListener((observable, oldValue, newValue) -> {
            fontSize=textSizeSpinner.getValue();
            changeSettings();
            Main.db.updateFontSizes(fontSize);
        });
    }

    private void changeSettings(){
        myController.getRoot().styleProperty().bind(Bindings.format("-fx-font-family: " + fontFamily + "; -fx-font-size: " + fontSize));
    }

    public void setScreenParent(ScreensController screenParent){
        myController = screenParent;
    }

    public String getFontFamily() {
        return fontFamily;
    }

    public int getFontSize() {
        return fontSize;
    }

    public void backToMainMenu(MouseEvent mouseEvent) {
        myController.setScreen(Main.screen1ID);
    }
}
