package com.vitorlima.party.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by vlima on 31/03/2017.
 */

@Entity
public class Guest implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private Integer numberOfGuests;
    private Long average;

    public Long getAverage() {
        return average;
    }

    public void setAverage(Long average) {
        this.average = average;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumberOfGuests(Integer numberOfGuests) {
        this.numberOfGuests = numberOfGuests;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getNumberOfGuests() {
        return numberOfGuests;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Guest guest = (Guest) o;

        if (id != null ? !id.equals(guest.id) : guest.id != null) return false;
        if (name != null ? !name.equals(guest.name) : guest.name != null) return false;
        if (numberOfGuests != null ? !numberOfGuests.equals(guest.numberOfGuests) : guest.numberOfGuests != null)
            return false;
        return average != null ? average.equals(guest.average) : guest.average == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (numberOfGuests != null ? numberOfGuests.hashCode() : 0);
        result = 31 * result + (average != null ? average.hashCode() : 0);
        return result;
    }
}
