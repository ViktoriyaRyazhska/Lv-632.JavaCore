package Task1;

public class FullName {

     private String firstName;
     private String lastName;

    public FullName(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return (String)firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return (String)lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
