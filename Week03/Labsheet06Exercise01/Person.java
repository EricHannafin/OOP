package Week03.Labsheet06Exercise01;

//Person.java
/*This class is a very simple representation of a Person, only implementing their name. It is based
* on a given UML class diagram specification*/

public class Person {
    private String firstName; 
    private String lastName;  

    public Person() {
        this("Not Supplied","Not Supplied");
    }

    public Person(String firstName, String lastName) {
        setName(firstName, lastName);
    }


    public void setName(String firstName, String lastName) {
        setFirstName(firstName);
        setLastName(lastName);
    }


    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }


    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    public String getFirstName() {
        return firstName;
    }


    public String getLastName() {
        return lastName;
    }
    
    public String toString() {
        return "First name: " + getFirstName() + "   " + "Last name: " + getLastName();
    }
}
