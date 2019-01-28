package ViewControllers;

import Controller.Main;
import Modell.ResultForPieChart;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.PieChart;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;

import java.net.URL;
import java.util.ResourceBundle;

public class StatisticController implements Initializable, ControlledScreen {

    @FXML
    PieChart genderPieChart;
    @FXML
    PieChart resultPieChart;
    @FXML
    ScrollPane statScrollPane;

    ScreensController myController;

    @Override
    public void initialize(URL url, ResourceBundle rb) {

        // TODO
        createGenderChart();
        createResultPieChart();
        Main.db.getresultForPieChart();
    }

    private void createResultPieChart() {
        ResultForPieChart result=Main.db.getresultForPieChart();

        ObservableList<PieChart.Data> pieChartData =
                FXCollections.observableArrayList(
                        new PieChart.Data("Gyógyultak " + result.getHealed() , result.getHealed()),
                        new PieChart.Data("Részben gyógyultak "+ result.getPartiallyHealed(), result.getPartiallyHealed()),
                        new PieChart.Data("Nem gyógyultak "+ result.getNotHealed(), result.getNotHealed()),
                        new PieChart.Data("Egyéb "+ result.getOther(), result.getOther()));
        resultPieChart.setData(pieChartData);
    }

    private void createGenderChart() {
        double mans= Main.db.getManPercent();
        double womans=100-mans;
        int mans2= (int) mans;
        int womans2= (int) womans;

        ObservableList<PieChart.Data> pieChartData =
                FXCollections.observableArrayList(
                        new PieChart.Data("Férfiak " + mans2 + "%", mans),
                        new PieChart.Data("Nők "+ womans2 + "%", womans));
        genderPieChart.setData(pieChartData);
    }

    public void setScreenParent(ScreensController screenParent){
        myController = screenParent;
    }

    public void getMainMenu(MouseEvent mouseEvent) {
        myController.setScreen(Main.screen1ID);
    }
}
