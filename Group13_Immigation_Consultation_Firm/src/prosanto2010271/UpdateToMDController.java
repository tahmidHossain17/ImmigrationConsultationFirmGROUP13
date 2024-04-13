/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package prosanto2010271;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import static javafx.scene.web.WebEvent.ALERT;

/**
 * FXML Controller class
 *
 * @author prosh
 */
public class UpdateToMDController implements Initializable {

    @FXML
    private TextArea detailsTextField;
    @FXML
    private DatePicker selectDateDatePicker;
    @FXML
    private TextField nameTextField;
    @FXML
    private TextField idTextField;
    
    private ArrayList<Update> updateList ;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        updateList = new ArrayList<Update>();
    }    

    @FXML
    private void sendUpdateOnMouseClicke(ActionEvent event) {
         updateList.add( new Update(nameTextField.getText(),Integer.parseInt(idTextField.getText()), selectDateDatePicker.getValue(),
                detailsTextField.getText()));
   
             try{
                FileOutputStream fos = new FileOutputStream("UpdateToMDObject.bin", true);
                ObjectOutputStream oos = new ObjectOutputStream(fos);
                for(Update s: updateList){
                    oos.writeObject(s);
                oos.close();
                    }
             }
            catch(Exception e){
                //SHOW e.toString() IN AN ALERT
            } 
             FileWriter fw = null;
            try {
                //write code to dump studArr in Stud.txt
                //use FileWriter
                File f = new File("studText.txt");
                
                //FileWriter fw = new FileWriter(f);
                if(f.exists())
                    //fw = new FileWriter("studText.txt",true);
                    fw = new FileWriter(f,true);
                else 
                    //fw = new FileWriter(f);
                    fw = new FileWriter("UpdateToMDObject.txt");
                String str="";
                for(Update s: updateList){
                    str += s.getName()+","+ s.getId()+","+s.getDate()+","+s.getDetails()+"\n";
                    //str += s.toString(); 
                    //if toString is overridden to return
                    //return id+","+name+","+cgpa+"\n"
                }
                fw.write(str);  //fw.write(s.toString());
                fw.close();
             }
            catch (IOException ex) {
              //catch (Exception ex) {
                //fw.close();
                //SHOW ex.toString() IN AN ALERT
            }
    }
    @FXML
    private void uploadFileOnMouseClick(ActionEvent event) {
        
    }
    
}

