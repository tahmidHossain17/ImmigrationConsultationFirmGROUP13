/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Tahmid_2220557;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author MSI
 */
public class R_PayslipofClientController implements Initializable {

    @FXML
    private TextField nameTextField;
    @FXML
    private TextField phoneTextField;
    @FXML
    private TextField recievedAmountTextField;
    @FXML
    private TextField discountTextField;
    @FXML
    private DatePicker dateLocalDate;
    @FXML
    private Label dueLabel;
    @FXML
    private TextField amountTextFIeld;
    
    
    Paymentslip slip;

    /**
     * Initializes the controller class.
     */
    Stage sg;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        slip =new Paymentslip();
        // TODO
    }    

    @FXML
    private void saveRecordOnMouseClick(ActionEvent event) {
     
        FileOutputStream fos=null;
        ObjectOutputStream oos=null;
        
        File f=null;
        
        slip=new Paymentslip(nameTextField.getText(),phoneTextField.getText(),Integer.parseInt(amountTextFIeld.getText()),Integer.parseInt(recievedAmountTextField.getText()),Integer.parseInt(discountTextField.getText()),slip.getDueAmount(),dateLocalDate.getValue());
        
        try{
            
            f=new File("paymentRecord.bin");
            
            if (f.exists()){
                fos= new FileOutputStream(f,true);
                oos=new AppendableObjectOutputStream(fos);
                
            }
            else{
                fos=new FileOutputStream(f);
                oos=new ObjectOutputStream(fos);
            
            }
            
            oos.writeObject(slip);
            System.out.println("Written succesfull");
            
            dueLabel.setText("Amout Due is "+Float.toString(slip.getDueAmount())+" Taka");
            
            
        
            oos.close();
        
        
        }
        catch(Exception ex){}
}

        
    

    @FXML
    private void savePdfOnMouseClick(ActionEvent event) {
    }

    @FXML
    private void backOnMouseClick(ActionEvent event) throws IOException {
        
        Parent backButton= FXMLLoader.load(getClass().getResource("R_ReceptionistMainDashboard.fxml"));
        Scene scene1=new Scene(backButton);
        
        sg=(Stage)((Node)event.getSource()).getScene().getWindow();
        
        sg.setScene(scene1);
        sg.show();
    }
    
}
