/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package javafxapplication7;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

/**
 * FXML Controller class
 *
 * @author hp
 */
public class MainUIController implements Initializable {

    @FXML
    private Label label;
    @FXML
    private Button btn;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void btnClick(ActionEvent event) {
        if (label.getText().length() > 0) {
            label.setText("");
            btn.setText("Click me to check");
        } else {
            label.setText("Every thing is fine.");
            btn.setText("Click me to remove text");

        }
    }

}
