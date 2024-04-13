/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package prosanto2010271;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.URL;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 * FXML Controller class
 *
 * @author prosh
 */
public class ViewReportController implements Initializable {

    @FXML
    private TableView<Update> reportTableView;
    private TableColumn<Update, String> nameTableColumn;
    @FXML
    private TableColumn<Update, Integer> idTableColumn;
    @FXML
    private TableColumn<Update, LocalDate> dateTableColumn;
    @FXML
    private TableColumn<Update, String> detailsTableColumn;
    
    private ArrayList<Update> updatelist  = new ArrayList<Update>();
    @FXML
    private TableColumn<?, ?> nameTablecolumn;
    
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
//        FileInputStream fis = null;
//            DataInputStream dis = null;
//            try{
//                //FileInputStream fis = new FileInputStream("studData.bin");
//                File f = new File("UpdateToMDObject.bin");
//                fis = new FileInputStream(f);
//                dis = new DataInputStream(fis);
//                
////                while(true){
////                    //outputTxtArea.appendText(
////                        //"Id is: " + dis.readInt() +
////                        //", Name is: " + dis.readUTF() +
////                        //", Cgpa is: " + dis.readFloat() + "\n"
////                    );
////                }
//                //dis.close();
//            }
//            catch(Exception e){
//                //Alert a = new Alert(AlertType.INFORMATION);
//                //a.setContentText(e.toString());
//                //a.setContentText("Content from Data file is loaded successfully.");
//                //a.showAndWait();                
//                dis.close();
//                //SHOW e.toString() IN AN ALERT
//            }          
        
                
        
         
        nameTableColumn.setCellValueFactory(new PropertyValueFactory<Update,String>("name"));
        idTableColumn.setCellValueFactory(new PropertyValueFactory<Update,Integer>("id"));
        dateTableColumn.setCellValueFactory(new PropertyValueFactory<Update,LocalDate>("date"));
        detailsTableColumn.setCellValueFactory(new PropertyValueFactory<Update,String>("details"));
        
        
        for(Update s: updatelist ){
            reportTableView.getItems().add(s);
        
    }    
    
}
}
