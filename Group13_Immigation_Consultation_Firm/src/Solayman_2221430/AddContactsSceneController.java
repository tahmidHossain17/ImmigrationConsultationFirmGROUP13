/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Solayman_2221430;

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
public class AddContactsSceneController implements Initializable {

    @FXML
    private ComboBox<String> countryComboBox;
    @FXML
    private TextField nameTextField;
    @FXML
    private TextField professionTextField;
    @FXML
    private TextField emailTextField;
    @FXML
    private TextField phoneTextField;
    
    ArrayList<Contact> contactList;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        countryComboBox.getItems().addAll("USA","Canada","Australia","Malaysia","China");
        contactList= new ArrayList();
        
        
    }    

    @FXML
    private void addMoreButtonOnMouseClick(ActionEvent event) {
        
        contactList.add(new Contact(nameTextField.getText(),countryComboBox.getValue(),professionTextField.getText(),emailTextField.getText(),Integer.parseInt(phoneTextField.getText())));
        
    }

    @FXML
    private void saveButtonOnMouseClick(ActionEvent event) {
        
        
//        Contact s;
            FileOutputStream fos = null;
            ObjectOutputStream oos = null;
            File f = null;
            try {
                f = new File("Contacts.bin");
                if (f.exists()) {
                    fos = new FileOutputStream(f, true);
                    oos = new AppendableObjectOutputStream(fos);
                } else {
                    fos = new FileOutputStream(f);
                    oos = new ObjectOutputStream(fos);
                }
                for(Contact c: contactList){
                    
                    oos.writeObject(c);
                    
                }
                
                

            } catch (IOException ex) {
                Logger.getLogger(AddContactsSceneController.class
                        .getName()).log(Level.SEVERE, null, ex);
            } finally {
                try {
                    if (oos != null) {
                        oos.close();

                    }
                } catch (IOException ex) {
                    Logger.getLogger(AddContactsSceneController.class
                            .getName()).log(Level.SEVERE, null, ex);
                }
            }
//        try{
//                FileOutputStream fos = new FileOutputStream("Contacts.bin",true);
//                ObjectOutputStream oos = new ObjectOutputStream(fos);
//                for(Contact c: contactList)
//                    oos.writeObject(c);
//                oos.close();
//            }
//            catch(Exception e){
//                //SHOW e.toString() IN AN ALERT
//            }
    }

    @FXML
    private void backButtonOnMouseClick(ActionEvent event)throws IOException {
        Parent node= FXMLLoader.load(getClass().getResource("ViewContactsScene.fxml"));
        Scene viewContacts = new Scene(node);
        
        Stage viewContact = (Stage) ((Node)event.getSource()).getScene().getWindow();
        
        viewContact.setTitle("View Contacts");
        viewContact.setScene(viewContacts);
        viewContact.show();
        
    }
    
}
