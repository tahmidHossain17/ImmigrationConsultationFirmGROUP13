/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Solayman_2221430;

import Tahmid_2220557.BalanceSheetOutputController;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author diyan
 */
public class ApplyForBankSolvencySceneController implements Initializable {

    @FXML
    private TextField amountTextField;
    @FXML
    private ComboBox<String> timePeriodComboBox;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        timePeriodComboBox.getItems().addAll("3","6", "12");
        // TODO
    }    

    @FXML
    private void okButtonOnMouseClick(ActionEvent event)throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("ApplyForBankSolvencyPopUpScene.fxml"));
        Parent personViewParent = loader.load();

        //Parent personViewParent = FXMLLoader.load(getClass().getResource("FXMLScene2.fxml"));
        Scene personViewScene = new Scene(personViewParent);
        
        //access the controller
        ApplyForBankSolvencyPopUpSceneController controller = loader.getController();
        //ersonViewSceneController controller = new PersonViewSceneController();
//        controller.initData(tableView.getSelectionModel().getSelectedItem());
         controller.dataPass(amountTextField.getText(), timePeriodComboBox.getValue());
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        window.setScene(personViewScene);
        window.show();
        
        
        
        
    }
    
    
}
