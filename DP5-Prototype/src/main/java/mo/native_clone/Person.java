package mo.native_clone;

import java.time.LocalDate;

/**
 * The class must implement {@link Cloneable} marker interface, to indicate that the class is actually cloneable.
 * <br><br>
 * @author Moussa OUSTOUH
 * */
public class Person implements Cloneable {
    private String firstname;
    private String lastname;
    private LocalDate birthDate;

    public Person() {
    }

    public Person(String firstname, String lastname, LocalDate birthDate) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.birthDate = birthDate;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", birthDate=" + birthDate +
                '}';
    }

    /**
     * The class whose object’s copy is to be made must have
     * a public clone method in it or in one of its parent class.
     * <br>
     * The {@link Object#clone()} implementation could throw
     * {@link CloneNotSupportedException} when it is called on that class’s object
     * */
    @Override
    public Object clone() throws CloneNotSupportedException {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            return new Person(this.firstname, this.lastname, this.birthDate);
        }
    }
}
