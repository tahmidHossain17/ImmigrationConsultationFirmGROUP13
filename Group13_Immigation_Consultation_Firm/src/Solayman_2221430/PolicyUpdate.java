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
public class PolicyUpdate implements Serializable {
    
    String country, spouse,affiliatedUni,affiliatedOrg,touristPlaces,ielts,sat,gre,languageIssue,skills,minEducation;

    public PolicyUpdate(String country, String spouse, String affiliatedUni, String affiliatedOrg, String touristPlaces, String ielts, String sat, String gre, String languageIssue, String skills, String minEducation) {
        this.country = country;
        this.spouse = spouse;
        this.affiliatedUni = affiliatedUni;
        this.affiliatedOrg = affiliatedOrg;
        this.touristPlaces = touristPlaces;
        this.ielts = ielts;
        this.sat = sat;
        this.gre = gre;
        this.languageIssue = languageIssue;
        this.skills = skills;
        this.minEducation = minEducation;
    }

    public PolicyUpdate() {
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getSpouse() {
        return spouse;
    }

    public void setSpouse(String spouse) {
        this.spouse = spouse;
    }

    public String getAffiliatedUni() {
        return affiliatedUni;
    }

    public void setAffiliatedUni(String affiliatedUni) {
        this.affiliatedUni = affiliatedUni;
    }

    public String getAffiliatedOrg() {
        return affiliatedOrg;
    }

    public void setAffiliatedOrg(String affiliatedOrg) {
        this.affiliatedOrg = affiliatedOrg;
    }

    public String getTouristPlaces() {
        return touristPlaces;
    }

    public void setTouristPlaces(String touristPlaces) {
        this.touristPlaces = touristPlaces;
    }

    public String getIelts() {
        return ielts;
    }

    public void setIelts(String ielts) {
        this.ielts = ielts;
    }

    public String getSat() {
        return sat;
    }

    public void setSat(String sat) {
        this.sat = sat;
    }

    public String getGre() {
        return gre;
    }

    public void setGre(String gre) {
        this.gre = gre;
    }

    public String getLanguageIssue() {
        return languageIssue;
    }

    public void setLanguageIssue(String languageIssue) {
        this.languageIssue = languageIssue;
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }

    public String getMinEducation() {
        return minEducation;
    }

    public void setMinEducation(String minEducation) {
        this.minEducation = minEducation;
    }

    @Override
    public String toString() {
        return "PolicyUpdate{" + "country=" + country + ", spouse=" + spouse + ", affiliatedUni=" + affiliatedUni + ", affiliatedOrg=" + affiliatedOrg + ", touristPlaces=" + touristPlaces + ", ielts=" + ielts + ", sat=" + sat + ", gre=" + gre + ", languageIssue=" + languageIssue + ", skills=" + skills + ", minEducation=" + minEducation + '}';
    }
    
    
    
}
