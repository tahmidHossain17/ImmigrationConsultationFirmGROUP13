/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Solayman_2221430;

import com.itextpdf.kernel.geom.PageSize;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.element.Paragraph;
import java.io.File;
import java.io.FileOutputStream;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.stage.FileChooser;

/**
 * FXML Controller class
 *
 * @author diyan
 */
public class ApplyForBankSolvencyPopUpSceneController implements Initializable {

    @FXML
    private ComboBox<String> mortageComboBox;
    @FXML
    private Label showAmountLabel;

    /**
     * Initializes the controller class.
     */
    float payableAmount;
    float extraAmount;
    String months;
    String amounts;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        mortageComboBox.getItems().addAll("House", "Flat", "Gold", "Car", "Diamond");

    }

    public void dataPass(String amount, String timePeriod) {

        payableAmount = (Float.parseFloat(amount)) + (Float.parseFloat(amount) * Float.parseFloat(timePeriod) * 0.08f);
        extraAmount = payableAmount - Float.parseFloat(amount);
        months= timePeriod;
        showAmountLabel.setText("For Showing the Bank Solvency of" + amount + "\n" + "You need to pay" + Float.toString(payableAmount) + " After the time period of" + timePeriod + "Months");
        amounts=amount;
        
    }

    @FXML
    private void confirmButtonOnMouseClick(ActionEvent event) {
        try {
            FileChooser fc = new FileChooser();
            fc.getExtensionFilters().add(new FileChooser.ExtensionFilter("PDF files", "*.pdf"));
            File f = fc.showSaveDialog(null);

            if (f != null) {
                // Create a new PDF document
                PdfWriter pw = new PdfWriter(new FileOutputStream(f));
                PdfDocument pdf = new PdfDocument(pw);
                com.itextpdf.layout.Document doc = new com.itextpdf.layout.Document(pdf, PageSize.A4);

                // Add content to the PDF document
                

                // Add data to the PDF
                doc.add(new Paragraph("Charges Notification For Bank Solvency").setFontSize(40));
                doc.add(new Paragraph("Dear Valued Client," + "\n"));
                doc.add(new Paragraph("Your Request for Bank Solvency has been accepted, you would "+ "\n"));
                doc.add(new Paragraph("be charged extra"+Float.toString(extraAmount)+ " for "+ months +"months, if you take "+ amounts +"\n"));
                doc.add(new Paragraph(""));
                doc.add(new Paragraph("Total Payable Amount= "+ payableAmount));

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
