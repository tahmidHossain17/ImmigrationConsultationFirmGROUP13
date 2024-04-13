package mainPKG;

/**
 *
 * @author Lenovo
 */
import java.io.Serializable;
import java.time.LocalDate;


public class User implements Serializable{
    protected String fullName;
    protected String userName;
    protected String phoneNumber;
    protected String password;
    protected LocalDate Dob;

    public User(String fullName, String userName, String phoneNumber, String password, LocalDate Dob) {
        this.fullName = fullName;
        this.userName = userName;
        this.phoneNumber = phoneNumber;
        this.password = password;
        this.Dob = Dob;
    }

    public String getFullName() {
        return fullName;
    }

    public String getUserName() {
        return userName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getPassword() {
        return password;
    }

    public LocalDate getDob() {
        return Dob;
    }
    
    
}
