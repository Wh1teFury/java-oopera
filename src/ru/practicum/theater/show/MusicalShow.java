package ru.practicum.theater.show;

import ru.practicum.theater.person.Director;
import ru.practicum.theater.person.Person;
import ru.practicum.theater.person.Actor;

import java.util.ArrayList;
import java.util.Objects;

public class MusicalShow extends Show {
    protected Person musicAuthor;
    protected String librettoText;

    public MusicalShow(String title,
                       Integer duration,
                       Director director,
                       ArrayList<Actor> listOfActors,
                       Person musicAuthor,
                       String librettoText) {
        super(title, duration, director, listOfActors);
        this.musicAuthor = musicAuthor;
        this.librettoText = librettoText;
    }

    protected Person getMusicAuthor() {
        return musicAuthor;
    }

    protected String getLibrettoText() {
        return librettoText;
    }

    public void printLibretto() {
        System.out.println(librettoText);
    }

    public String toString() {
        String result = "MusicalShow{"
                + "title='" + getTitle() + "', "
                + "duration='" + getDuration() + "', "
                + "director='" + getDirector() + "', "
                + "listOfActors='" + getListOfActors().toString() + "', "
                + "musicAuthor='" + musicAuthor
                + "librettoText.length=";
                if (librettoText != null) {
                    result += librettoText.length();
                } else {
                    result += "null";
                }
        return result + "}";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        MusicalShow show = (MusicalShow) obj;
        return Objects.equals(getTitle(), show.getTitle()) &&
                Objects.equals(getDuration(), show.getDuration()) &&
                Objects.equals(getDirector(), show.getDirector()) &&
                Objects.equals(getListOfActors(), show.getListOfActors()) &&
                Objects.equals(musicAuthor, show.musicAuthor) &&
                Objects.equals(librettoText, show.librettoText);
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
        if (musicAuthor != null) hash += musicAuthor.hashCode();
        hash *= 31;
        if (!librettoText.isEmpty()) hash += librettoText.hashCode();
        hash *= 31;
        return hash;
    }
}
