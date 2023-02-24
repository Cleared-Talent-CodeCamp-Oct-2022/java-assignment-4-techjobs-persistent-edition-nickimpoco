package org.launchcode.techjobs.persistent.models;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.validation.constraints.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Employer extends AbstractEntity {


    @OneToMany(mappedBy = "employer")
    private final List<Job> jobs = new ArrayList<>();

    @NotNull
    @NotEmpty(message = "Location cannot be empty")
    @Size(min = 1, max = 100, message = "Location must be between 1 and 100 characters")
    private String location;

    // no args constructor
    public Employer() {}

    // public accessor methods
    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }
}
