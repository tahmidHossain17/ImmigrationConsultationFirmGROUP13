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
public class PayrollProcessingController implements Initializable {

    @FXML
    private ComboBox<String> employeeTypeCombobox;
    @FXML
    private TextField basicSalaryTextField;
    @FXML
    private TextField hoursTextField;
    @FXML
    private ComboBox<String> deductionComboBox;

    /**
     * Initializes the controller class.
     */
    Stage sg;
    @FXML
    private TextField nameTextField;
    @FXML
    private TextField taxTextField;
    Payroll py;
    @FXML
    private Label outputLabel;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        employeeTypeCombobox.getItems().addAll("Accountant","Receptionist","Consultant","Lawyer","Immigration Processing Officer","IT Officer");
        deductionComboBox.getItems().addAll("1","2","3","4","5","6","7","8","9","10");
        // TODO
    }    

    @FXML
    private void calculateSalaryOnMouseClick(ActionEvent event) {
        py= new Payroll(employeeTypeCombobox.getValue(),nameTextField.getText(),Integer.parseInt(taxTextField.getText()),Integer.parseInt(basicSalaryTextField.getText()),Float.parseFloat(hoursTextField.getText()),Integer.parseInt(deductionComboBox.getValue()));
        outputLabel.setText("Total Salary: "+Float.toString(py.calculate_salary())+" Taka");
    }

    @FXML
    private void saveRecordOnMouseClick(ActionEvent event) {
    }

    @FXML
    private void backOnMOuseClick(ActionEvent event) throws IOException {
        Parent backButton= FXMLLoader.load(getClass().getResource("AccountantMainDashboard.fxml"));
        Scene scene1=new Scene(backButton);
        
        sg=(Stage)((Node)event.getSource()).getScene().getWindow();
        
        sg.setScene(scene1);
        sg.show();
    }
    
}
