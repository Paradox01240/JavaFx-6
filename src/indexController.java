import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;

public class indexController {
    @FXML
private CheckBox myCheckBox ;
    @FXML
    private Label label;
    @FXML
    private ImageView image;
    public void change(ActionEvent event){

        if(myCheckBox.isSelected()){
            label.setText("On");
            image.setImage(new javafx.scene.image.Image("light-on.png"));
        }
        else{
            label.setText("Off");
            image.setImage(new javafx.scene.image.Image("light-off.png"));
        }
    }
}
