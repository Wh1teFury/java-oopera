package ru.practicum.theater.person;

import java.util.Objects;

public class Person {
    protected String name;
    protected String surname;
    protected Gender gender;

    public Person(String name, String surname, Gender gender) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Gender getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "Person{"
                + "name='" + name + "', "
                + "surname='" + surname + "', "
                + "gender='" + gender
                + "'}";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Actor actor = (Actor) obj;
        return Objects.equals(getName(), actor.getName()) &&
                Objects.equals(getSurname(), actor.getSurname()) &&
                Objects.equals(getGender(), actor.getGender());
    }

    @Override
    public int hashCode() {
        int hash = 17;
        if (name != null) hash += name.hashCode();
        hash *= 31;
        if (surname != null) hash += surname.hashCode();
        hash *= 31;
        if (gender != null) hash += gender.hashCode();
        return hash;
    }
}
