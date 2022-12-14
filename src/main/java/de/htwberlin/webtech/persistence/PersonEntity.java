package de.htwberlin.webtech.persistence;

import javax.persistence.*;

@Entity(name = "persons")
public class PersonEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "last_name", nullable = false)
    private String lastName;

    @Column(name = "is_vaccinated")
    private Boolean vaccinated;

    public PersonEntity(String firstName, String lastName, boolean vaccinated) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.vaccinated = vaccinated;
    }

    protected PersonEntity() {}

    public Long getId() {return id;}

    public void setFirstName(String firstName) {this.firstName = firstName;}

    public String getFirstName() {return firstName;}

    public void setLastName(String lastName) {this.lastName = lastName;}

    public String getLastName() {return lastName;}

    public void setVaccinated(Boolean vaccinated) {this.vaccinated = vaccinated;}

    public Boolean getVaccinated() {return vaccinated;}

}
