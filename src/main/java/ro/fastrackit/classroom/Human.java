package ro.fastrackit.classroom;

import java.util.Date;

public interface Human {

    public String getFirstName();

    public String getLastName();

    public String getEmailAddress();

    public Date getDateOfBirth();

    public ScholarType getType();
}
