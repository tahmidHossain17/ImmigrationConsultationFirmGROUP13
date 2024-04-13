/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Tahmid_2220557;

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
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author MSI
 */
public class IncomeStatementController implements Initializable {

    @FXML
    private ComboBox<String> monthComboBx;
    @FXML
    private TextField revenueTextField;
    @FXML
    private TextField expenseTextField;
    @FXML
    private TextField taxTextField;
    @FXML
    private Label netBeforeTextField;
    @FXML
    private Label netAfterTaxTextField;
    IncomeStatement inc;
    Stage sg;
    /**
     * Initializes the controller class.
     * 
     * 
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        monthComboBx.getItems().addAll("January","February","March","April","May","June","July","August","September","October","November","December");
       
        // TODO
        
       
    }    


    @FXML
    private void netIncomeOnMouseClick(ActionEvent event) {
        
        inc=new IncomeStatement(monthComboBx.getValue(),Integer.parseInt(revenueTextField.getText()),Integer.parseInt(taxTextField.getText()),Integer.parseInt(expenseTextField.getText()));
        
        netBeforeTextField.setText(Float.toString(inc.getIncomeBeforeTax()));
        
        
        netAfterTaxTextField.setText(Float.toString(inc.getIncomeAfterTax()));
        
        
        System.out.println(inc.getIncomeAfterTax());
      
        
        
    }

    @FXML
    private void generateIncomeStatementOnMouseClick(ActionEvent event) {
    }

    @FXML
    private void backButtonOnMouseClick(ActionEvent event) throws IOException {
                        Parent backButton= FXMLLoader.load(getClass().getResource("AccountantMainDashboard.fxml"));
        Scene scene1=new Scene(backButton);
        
        sg=(Stage)((Node)event.getSource()).getScene().getWindow();
        
        sg.setScene(scene1);
        sg.show();
    }
    
}
