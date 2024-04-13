/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Solayman_2221430;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author diyan
 */
public class ViewContactsSceneController implements Initializable {

    @FXML
    private TableView<Contact> contactsTableView;
    @FXML
    private TableColumn<Contact, String> nameColumn;
    @FXML
    private TableColumn<Contact, String> professionColumn;
    @FXML
    private TableColumn<Contact, String> emailColumn;
    @FXML
    private TableColumn<Contact, Integer> phoneColumn;
    @FXML
    private TableColumn<Contact, String> countryColumn;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        nameColumn.setCellValueFactory(new PropertyValueFactory<Contact, String>("name"));
        professionColumn.setCellValueFactory(new PropertyValueFactory<Contact, String>("profession"));
        emailColumn.setCellValueFactory(new PropertyValueFactory<Contact, String>("email"));
        phoneColumn.setCellValueFactory(new PropertyValueFactory<Contact, Integer>("phone"));
        countryColumn.setCellValueFactory(new PropertyValueFactory<Contact, String>("country"));
        
        //use ObjectInputStream
        ObjectInputStream ois=null;
         try {
             Contact c;
             
             ois = new ObjectInputStream(new FileInputStream("Contacts.bin"));
             
                        
           
            while(true){
                c = (Contact) ois.readObject();
                contactsTableView.getItems().add(c);
                
            }
            //ois.close();
                       
        }
        catch(RuntimeException e){
            e.printStackTrace();
             //
        }
        catch (Exception ex) {
            try {
                if(ois!=null)
                    ois.close();
            } catch (IOException ex1) {  }           
        }
        
    }    

    @FXML
    private void addNewContactsButton(ActionEvent event)throws IOException {
        Parent node= FXMLLoader.load(getClass().getResource("AddContactsScene.fxml"));
        Scene addContacts = new Scene(node);
        
        Stage addContact = (Stage) ((Node)event.getSource()).getScene().getWindow();
        
        addContact.setTitle("Add New Contacts");
        addContact.setScene(addContacts);
        addContact.show();
    }
    
}
