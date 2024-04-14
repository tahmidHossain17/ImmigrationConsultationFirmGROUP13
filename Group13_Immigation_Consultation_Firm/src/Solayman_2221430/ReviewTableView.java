/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Solayman_2221430;

/**
 *
 * @author diyan
 */
public class ReviewTableView {
    String name,review;

    public ReviewTableView(String name, String review) {
        this.name = name;
        this.review = review;
    }

    public ReviewTableView() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }

    @Override
    public String toString() {
        return "ReviewTableView{" + "name=" + name + ", review=" + review + '}';
    }
    
    
}
