package ru.practicum.theater.person;

import java.util.Objects;

public final class Actor extends Person {
    private final Integer height;

    public Actor(String name, String surname, Gender gender, Integer height) {
        super(name, surname, gender);
        this.height = height;
    }

    @Override
    public String toString() {
        return "ru.practicum.theater.person.Actor{"
                + "name='" + getName() + "', "
                + "surname='" + getSurname() + "', "
                + "gender='" + getGender() + "', "
                + "height=" + height
                + "}";
    }
    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Actor actor = (Actor) obj;
        return Objects.equals(getName(), actor.getName()) &&
                Objects.equals(getSurname(), actor.getSurname()) &&
                Objects.equals(getGender(), actor.getGender()) &&
                Objects.equals(height, actor.height);
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
        if (height != null) hash += height.hashCode();
        hash *= 31;
        return hash;
    }
}
