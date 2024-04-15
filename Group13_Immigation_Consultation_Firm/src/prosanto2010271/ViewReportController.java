/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package prosanto2010271;

import com.itextpdf.kernel.geom.PageSize;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Paragraph;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.URL;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.FileChooser;

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
       reportTableView.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);  
    }

    @FXML
    private void generatePdfButtonOnMouseClick(ActionEvent event) {
        Update selectedReport = reportTableView.getSelectionModel().getSelectedItem();
        
          try {
        FileChooser fc = new FileChooser();
        fc.getExtensionFilters().add(new FileChooser.ExtensionFilter("PDF files", "*.pdf"));
        File f = fc.showSaveDialog(null);
        
        if (f != null) {
            // Create a new PDF document
            PdfWriter pw = new PdfWriter(new FileOutputStream(f));
            PdfDocument pdf = new PdfDocument(pw);
            Document doc = new Document(pdf, PageSize.A4);
            
            // Add content to the PDF document
            String name = selectedReport.getName();
            int id = selectedReport.getId();
            String details = selectedReport.getDetails();
            String date = selectedReport.getDate().toString();
            
            // Add data to the PDF
            doc.add(new Paragraph("Report")
   
                .setFontSize(26));
            doc.add(new Paragraph("Name: " + name));
            doc.add(new Paragraph("ID: " + id));
            doc.add(new Paragraph("Date: " + date));
            doc.add(new Paragraph("Details: " + details));
            
           ;
            
            
            // Close the document
            doc.close();
            
            // Show success message
            Alert successAlert = new Alert(Alert.AlertType.INFORMATION);
            successAlert.setContentText("PDF saved successfully.");
            successAlert.showAndWait();
        } else {
            // Show cancellation message
            Alert cancelAlert = new Alert(Alert.AlertType.INFORMATION);
            cancelAlert.setContentText("Saving as PDF: cancelled!");
            cancelAlert.showAndWait();
        }
    } catch (Exception e) {
        // Show error message
        Alert errorAlert = new Alert(Alert.AlertType.ERROR);
        errorAlert.setContentText("Oops! Exception: " + e.toString() + " occurred.");
        errorAlert.showAndWait();
        e.printStackTrace();
    }
        
    }
       
    }
        


