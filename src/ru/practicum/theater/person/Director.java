package ru.practicum.theater.person;

import java.util.Objects;

public final class Director extends Person {
    private final Integer numberOfShows;

    public Director(String name, String surname, Gender gender, Integer numberOfShows) {
        super(name, surname, gender);
        this.numberOfShows = numberOfShows;
    }

    @Override
    public String toString() {
        return "ru.practicum.theater.person.Actor{"
                + "name='" + getName() + "', "
                + "surname='" + getSurname() + "', "
                + "gender='" + getGender() + "', "
                + "numberOfShows=" + numberOfShows
                + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Director director = (Director) o;
        return Objects.equals(getName(), director.getName()) &&
                Objects.equals(getSurname(), director.getSurname()) &&
                Objects.equals(getGender(), director.getGender()) &&
                Objects.equals(numberOfShows, director.numberOfShows);
    }

    @Override
    public int hashCode() {
        int hash = 17;
        if (getName() != null) hash += getName().hashCode();
        hash *= 31;
        if (getSurname() != null) hash += getSurname().hashCode();
        hash *= 31;
        if (getGender() != null) hash += getGender().hashCode();
        hash *= 31;
        if (numberOfShows != null) hash += numberOfShows.hashCode();
        return hash;
    }
}
