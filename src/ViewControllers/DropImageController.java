package ViewControllers;

import Controller.Main;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.DragEvent;
import javafx.scene.input.TransferMode;
import javafx.stage.Stage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Optional;

public class DropImageController {

    @FXML
    ImageView dropImageimageView;

    String imageName;
    ManagePatientController parentController;

    Stage parentStage;

    Image defaultImage=new Image("img/black.jpg");
    @FXML
    public void initialize(){
        dropImageimageView.setImage(defaultImage);
    }


    public void setOnDragOver(DragEvent dragEvent) {
            if (dragEvent.getDragboard().hasFiles()) {
                dragEvent.acceptTransferModes(TransferMode.ANY);
            }
            dragEvent.consume();
    }

    public void setOnDragDropped(DragEvent dragEvent) {
        List<File> files = dragEvent.getDragboard().getFiles();
        File imageFile=files.get(0);
        Image img=null;
        try {
            img=new Image(new FileInputStream(imageFile));
            dropImageimageView.setImage(img);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        dragEvent.consume();
        alert(img, imageFile);
    }

    private void alert(Image img, File imageFile) {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Megerősítő ablak");
        alert.setHeaderText("A megfelelő képet választotta ki?");
        alert.setContentText("Kérem válasszon!");
        ((Button) alert.getDialogPane().lookupButton(ButtonType.OK)).setText("Igen");
        ((Button) alert.getDialogPane().lookupButton(ButtonType.CANCEL)).setText("Nem");

        Optional<ButtonType> result = alert.showAndWait();
        if (result.get() == ButtonType.OK) {
            parentController.setImage(imageName, img);
            Stage stage = (Stage) dropImageimageView.getScene().getWindow();
            stage.close();
            parentStage.show();
            Main.db.saveImage(imageName, imageFile);
        } else {
            dropImageimageView.setImage(defaultImage);
        }
    }


    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public void setParentController(ManagePatientController parentController) {
        this.parentController = parentController;
    }

    public void setParentStage(Stage parentStage) {
        this.parentStage = parentStage;
    }
}
