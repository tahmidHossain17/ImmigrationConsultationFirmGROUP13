/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package prosanto2010271;

import Solayman_2221430.Review;
import Solayman_2221430.ReviewTableView;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
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
public class FeedbackAndSuggestion_1Controller implements Initializable {

    @FXML
    private TableView<ReviewTableView> reviewTableView;
    @FXML
    private TableColumn<ReviewTableView,String > clientNameTableColumn;
    @FXML
    private TableColumn<ReviewTableView, String> reviewTableColumn;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        clientNameTableColumn.setCellValueFactory(new PropertyValueFactory<ReviewTableView, String>("name"));
        reviewTableColumn.setCellValueFactory(new PropertyValueFactory<ReviewTableView, String>("review"));
    }    

    @FXML
    private void loadButtonOnMouseClick(ActionEvent event) {
         reviewTableView.getItems().clear();

        ObjectInputStream ois = null;
        try {
            Review r;
            ois = new ObjectInputStream(new FileInputStream("Reviews.bin"));

            // Clear existing items in the TableView
            reviewTableView.getItems().clear();

            while (true) {
                r = (Review) ois.readObject();
                reviewTableView.getItems().add(new ReviewTableView(r.getName(), r.getReview()));
            }
        } catch (EOFException e) {
            // Reached end of file
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            if (ois != null) {
                try {
                    ois.close();
                } catch (IOException ex1) {
                    ex1.printStackTrace();
                }
            }
        }

    }
    
}
