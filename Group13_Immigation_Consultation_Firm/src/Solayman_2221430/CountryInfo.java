/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Solayman_2221430;

/**
 *
 * @author diyan
 */
public class CountryInfo {
    String languageHelp,extraSkills,spouseVisaPossibility;

    public CountryInfo() {
    }

    public CountryInfo(String languageHelp, String extraSkills, String spouseVisaPossibility) {
        
        this.languageHelp = languageHelp;
        this.extraSkills = extraSkills;
        this.spouseVisaPossibility = spouseVisaPossibility;
    }

    

    

    public String getLanguageHelp() {
        return languageHelp;
    }

    public void setLanguageHelp(String languageHelp) {
        this.languageHelp = languageHelp;
    }

    public String getExtraSkills() {
        return extraSkills;
    }

    public void setExtraSkills(String extraSkills) {
        this.extraSkills = extraSkills;
    }

    public String getSpouseVisaPossibility() {
        return spouseVisaPossibility;
    }

    public void setSpouseVisaPossibility(String spouseVisaPossibility) {
        this.spouseVisaPossibility = spouseVisaPossibility;
    }

    @Override
    public String toString() {
        return "CountryInfo{" + "languageHelp=" + languageHelp + ", extraSkills=" + extraSkills + ", spouseVisaPossibility=" + spouseVisaPossibility + '}';
    }

    
    
    
}
