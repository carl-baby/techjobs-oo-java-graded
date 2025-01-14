package org.launchcode.techjobs.oo;

import java.util.Objects;

public class PositionType extends JobField{

    private int id;
    private static int nextId = 1;
    private String value;

    public PositionType() {
        id = nextId;
        nextId++;
    }

    public PositionType(String value) {
        this();
        this.value = value;
    }

    // TODO: Add a custom toString() method that returns the data stored in 'value'.
//Completed!
    @Override
    public String toString() {
//needs to return the type of a position type object
        return value;
    }

    // TODO: Add custom equals and hashCode methods. Consider two PositionType objects "equal" when
    //  their id fields match.
//completed both
    @Override
    public boolean equals(Object o) {  // Two objects are equal if they have the same id.
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PositionType positionType = (PositionType) o;
        return id == positionType.id;
    }


    @Override
    public int hashCode() {

        return Objects.hash(id);
    }

    // Getters and Setters:

    public int getId() {

        return id;
    }

    public String getValue() {

        return value;
    }

    public void setValue(String value) {

        this.value = value;
    }

}
