package ru.practicum.theater.show;

import ru.practicum.theater.person.Actor;
import ru.practicum.theater.person.Director;
import ru.practicum.theater.person.Person;

import java.util.ArrayList;
import java.util.Objects;

public class Ballet extends MusicalShow {
    private Person choreograph;

    public Ballet(String title,
                  Integer duration,
                  Director director,
                  ArrayList<Actor> listOfActors,
                  Person musicAuthor,
                  String librettoText,
                  Person choreograph) {
        super(title, duration, director, listOfActors, musicAuthor, librettoText);
        this.choreograph = choreograph;
    }

    @Override
    public String toString() {
        String result = "Ballet{"
                + "title='" + getTitle() + "', "
                + "duration='" + getDuration() + "', "
                + "director='" + getDirector() + "', "
                + "listOfActors='" + getListOfActors().toString() + "', "
                + "musicAuthor='" + getMusicAuthor() + "', "
                + "librettoText.length=";
        if (getLibrettoText() != null) {
            result += getLibrettoText().length();
        } else {
            result += "null";
        }
        result += ", choreograph='" + choreograph;
        return result + "'}";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Ballet show = (Ballet) obj;
        return Objects.equals(getTitle(), show.getTitle()) &&
                Objects.equals(getDuration(), show.getDuration()) &&
                Objects.equals(getDirector(), show.getDirector()) &&
                Objects.equals(getListOfActors(), show.getListOfActors()) &&
                Objects.equals(getMusicAuthor(), show.getMusicAuthor()) &&
                Objects.equals(getLibrettoText(), show.getLibrettoText()) &&
                Objects.equals(choreograph, show.choreograph);
    }

    @Override
    public int hashCode() {
        int hash = 17;
        if (getTitle() != null) hash += getTitle().hashCode();
        hash *= 31;
        if (getDuration() != null) hash += getDuration().hashCode();
        hash *= 31;
        if (getDirector() != null) hash += getDirector().hashCode();
        hash *= 31;
        if (getListOfActors() != null) hash += getListOfActors().hashCode();
        hash += 31;
        if (getMusicAuthor() != null) hash += getMusicAuthor().hashCode();
        hash *= 31;
        if (!getLibrettoText().isEmpty()) hash += getLibrettoText().hashCode();
        hash *= 31;
        if (choreograph != null) hash += choreograph.hashCode();
        hash *= 31;
        return hash;
    }
}
