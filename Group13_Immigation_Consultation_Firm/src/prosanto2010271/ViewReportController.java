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
    @FXML
    private TableColumn<Update, String> nameTableColumn;
    @FXML
    private TableColumn<Update, Integer> idTableColumn;
    @FXML
    private TableColumn<Update, LocalDate> dateTableColumn;
    @FXML
    private TableColumn<Update, String> detailsTableColumn;
    
    private ArrayList<Update> updatelist  = new ArrayList<Update>();

    
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        nameTableColumn.setCellValueFactory(new PropertyValueFactory<Update,String>("name"));
        idTableColumn.setCellValueFactory(new PropertyValueFactory<Update,Integer>("id"));
        dateTableColumn.setCellValueFactory(new PropertyValueFactory<Update,LocalDate>("date"));
        detailsTableColumn.setCellValueFactory(new PropertyValueFactory<Update,String>("details"));
        
        ObjectInputStream ois=null;
         try {
             Update u;
             //FileInputStream fis = new FileInputStream("studObjects.bin");
             //ois = new ObjectInputStream(fis);
             ois = new ObjectInputStream(new FileInputStream("UpdateToMDObject.bin"));
             
        
            
            //int[] arr={1,2,3};
            //System.out.println(arr[3]);
            while(true){
                u = (Update) ois.readObject();
                reportTableView.getItems().add(u);
                
                
                
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
            } catch (IOException ex1) { 
            
            }           
        }
    }
        
    }
        


