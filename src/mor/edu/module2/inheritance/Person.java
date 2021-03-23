package mor.edu.module2.inheritance;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Objects;

/**
 * @author Antonina Moroz
 * @version 1.0.0
 * @project vsem
 * @class Person
 * @since 21.03.2021 - 20.37
 **/
public class Person {

    // class fields

    private String firstName;
    private String lastName;
    private String patronynicName;
    private String address;
    private String passportID;
    private String identificationСode;
    private LocalDate dateOfBirth;
    private double height;
    private double wight;
    private String profession;
    private String maritalStatus;
    private boolean ishavingСhildren;
    private String phoneNumber;
    private String email;
    private String hobby;

    // constructors

    public Person() {
    }

    public Person(String firstName, String lastName, String patronynicName,
                  String address, String passportID, String identificationСode,
                  LocalDate dateOfBirth, double height, double wight, String profession,
                  String maritalStatus, boolean ishavingСhildren, String phoneNumber, String email, String hobby) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.patronynicName = patronynicName;
        this.address = address;
        this.passportID = passportID;
        this.identificationСode = identificationСode;
        this.dateOfBirth = dateOfBirth;
        this.height = height;
        this.wight = wight;
        this.profession = profession;
        this.maritalStatus = maritalStatus;
        this.ishavingСhildren = ishavingСhildren;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.hobby = hobby;
    }
    // getter and setter

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPatronynicName() {
        return patronynicName;
    }

    public void setPatronynicName(String patronynicName) {
        this.patronynicName = patronynicName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPassportID() {
        return passportID;
    }

    public void setPassportID(String passportID) {
        this.passportID = passportID;
    }

    public String getIdentificationСode() {
        return identificationСode;
    }

    public void setIdentificationСode(String identificationСode) {
        this.identificationСode = identificationСode;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWight() {
        return wight;
    }

    public void setWight(double wight) {
        this.wight = wight;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public boolean isIshavingСhildren() {
        return ishavingСhildren;
    }

    public void setIshavingСhildren(boolean ishavingСhildren) {
        this.ishavingСhildren = ishavingСhildren;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }


    // Override toString () method

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", patronynicName='" + patronynicName + '\'' +
                ", address='" + address + '\'' +
                ", passportID='" + passportID + '\'' +
                ", identificationСode='" + identificationСode + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", height=" + height +
                ", wight=" + wight +
                ", profession='" + profession + '\'' +
                ", maritalStatus='" + maritalStatus + '\'' +
                ", ishavingСhildren=" + ishavingСhildren +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                ", hobby='" + hobby + '\'' +
                ", age='" + this.getAge() +
                '}';
    }

    //Override hash() and equals() methods

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Double.compare(person.getHeight(), getHeight()) == 0 && Double.compare(person.getWight(), getWight()) == 0 && isIshavingСhildren() == person.isIshavingСhildren() && Objects.equals(getFirstName(), person.getFirstName()) && Objects.equals(getLastName(), person.getLastName()) && Objects.equals(getPatronynicName(), person.getPatronynicName()) && Objects.equals(getAddress(), person.getAddress()) && Objects.equals(getPassportID(), person.getPassportID()) && Objects.equals(getIdentificationСode(), person.getIdentificationСode()) && Objects.equals(getDateOfBirth(), person.getDateOfBirth()) && Objects.equals(getProfession(), person.getProfession()) && Objects.equals(getMaritalStatus(), person.getMaritalStatus()) && Objects.equals(getPhoneNumber(), person.getPhoneNumber()) && Objects.equals(getEmail(), person.getEmail()) && Objects.equals(getHobby(), person.getHobby());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFirstName(), getLastName(), getPatronynicName(), getAddress(), getPassportID(), getIdentificationСode(), getDateOfBirth(), getHeight(), getWight(), getProfession(), getMaritalStatus(), isIshavingСhildren(), getPhoneNumber(), getEmail(), getHobby());
    }


    //full years method

    public int getAge() {

        int years = (int) ChronoUnit.YEARS.between(this.getDateOfBirth(), LocalDate.now());
        return years;
    }

    //adult method

    public boolean isAdult() {
        boolean result = true;
        if (this.getAge() >= 18) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }
}

