package ro.fastrackit.classroom;

import java.util.Date;


public class Student implements Human {
    private String firstName;
    private String lastName;
    private String emailAddress;
    private Date dateOfBirth;
    private float avgGrade;
    private boolean hasFinishedClass;

    public Student(String firstName, String lastName, String emailAddress, Date dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailAddress = emailAddress;
        this.dateOfBirth = dateOfBirth;
    }

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

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    @Override
    public ScholarType getType() {
        return StudentType.BACHELOR;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public float getAvgGrade() {
        return avgGrade;
    }

    public void setAvgGrade(float avgGrade) {
        this.avgGrade = avgGrade;
    }

    public boolean isHasFinishedClass() {
        return hasFinishedClass;
    }

    public void setHasFinishedClass(boolean hasFinishedClass) {
        this.hasFinishedClass = hasFinishedClass;
    }
}

