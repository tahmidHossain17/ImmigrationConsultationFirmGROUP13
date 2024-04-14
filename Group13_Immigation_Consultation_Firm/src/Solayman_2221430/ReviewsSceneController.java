/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Solayman_2221430;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 * FXML Controller class
 *
 * @author diyan
 */
public class ReviewsSceneController implements Initializable {

    @FXML
    private TextField addReviewTextField;
    @FXML
    private TableView<ReviewTableView> reviewTableView;
    @FXML
    private TableColumn<ReviewTableView, String> clientNameColumn;
    @FXML
    private TableColumn<ReviewTableView, String> reviewColumn;
    @FXML
    private ComboBox<Integer> rateUsComboBox;
    @FXML
    private Label ratingNotificationShowLabel;
    @FXML
    private TextField nameTextField;
    @FXML
    private TextField emailTextField;

    /**
     * Initializes the controller class.
     */
    ArrayList<Review> reviewList;

//    ArrayList<ReviewTableView> tableReviewList;
    @FXML
    private Label showAddedNotificationLabel;

    @Override
    public void initialize(URL url, ResourceBundle rb) {

        reviewList = new ArrayList();
//        tableReviewList = new ArrayList();

        clientNameColumn.setCellValueFactory(new PropertyValueFactory<ReviewTableView, String>("name"));
        reviewColumn.setCellValueFactory(new PropertyValueFactory<ReviewTableView, String>("review"));
        rateUsComboBox.getItems().addAll(1, 2, 3, 4, 5);

//        ObjectInputStream ois = null;
//
//        try {
//            Review r;
//
//            ois = new ObjectInputStream(new FileInputStream("Reviews.bin"));
//
//            reviewTableView.getItems().clear();
//            while (true) {
//                r = (Review) ois.readObject();
////                contactsTableView.getItems().add(c);
//                tableReviewList.add(new ReviewTableView(r.getName(), r.getReview()));
//
//            }
//            //ois.close();
//
//        } catch (RuntimeException e) {
//            e.printStackTrace();
//            //
//        } catch (Exception ex) {
//            try {
//                if (ois != null) {
//                    ois.close();
//                }
//            } catch (IOException ex1) {
//            }
//        }
//
//        for (ReviewTableView t : tableReviewList) {
//            reviewTableView.getItems().add(t);
//        }
//
    }

    @FXML
    private void addReviewButtonOnMouseClick(ActionEvent event) {

        reviewList.add(new Review(rateUsComboBox.getValue(), addReviewTextField.getText(), nameTextField.getText(), emailTextField.getText()));

        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        File f = null;
        try {
            f = new File("Reviews.bin");
            if (f.exists()) {
                fos = new FileOutputStream(f, true);
                oos = new AppendableObjectOutputStream(fos);
            } else {
                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream(fos);
            }
            for (Review r : reviewList) {

                oos.writeObject(r);

            }

        } catch (IOException ex) {
            Logger.getLogger(AddContactsSceneController.class
                    .getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (oos != null) {
                    oos.close();

                }
            } catch (IOException ex) {
                Logger.getLogger(AddContactsSceneController.class
                        .getName()).log(Level.SEVERE, null, ex);
            }
        }

        addReviewTextField.setText(null);
        nameTextField.setText(null);
        emailTextField.setText(null);

    }

    @FXML
    private void loadNewReviewButtonOnMouseClick(ActionEvent event) {
        
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

        // Add items to the TableView after reading all reviews
//        reviewTableView.getItems().addAll(tableReviewList);
    }

}


