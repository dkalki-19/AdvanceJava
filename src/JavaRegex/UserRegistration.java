package JavaRegex;

public class UserRegistration {
	// UC1: First Name
    public boolean validateFirstName(String firstName) {
        String regex = "^[A-Z][a-zA-Z]{2,}$";
        return firstName.matches(regex);
    }
    
 // UC2: Last Name
    public boolean validateLastName(String lastName) {
        String regex = "^[A-Z][a-zA-Z]{2,}$";
        return lastName.matches(regex);
    }
    
 // UC3: Email
    public boolean validateEmail(String email) {
        String regex = "^[a-zA-Z0-9]+([._+-][a-zA-Z0-9]+)*@[a-zA-Z0-9]+\\.[a-z]{2,}(\\.[a-z]{2})?$";
        return email.matches(regex);
    }
    
 // UC4: Mobile Number
    public boolean validateMobile(String mobile) {
        String regex = "^[0-9]{2} [0-9]{10}$";
        return mobile.matches(regex);
    }
    
 // UC5: Password Rule 1 – Min 8 chars
    public boolean validatePasswordRule1(String password) {
        String regex = "^.{8,}$";
        return password.matches(regex);
    }
    
 // UC6: Password Rule 2 – At least 1 Uppercase
    public boolean validatePasswordRule2(String password) {
        String regex = "^(?=.*[A-Z]).{8,}$";
        return password.matches(regex);
    }
}

