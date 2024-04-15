/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Komol;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import static javafx.scene.control.PopupControl.USE_COMPUTED_SIZE;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Komol
 */
public class CaseRequestVisibilityController implements Initializable {

    @FXML
    private TableView<Case> tableview;
    @FXML
    private TableColumn<Case, String> clientName;
    @FXML
    private TableColumn<Case, String> clientNumber;
    @FXML
    private TableColumn<Case, String> Categoriesoncolumn;
    @FXML
    private TableColumn<Case, String> advisornameoncolumn;
    @FXML
    private TableColumn<Case, LocalDate> dateoncolumn;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        clientName.setCellValueFactory(new PropertyValueFactory<>("clientName"));
        clientNumber.setCellValueFactory(new PropertyValueFactory<>("number"));
        Categoriesoncolumn.setCellValueFactory(new PropertyValueFactory<>("categories"));
        advisornameoncolumn.setCellValueFactory(new PropertyValueFactory<>("advisorName"));
        dateoncolumn.setCellValueFactory(new PropertyValueFactory<>("date"));
        

    }    

   @FXML
private void loadinfobuttononclick(ActionEvent event) {
    ObservableList<Case> caseList = FXCollections.observableArrayList();
    tableview.setPlaceholder(new Label(""));
    File f = null;
    FileInputStream fis = null;
    DataInputStream dis = null;
    String str="";

    try {
        f = new File("case.bin");
        if(!f.exists()){
            tableview.setPlaceholder(new Label("Oops! Feedback.bin binary file does not exist..."));
        }
        else{
            fis = new FileInputStream(f);
            dis = new DataInputStream(fis);

            while (dis.available() > 0) {
                String Name = dis.readUTF();
                String number = dis.readUTF();
                String categories = dis.readUTF();
                String advisorName = dis.readUTF();
                String dateString = dis.readUTF();
                LocalDate date = LocalDate.parse(dateString);

                Case caseInstance  = new Case(Name,number,categories,advisorName,date);
                caseList.add(caseInstance );
            }
            tableview.setItems(caseList);
        }
    } catch (IOException ex) {
        Logger.getLogger(CaseRequestVisibilityController.class.getName()).log(Level.SEVERE, null, ex); 
        Label errorMessage = new Label("An error occurred while loading tasks.");
        tableview.setPlaceholder(errorMessage);
    } finally {
        try {
            if(dis != null) dis.close();
        } catch (IOException ex) {
            Logger.getLogger(CaseRequestVisibilityController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }          
}


    @FXML
    private void logoutbuttononclick(ActionEvent event)throws IOException {
         FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/mainPKG/Login.fxml"));
        Parent parent = fxmlLoader.load();

        // Retrieve preferred height and width from the loaded parent node
        double prefHeight = parent.prefHeight(USE_COMPUTED_SIZE);
        double prefWidth = parent.prefWidth(USE_COMPUTED_SIZE);

        Stage stage = new Stage();
        stage.setTitle("login");
        stage.setScene(new Scene(parent, prefWidth, prefHeight));
        stage.show();   
    }

    @FXML
    private void backonbuttononclick(ActionEvent event) throws IOException {
         FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("LegaladvisorDashboard.fxml"));
        Parent parent = fxmlLoader.load();

        // Retrieve preferred height and width from the loaded parent node
        double prefHeight = parent.prefHeight(USE_COMPUTED_SIZE);
        double prefWidth = parent.prefWidth(USE_COMPUTED_SIZE);

        Stage stage = new Stage();
        stage.setTitle("login");
        stage.setScene(new Scene(parent, prefWidth, prefHeight));
        stage.show();   
    }
    
}
