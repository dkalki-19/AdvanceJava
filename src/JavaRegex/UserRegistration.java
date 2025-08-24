package JavaRegex;

public class UserRegistration {
	// UC1: First Name
    public boolean validateFirstName(String firstName) {
        String regex = "^[A-Z][a-zA-Z]{2,}$";
        return firstName.matches(regex);
    }
}
