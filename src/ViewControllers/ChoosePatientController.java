package ViewControllers;

import Controller.Main;
import Modell.Database.PatientForChooseTable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.collections.transformation.SortedList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.scene.input.MouseEvent;

import java.net.URL;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Optional;
import java.util.ResourceBundle;

public class ChoosePatientController implements Initializable, ControlledScreen {

    ScreensController myController;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        setTableData();
        customerSearch();
    }

    public void setScreenParent(ScreensController screenParent){
        myController = screenParent;
    }

    @FXML
    TableView<PatientForChooseTable> patientsTable;
    @FXML
    TextField filterField;

    TableColumn nameCol=null;



    private final ObservableList<PatientForChooseTable> data = FXCollections.observableArrayList();
    private FilteredList<PatientForChooseTable> filteredData = new FilteredList<>(data, p -> true);

    public void selectPatient(MouseEvent mouseEvent) {
        try {
            Main.setNewPatient(false);
            PatientForChooseTable selectedPatient = patientsTable.getSelectionModel().getSelectedItem();
            Main.patientID = Integer.parseInt(selectedPatient.getPatientID());
            myController.managePatientController.load();
            if(!myController.getManagePatientController().getPatientDataEditable()){
                myController.getManagePatientController().setPatientDataEditable(true);
                myController.getManagePatientController().changeEditability();
            }
            myController.setScreen("manage");
        }catch (Exception e){
            e.printStackTrace();
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Figyelmeztetés");
            alert.setHeaderText("Nem választott ki pácienst!");
            alert.setContentText("Kérem válasszon!");

            alert.showAndWait();
        }
    }

    public void addNewPatient(MouseEvent mouseEvent) {
        Main.setNewPatient(true);
        myController.managePatientController.load();
        myController.setScreen("manage");
    }

    private void setTableData(){
        nameCol = new TableColumn("Páciens neve");
        nameCol.setMinWidth(170);
        nameCol.setCellFactory(TextFieldTableCell.forTableColumn());
        nameCol.setCellValueFactory(new PropertyValueFactory<PatientForChooseTable,String>("name"));

        TableColumn birthDateCol = new TableColumn("Születési dátuma");
        birthDateCol.setMinWidth(170);
        birthDateCol.setCellFactory(TextFieldTableCell.forTableColumn());
        birthDateCol.setCellValueFactory(new PropertyValueFactory<PatientForChooseTable, String>("birthDate"));

        nameCol.setSortType(TableColumn.SortType.ASCENDING);

        patientsTable.getColumns().addAll(nameCol,birthDateCol);
        data.addAll(Main.db.getAllPatients());
        patientsTable.setItems(data);

        patientsTable.getSelectionModel().selectFirst();
        patientsTable.getSortOrder().add(nameCol);

        patientsTable.setColumnResizePolicy( TableView.CONSTRAINED_RESIZE_POLICY );
        nameCol.setMaxWidth( 1f * Integer.MAX_VALUE * 50 ); // 50% width
        birthDateCol.setMaxWidth( 1f * Integer.MAX_VALUE * 50 ); // 30% width

        setColorForOldPatient();


    }

    private void setColorForOldPatient() {
        nameCol.setCellFactory(column -> {
            return new TableCell<PatientForChooseTable, String>() {
                @Override
                protected void updateItem(String item, boolean empty) {
                    super.updateItem(item, empty); //This is mandatory

                    if (item == null || empty) { //If the cell is empty
                        setText(null);
                        setStyle("");
                    } else { //If the cell is not empty

                        setText(item); //Put the String data in the cell

                        //We get here all the info of the P of this row
                        PatientForChooseTable p = getTableView().getItems().get(getIndex());

                        Calendar lastModified=Calendar.getInstance();
                        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                        try {
                            lastModified.setTime(sdf.parse(p.getLastModified()));// all done
                        } catch (ParseException e) {
                            e.printStackTrace();
                        }
                        Calendar oneYearBefore=Calendar.getInstance();
                        oneYearBefore.add(Calendar.YEAR, -1);

                        //set color
                        if(lastModified.before(oneYearBefore)){
                            setStyle("-fx-text-fill: red");
                        }else{
                            setStyle("-fx-text-fill: black");
                        }


                    }
                }
            };
        });


    }


    public void refreshTableData(){
        data.clear();
        //get data from database
        data.addAll(Main.db.getAllPatients());
        //add database data to the table
        patientsTable.setItems(data);
        patientsTable.getSortOrder().add(nameCol);
        patientsTable.getSelectionModel().selectFirst();
        filterField.clear();
        customerSearch();
    }

    public void customerSearch() {
        filterField.textProperty().addListener((observable, oldValue, newValue) -> {
            filteredData.setPredicate(patient -> {
                // If filter text is empty, display all persons.
                if (newValue == null || newValue.isEmpty()) {
                    return true;
                }

                // Compare first name and last name of every person with filter text.
                String lowerCaseFilter = newValue.toLowerCase();

                if (patient.getName().toLowerCase().contains(lowerCaseFilter)) {
                    return true;
                }
                    if (patient.getBirthDate().contains(newValue)) {
                        return true;
                    }
                return false; // Does not match.
            });
        });
        // 3. Wrap the FilteredList in a SortedList.
        SortedList<PatientForChooseTable> sortedData = new SortedList<>(filteredData);

        // 4. Bind the SortedList comparator to the TableView comparator.
        sortedData.comparatorProperty().bind(patientsTable.comparatorProperty());

        // 5. Add sorted (and filtered) data to the table.
        patientsTable.setItems(sortedData);
    }

    public void backToMainManu(MouseEvent mouseEvent) {
        myController.setScreen("start");
    }

    public void deletePatient(MouseEvent mouseEvent) {
        PatientForChooseTable selectedPatient = patientsTable.getSelectionModel().getSelectedItem();
        int id=Integer.parseInt(selectedPatient.getPatientID());

        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Megerősítő ablak");
        alert.setHeaderText("Biztosan törli " + selectedPatient.getName() + " nevű pácienst?");
        alert.setContentText("Kérem válasszon!");
        Button yesButton=((Button) alert.getDialogPane().lookupButton(ButtonType.OK));
        yesButton.setText("Igen");
        Button noButton=((Button) alert.getDialogPane().lookupButton(ButtonType.CANCEL));
        yesButton.setDefaultButton(false);
        noButton.setText("Nem");
        noButton.setDefaultButton(true);

        Optional<ButtonType> result = alert.showAndWait();
        if (result.get() == ButtonType.OK) {
            Main.db.deletePatient(id);
            refreshTableData();
        } else {
          //cancel delete
        }
    }
}
