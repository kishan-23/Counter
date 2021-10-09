package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;


public class Controller {
    int counter = 0;
    @FXML
    Label countValue;
    public void countAction(ActionEvent actionEvent) {
        counter++;
        countValue.setText(""+counter);
    }
}
