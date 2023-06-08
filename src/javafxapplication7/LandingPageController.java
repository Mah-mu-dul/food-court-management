/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package javafxapplication7;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;

/**
 * FXML Controller class
 *
 * @author hp
 */
public class LandingPageController implements Initializable {

    @FXML
    private Label homebtn;
    @FXML
    private Label orders;
    @FXML
    private Label items;
    @FXML
    private Label controll;
    String selected = ""
            + "-fx-background-color:  #bccae6;"
            + "-fx-background-radius: 8";
    String Deselected = ""
            + "-fx-background-color:  none;";

    /**
     * Initializes the controller class.
     */
    @Override

    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void homeBtnClick(MouseEvent event) {
        homebtn.setStyle(selected);

        orders.setStyle(Deselected);
        items.setStyle(Deselected);
        controll.setStyle(Deselected);

    }

    @FXML
    private void ordersBtnClick(MouseEvent event) {
        orders.setStyle(selected);
        homebtn.setStyle(Deselected);
        items.setStyle(Deselected);
        controll.setStyle(Deselected);

    }

    @FXML
    private void itemsBtnClick(MouseEvent event) {
        items.setStyle(selected);
        homebtn.setStyle(Deselected);
        orders.setStyle(Deselected);
        controll.setStyle(Deselected);

    }

    @FXML
    private void controllBtnClick(MouseEvent event) {
        controll.setStyle(selected);
        homebtn.setStyle(Deselected);
        orders.setStyle(Deselected);
        items.setStyle(Deselected);

    }

}
