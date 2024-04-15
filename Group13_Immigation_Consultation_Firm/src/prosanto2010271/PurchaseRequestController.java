/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package prosanto2010271;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author prosh
 */
public class PurchaseRequestController implements Initializable {

    @FXML
    private TextField ammountTextField;
    @FXML
    private DatePicker requestDateSelectDate;
    @FXML
    private TextField idTextField;
    @FXML
    private TextField purposeTextField;
    private ArrayList<PurchaseRequest> purchaseRrquestList;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        purchaseRrquestList = new ArrayList<PurchaseRequest>();
        // TODO
        
    
}

    @FXML
    private void sendRequestButtonMouseOnClick(ActionEvent event) {
         purchaseRrquestList.add( new PurchaseRequest(Integer.parseInt(idTextField.getText()), requestDateSelectDate.getValue(),
                Float.parseFloat(ammountTextField.getText()),purposeTextField.getText()));
   
             
        File f = null;
        FileOutputStream fos = null;      
        ObjectOutputStream oos = null;
        
        try {
            f = new File("PurchaseRequests.bin");
            if(f.exists()){
                fos = new FileOutputStream(f,true);
                oos = new AppendableObjectOutputStream(fos);                
            }
            else{
                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream(fos);               
            }
            
            for(PurchaseRequest s: purchaseRrquestList){
                    oos.writeObject(s);
                //oos.close();
                    }

        } catch (IOException ex) {
            Logger.getLogger(UpdateToMDController.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if(oos != null) oos.close();
            } catch (IOException ex) {
                Logger.getLogger(UpdateToMDController.class.getName()).log(Level.SEVERE, null, ex);
            }
        } 
        
       
    }    
    }

