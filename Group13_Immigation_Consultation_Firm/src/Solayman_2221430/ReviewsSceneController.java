/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Solayman_2221430;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author diyan
 */
public class ReviewsSceneController implements Initializable {

    @FXML
    private TextField addReviewTextField;
    @FXML
    private ComboBox<?> rateUsButton;
    @FXML
    private TableView<?> reviewTableView;
    @FXML
    private TableColumn<?, ?> clientNameColumn;
    @FXML
    private TableColumn<?, ?> reviewColumn;
    @FXML
    private Button addReviewButton;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
