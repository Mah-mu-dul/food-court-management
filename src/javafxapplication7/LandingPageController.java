/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package javafxapplication7;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author hp
 */
public class LandingPageController implements Initializable {

    String selected = ""
            + "-fx-background-color:  #bccae6;"
            + "-fx-background-radius: 8";
    String Deselected = ""
            + "-fx-background-color:  none;";

    String[] pages = {"home", "orders", "items", "controll"};

    private Stage stage;
    private Scene scene;
    private Parent root;

    @FXML
    private Label homebtn;
    @FXML
    private Label orderbtn;
    @FXML
    private Label itemsbtn;
    @FXML
    private Label controllbtn;
    @FXML
    private BorderPane mainBorderPane;

    /**
     * Initializes the controller class.
     */
    @Override

    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    private void select(String page) {
        deselect();

        if (page == "home") {
            homebtn.setStyle(selected);
        } else if (page == "orders") {
            orderbtn.setStyle(selected);

        } else if (page == "items") {
            itemsbtn.setStyle(selected);

        } else if (page == "controll") {
            controllbtn.setStyle(selected);

        }
    }

    private void deselect() {
        homebtn.setStyle(Deselected);
        orderbtn.setStyle(Deselected);
        itemsbtn.setStyle(Deselected);
        controllbtn.setStyle(Deselected);

    }

    @FXML
    private void homeBtnClick(MouseEvent event) throws IOException {
        select("home");
        loadPage("Home");

    }

    @FXML
    private void ordersBtnClick(MouseEvent event) throws IOException {
        select("orders");
        loadPage("Orders");

    }

    @FXML
    private void itemsBtnClick(MouseEvent event) {

        select("items");

    }

    @FXML
    private void controllBtnClick(MouseEvent event) {
        select("controll");

    }

    private void loadPage(String page) {
        Object Parent = null;
        try {
            root = FXMLLoader.load(getClass().getResource(page + ".fxml"));
        } catch (IOException ex) {
            Logger.getLogger(LandingPageController.class.getName()).log(Level.SEVERE, null, ex);
        }
        mainBorderPane.setCenter(root);

    }

}
