package de.htwberlin.webtech.web.api;

public class Person {

    private long id;
    private String firstName;
    private String lastName;
    private boolean vaccinated;

    public Person(long id, String firstName, String lastName, boolean vaccinated) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.vaccinated = vaccinated;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setVaccinated(boolean vaccinated) {
        this.vaccinated = vaccinated;
    }

    public long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public boolean isVaccinated() {
        return vaccinated;
    }
}
