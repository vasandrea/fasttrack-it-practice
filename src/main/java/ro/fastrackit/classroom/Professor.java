package ro.fastrackit.classroom;

import java.util.Date;


public class Professor implements Human {
    private String firstName;
    private String lastName;
    private String emailAddress;
    private Date dateOfBirth;
    private Date dateOfHiring;

    public boolean isPhd() {
        return false;
    }

    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    @Override
    public String getEmailAddress() {
        return emailAddress;
    }

    @Override
    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    @Override
    public ScholarType getType() {
        return ProfessorType.PROFESSOR;
    }
}
