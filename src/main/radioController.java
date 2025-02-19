package main;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;

public class radioController {
@FXML
    private RadioButton rButton1,rButton2,rButton3;
@FXML
    private Label food;

    public void getFood(ActionEvent event){
        if (rButton1.isSelected()){
            food.setText(rButton1.getText());
        }else if(rButton2.isSelected()){
            food.setText(rButton2.getText());
        }else if (rButton3.isSelected()){
            food.setText(rButton3.getText());
        }
    }
}
