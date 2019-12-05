package org.launchcode.techjobs_oo;
import java.util.Objects;
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

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.
public String inputCheck(String input){
        String noData ="Data not available";
        if (input.equals("")) {
            return noData;
        }
        else {
            return  input;
        }
}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Job)) return false;
        Job that = (Job) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        String newline = "\n";
        int id = this.getId();
        String name = inputCheck(this.getName());
        String employer =  inputCheck(this.getEmployer().getValue());
        String location = inputCheck(this.getLocation().getValue());
        String position =  inputCheck(this.getPositionType().getValue());
        String coreCompetency=  inputCheck(this.getCoreCompetency().getValue());

            return newline +
                    "ID: " + id  + "\n" +
                    "Name: " + name + "\n" +
                    "Employer: " + employer +"\n" +
                    "Location: " + location +"\n" +
                    "Position Type: " + position +"\n" +
                    "Core Competency: " + coreCompetency + "\n" +
                    newline;
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
