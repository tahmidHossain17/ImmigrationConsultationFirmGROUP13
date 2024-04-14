/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Solayman_2221430;

import java.io.Serializable;

/**
 *
 * @author diyan
 */
public class Review implements Serializable {
    int rating;
    String review,name,email;

    public Review(int rating, String review, String name, String email) {
        this.rating = rating;
        this.review = review;
        this.name = name;
        this.email = email;
    }

    public Review() {
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Review{" + "rating=" + rating + ", review=" + review + ", name=" + name + ", email=" + email + '}';
    }
    
}
