package in.zenify.zenifyclient.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.Date;

/**
 * Created by tanay on 17/07/15.
 */
public class Person {

    protected String firstName;
    protected String middleName;
    protected String lastName;
    protected String primaryEmail;
    protected String secondaryEmail;
    protected String primaryPhone;
    protected String secondaryPhone;
    protected String sex;
    protected Date dob;
    protected String address;



    public static Person getMinimalInstance(String name, String primaryEmail, String primaryPhone) {
        Person p = new Person();
        p.firstName = name;
        p.primaryEmail = primaryEmail;
        p.primaryPhone = primaryPhone;

        return p;
    }

    public Person(String firstName, String primaryEmail, String secondaryEmail, String primaryPhone, String secondaryPhone, String sex) {
        this.firstName = firstName;
        this.primaryEmail = primaryEmail;
        this.secondaryEmail = secondaryEmail;
        this.primaryPhone = primaryPhone;
        this.secondaryPhone = secondaryPhone;
        this.sex = sex;
    }

    public Person(String firstName, String primaryEmail, String secondaryEmail, String address, String primaryPhone, String secondaryPhone, String sex, Date dob) {
        this.firstName = firstName;
        this.primaryEmail = primaryEmail;
        this.secondaryEmail = secondaryEmail;
        this.primaryPhone = primaryPhone;
        this.secondaryPhone = secondaryPhone;
        this.sex = sex;
        this.dob = dob;
        this.address = address;
    }

    public Person(String firstName, String middleName, String lastName, String primaryEmail, String secondaryEmail, String primaryPhone, String secondaryPhone, String sex, Date dob, String address) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.primaryEmail = primaryEmail;
        this.secondaryEmail = secondaryEmail;
        this.primaryPhone = primaryPhone;
        this.secondaryPhone = secondaryPhone;
        this.sex = sex;
        this.dob = dob;
        this.address = address;
    }

    public Person() {
    }

    public Person(Person other) {
        this.firstName = other.firstName;
        this.middleName = other.middleName;
        this.lastName = other.lastName;
        this.primaryEmail = other.primaryEmail;
        this.secondaryEmail = other.secondaryEmail;
        this.primaryPhone = other.primaryPhone;
        this.secondaryPhone = other.secondaryPhone;
        this.sex = other.sex;
        this.dob = other.dob;
        this.address = other.address;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getPrimaryEmail() {
        return primaryEmail;
    }

    public void setPrimaryEmail(String primaryEmail) {
        this.primaryEmail = primaryEmail;
    }

    public String getSecondaryEmail() {
        return secondaryEmail;
    }

    public void setSecondaryEmail(String secondaryEmail) {
        this.secondaryEmail = secondaryEmail;
    }

    public String getPrimaryPhone() {
        return primaryPhone;
    }

    public void setPrimaryPhone(String primaryPhone) {
        this.primaryPhone = primaryPhone;
    }

    public String getSecondaryPhone() {
        return secondaryPhone;
    }

    public void setSecondaryPhone(String secondaryPhone) {
        this.secondaryPhone = secondaryPhone;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @JsonIgnore
    public String getName() {
        if (firstName == null) {
            return null;
        }
        String name = firstName;

        if (middleName != null && middleName.length() > 0) {
            name += " " + middleName;
        }

        if (lastName != null && lastName.length() > 0) {
            name += " " + lastName;
        }

        return name;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public boolean hasEmail() {
        return (this.getPrimaryEmail() != null && !this.getPrimaryEmail().isEmpty()) ||
                (this.getSecondaryEmail() != null && !this.getSecondaryEmail().isEmpty());
    }

    @JsonIgnore
    public String getEmail() {
        if(this.primaryEmail != null && !this.getPrimaryEmail().isEmpty()) {
            return primaryEmail;
        }
        else if(this.secondaryEmail != null) {
            return secondaryEmail;
        }
        else return null;
    }

    @JsonIgnore
    public String getPhone() {
        if(this.primaryPhone != null && !this.primaryPhone.isEmpty()) {
            return primaryPhone;
        }
        else if(this.secondaryPhone != null) {
            return secondaryPhone;
        }
        else return null;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", primaryEmail='" + primaryEmail + '\'' +
                ", secondaryEmail='" + secondaryEmail + '\'' +
                ", primaryPhone='" + primaryPhone + '\'' +
                ", secondaryPhone='" + secondaryPhone + '\'' +
                ", sex='" + sex + '\'' +
                ", dob=" + dob +
                ", address='" + address + '\'' +
                '}';
    }
}
