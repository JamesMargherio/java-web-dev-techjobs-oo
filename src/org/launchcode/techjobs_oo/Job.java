package org.launchcode.techjobs_oo;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.

    public Job() {
        id = nextId;
        nextId++;
    }

    public Job (String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }

    @Override
    public String toString() {
        String jobString = "" + "\nID: " + id;
        if (name == null && employer == null && location == null && positionType == null && coreCompetency == null) {
            return "OOPS! This job does not seem to exist!";
        }
        if (name == null) {
            jobString = jobString.concat("\nName: Data not available");
        } else
            jobString = jobString.concat("\nName: " + name);
        if (employer == null) {
            jobString = jobString.concat("\nEmployer: Data not available");
        } else
            jobString = jobString.concat("\nEmployer: " + employer);
        if (location == null) {
            jobString = jobString.concat("\nLocation: Data not available");
        } else
            jobString = jobString.concat("\nLocation: " + location);
        if (positionType == null) {
            jobString = jobString.concat("\nPosition Type: Data not available");
        } else
            jobString = jobString.concat("\nPosition Type: " + positionType);
        if (coreCompetency == null) {
            jobString = jobString.concat("\nCore Competency: Data not available");
        } else
            jobString = jobString.concat("\nCore Competency: " + coreCompetency);
        return jobString;
    }

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Job job = (Job) o;

        return id == job.id;
    }

    @Override
    public int hashCode() {
        return id;
    }

    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

}
