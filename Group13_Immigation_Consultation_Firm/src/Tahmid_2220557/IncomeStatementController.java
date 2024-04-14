/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Tahmid_2220557;

import com.itextpdf.kernel.geom.PageSize;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Paragraph;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author MSI
 */
public class IncomeStatementController implements Initializable {

    @FXML
    private ComboBox<String> monthComboBx;
    @FXML
    private TextField revenueTextField;
    @FXML
    private TextField expenseTextField;
    @FXML
    private TextField taxTextField;
    @FXML
    private Label netBeforeTextField;
    @FXML
    private Label netAfterTaxTextField;
    IncomeStatement inc;
    Stage sg;
    /**
     * Initializes the controller class.
     * 
     * 
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        monthComboBx.getItems().addAll("January","February","March","April","May","June","July","August","September","October","November","December");
       
        // TODO
        
       
    }    


    @FXML
    private void netIncomeOnMouseClick(ActionEvent event) {
        
        inc=new IncomeStatement(monthComboBx.getValue(),Integer.parseInt(revenueTextField.getText()),Integer.parseInt(taxTextField.getText()),Integer.parseInt(expenseTextField.getText()));
        
        netBeforeTextField.setText(Float.toString(inc.getIncomeBeforeTax()));
        
        
        netAfterTaxTextField.setText(Float.toString(inc.getIncomeAfterTax()));
        
        
        System.out.println(inc.getIncomeAfterTax());
      
        
        
    }

    @FXML
    private void generateIncomeStatementOnMouseClick(ActionEvent event) {
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
            String month = monthComboBx.getValue();
            String revenue = revenueTextField.getText();
            String expense = expenseTextField.getText();
            String netbeforetax = Float.toString(inc.getIncomeBeforeTax());
            String netaftertax = Float.toString(inc.getIncomeAfterTax());
            String tax = taxTextField.getText();
            
            // Add data to the PDF
            doc.add(new Paragraph("Income Statement of "+ month+ ",2024")
   
                .setFontSize(40));
            doc.add(new Paragraph("Total Revenue of : " + month +" is "+ revenue+ " TK"+"\n"));
            doc.add(new Paragraph("Total expense " + expense +" TK"+"\n"));
            doc.add(new Paragraph("LESS: Tax Percentage " + tax+ "%"+"\n"));
            doc.add(new Paragraph("Net Income Before Tax " + netbeforetax +"TK"+"\n"));
            doc.add(new Paragraph("Net Income After Tax " + netaftertax +"TK"));
          
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
    

    @FXML
    private void backButtonOnMouseClick(ActionEvent event) throws IOException {
        Parent backButton= FXMLLoader.load(getClass().getResource("AccountantDashboard.fxml"));
        Scene scene1=new Scene(backButton);
        
        sg=(Stage)((Node)event.getSource()).getScene().getWindow();
        
        sg.setScene(scene1);
        sg.show();
    }
    
}
