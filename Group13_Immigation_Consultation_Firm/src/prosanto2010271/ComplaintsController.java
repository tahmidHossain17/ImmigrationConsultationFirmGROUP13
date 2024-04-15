/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package prosanto2010271;

import java.net.URL;
import java.time.LocalDate;
import java.time.Month;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;

/**
 * FXML Controller class
 *
 * @author prosh
 */
public class ComplaintsController implements Initializable {

    @FXML
    private TableView<Complaint> complaintsTableView;
    @FXML
    private TableColumn<Complaint, String> nameTableColumn;
    @FXML
    private TableColumn<Complaint, LocalDate> dateTableColumn;
    @FXML
    private TableColumn<Complaint, Integer> caseIdTableColumn;
    @FXML
    private TableColumn<Complaint, String> issuesTableColumn;
    @FXML
    private TableColumn<Complaint, Boolean> statusTableColumn;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
//        // TODO
//        nameTableColumn.setCellValueFactory(new PropertyValueFactory<Complaint,String>("name"));
//   
//        dateTableColumn.setCellValueFactory(new PropertyValueFactory<Complaint,LocalDate>("date"));
//        caseIdTableColumn.setCellValueFactory(new PropertyValueFactory<Complaint,Integer>("caseId"));
//        issuesTableColumn.setCellValueFactory(new PropertyValueFactory<Complaint,String>("issue"));
//        statusTableColumn.setCellValueFactory(new PropertyValueFactory<Complaint,Boolean>("stats"));
//        //load dummy data
//        tableView.setItems(this.getPeople());    
//        //ArrayList<Person> instance will be returned
//        //return type is ObservableList<Person>, because,
//        //ArrayList is an implementing class of ObservableList interface
//        
//        //Allow first and last name to be edittable
//        tableView.setEditable(true);
//        firstNameColumn.setCellFactory(TextFieldTableCell.forTableColumn());
//        lastNameColumn.setCellFactory(TextFieldTableCell.forTableColumn());
//    }    
//    
//    public ObservableList<Complaint> getcomplaint(){
//        ObservableList<Complaint> complain = FXCollections.observableArrayList();
//        
//        //ObservableList<Person> people2 = new ArrayList<Person>();
//        people.add(new Person("Ahsan", "Habib", LocalDate.of(1998, Month.AUGUST, 12)));
//        people.add(new Person("Lisa", "Rahman", LocalDate.of(2000, Month.JUNE, 30)));
//        people.add(new Person("Farid", "Uddin", LocalDate.of(2001, Month.APRIL, 17)));
//        return people;
//    } 
//    @FXML
//    private void resolvedButtonOnMouseClick(ActionEvent event) {
//        
    }

    @FXML
    private void resolvedButtonOnMouseClick(ActionEvent event) {
    }
   
}
