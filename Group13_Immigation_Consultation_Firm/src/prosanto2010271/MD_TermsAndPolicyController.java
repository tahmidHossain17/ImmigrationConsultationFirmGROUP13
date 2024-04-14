/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package prosanto2010271;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 * FXML Controller class
 *
 * @author prosh
 */
public class MD_TermsAndPolicyController implements Initializable {

    @FXML
    private TextField addTermsAndPolicyTextField;
    //private TableColumn<TermsAndCondition, String> termsAndPolicyTableColumn;
    @FXML
    private TextField termsNumberTextField;
    @FXML
    private TextArea tandcTextArea;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb)  {
       
          //use ObjectInputStream
        
//         
          
        }
    
    
   
     

    @FXML
    private void savetermsAndPolicyButtonOnMouseClick(ActionEvent event) {
        
        TermsAndCondition newtndc = new TermsAndCondition( termsNumberTextField.getText(),
                addTermsAndPolicyTextField.getText() );
        
        
        File f = null;
        FileOutputStream fos = null;      
        ObjectOutputStream oos = null;
        
        try {
            f = new File("Terms and Policy.bin");
            if(f.exists()){
                fos = new FileOutputStream(f,true);
                oos = new AppendableObjectOutputStream(fos);                
            }
            else{
                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream(fos);               
            }
            
            oos.writeObject(newtndc);

        } catch (IOException ex) {
            Logger.getLogger(MD_TermsAndPolicyController.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if(oos != null) oos.close();
            } catch (IOException ex) {
                Logger.getLogger(MD_TermsAndPolicyController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }   
        
      
        }
    
        

    @FXML
    private void showTermsAndPolicyButtonOnMouseClick(ActionEvent event) {
        
 
        
        ObjectInputStream ois=null;
         try {
             TermsAndCondition s;
             //FileInputStream fis = new FileInputStream("studObjects.bin");
             //ois = new ObjectInputStream(fis);
             ois = new ObjectInputStream(new FileInputStream("Terms and Policy.bin"));
             
            tandcTextArea.setText(null);
            
            //int[] arr={1,2,3};
            //System.out.println(arr[3]);
            while(true){
                s = (TermsAndCondition) ois.readObject();
                //s.getId();               
                //Object obj = ois.readObject();
                //obj.toString();
                //studArr.add((Student) ois.readObject());
                tandcTextArea.appendText(s.getTermsAndConditionNumber() + "    " + s.getTermsAndCondition() + "\n");
                //outputTxtArea.appendText(s+"\n");
            }
            //ois.close();
                       
        }
        catch(RuntimeException e){
            e.printStackTrace();
             //
        }
        catch (Exception ex) {
           
            try {
                System.out.println(ex.toString());
                if(ois!=null)
                    ois.close();
            } catch (IOException ex1) {  }           
        }
    }
}
