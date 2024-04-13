
package Komol;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;


public class ClientFeedback implements Serializable{
     
     private static ArrayList<Clientreview> reviewList = new ArrayList<>();
     private static ArrayList<String> ratingList = new ArrayList<>();
    public static ArrayList<Clientreview> reviewFileRead() {
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        
        try {
            fis = new FileInputStream("ClientReview.bin");
            ois = new ObjectInputStream(fis);

            while (true) {
                try {
                    Clientreview userInfo = (Clientreview) ois.readObject();
                    ratingList.add(userInfo.getRating());
                    reviewList.add(userInfo);
                } catch (EOFException ef) {
                    break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (ois != null) ois.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        
        return reviewList;
    }
   public static ArrayList<String> rating() {
     
        return ratingList;
    }
}
