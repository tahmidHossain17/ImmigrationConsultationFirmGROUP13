/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Tahmid_2220557;

import com.itextpdf.io.font.FontConstants;
import com.itextpdf.io.image.ImageData;
import com.itextpdf.io.image.ImageDataFactory;
import com.itextpdf.kernel.color.Color;
import com.itextpdf.kernel.font.PdfFont;
import com.itextpdf.kernel.font.PdfFontFactory;
import com.itextpdf.kernel.geom.PageSize;
import com.itextpdf.kernel.pdf.DocumentProperties;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
//import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Cell;
import com.itextpdf.layout.element.Image;
import com.itextpdf.layout.element.List;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Table;
import com.itextpdf.layout.element.Text;
import java.awt.Font;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Optional;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.WritableImage;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author MSI
 */
public class R_PayslipofClientController implements Initializable {

    @FXML
    private TextField nameTextField;
    @FXML
    private TextField phoneTextField;
    @FXML
    private TextField recievedAmountTextField;
    @FXML
    private TextField discountTextField;
    @FXML
    private DatePicker dateLocalDate;
    @FXML
    private Label dueLabel;
    @FXML
    private TextField amountTextFIeld;
    
    
    Paymentslip slip;
    DummyPayment dslip;

    /**
     * Initializes the controller class.
     */
    Stage sg;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        slip =new Paymentslip();
        dslip=new DummyPayment();
        // TODO
    }    

 @FXML
private void saveRecordOnMouseClick(ActionEvent event) {
    FileOutputStream fos = null;
    ObjectOutputStream oos = null;
    File f = null;
 
    slip = new Paymentslip(nameTextField.getText(), phoneTextField.getText(), 
                           Integer.parseInt(amountTextFIeld.getText()), 
                           Integer.parseInt(recievedAmountTextField.getText()), 
                           Integer.parseInt(discountTextField.getText())
                           , dateLocalDate.getValue());
    
    dslip=new DummyPayment(slip.getDueAmount(),nameTextField.getText(), phoneTextField.getText(), 
                           Integer.parseInt(amountTextFIeld.getText()), 
                           Integer.parseInt(recievedAmountTextField.getText()), 
                           Integer.parseInt(discountTextField.getText())
                           , dateLocalDate.getValue());
    System.out.println(dslip);
     System.out.println(slip.getDueAmount());

    try {
        f = new File("paymentRecord.bin");

        if (f.exists()) {
            fos = new FileOutputStream(f, true);
            oos = new AppendableObjectOutputStream(fos);
        } else {
            fos = new FileOutputStream(f);
            oos = new ObjectOutputStream(fos);
        }

        oos.writeObject(dslip); // Serialize only the Paymentslip object
        System.out.println("Written successful");

        dueLabel.setText("Amount Due is " + Float.toString(slip.getDueAmount()) + " Taka");

    } catch (Exception ex) {
        ex.printStackTrace(); // Print stack trace to identify any exceptions
    } finally {
        try {
            if (oos != null) {
                oos.close();
            }
            if (fos != null) {
                fos.close();
            }
        } catch (IOException ex) {
            ex.printStackTrace(); // Handle IO exceptions
        }
    }
}

    

    @FXML
    private void savePdfOnMouseClick(ActionEvent event) {
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
            String name = nameTextField.getText();
            String phone = phoneTextField.getText();
            String amount = amountTextFIeld.getText();
            String receivedAmount = recievedAmountTextField.getText();
            String discount = discountTextField.getText();
            String dueAmount = dueLabel.getText();
            String date = dateLocalDate.getValue().toString();
            
            // Add data to the PDF
            doc.add(new Paragraph("Payment Slip")
   
                .setFontSize(26));
            doc.add(new Paragraph("Name: " + name));
            doc.add(new Paragraph("Phone: " + phone));
            doc.add(new Paragraph("Amount: " + amount));
            doc.add(new Paragraph("Received Amount: " + receivedAmount));
            doc.add(new Paragraph("Discount: " + discount));
            doc.add(new Paragraph("Due Amount: " + dueAmount));
            doc.add(new Paragraph("Date: " + date));
            
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
    private void backOnMouseClick(ActionEvent event) throws IOException {
        
        Parent backButton= FXMLLoader.load(getClass().getResource("R_ReceptionistMainDashboard.fxml"));
        Scene scene1=new Scene(backButton);
        
        sg=(Stage)((Node)event.getSource()).getScene().getWindow();
        
        sg.setScene(scene1);
        sg.show();
    }
    
}
