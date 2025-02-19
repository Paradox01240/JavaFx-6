package color;

import javafx.fxml.FXML;
import javafx.scene.control.ColorPicker;
import javafx.scene.layout.AnchorPane;

import java.awt.event.ActionEvent;

public class LightController {
@FXML
    private ColorPicker ColorPicker;
@FXML
    private AnchorPane pane;


    public void change(){
        pane.setStyle("-fx-background-color: #" + ColorPicker.getValue().toString().substring(2));
    }
}
