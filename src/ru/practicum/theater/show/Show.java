package ru.practicum.theater.show;

import ru.practicum.theater.person.Director;
import ru.practicum.theater.person.Actor;
import java.util.ArrayList;
import java.util.Objects;

public class Show {
    private final String title;
    private final Integer duration;
    private final Director director;
    private final ArrayList<Actor> listOfActors;

    public Show(String title, Integer duration, Director director, ArrayList<Actor> listOfActors) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActors = listOfActors;
    }

    protected String getTitle() {
        return title;
    }
    protected Integer getDuration() {
        return duration;
    }
    protected Director getDirector() {
        return director;
    }
    protected ArrayList<Actor> getListOfActors() {
        return listOfActors;
    }

    public void addActor(Actor actor) {
        if (!listOfActors.contains(actor)) {
            listOfActors.add(actor);
            System.out.println(actor.getName() + " " + actor.getSurname()
                    + " добавлен(а) в актерский состав, " + "\"" + title + "\"");
        } else {
            System.out.println(actor.getName() + " " + actor.getSurname()
                    + " уже добавлен(а) в актерский состав, " + "\"" + title + "\"");
        }
    }

    public void printActors() {
        if (listOfActors.isEmpty()) {
            System.out.println("В данном шоу нет актеров!");
        } else {
            System.out.println("\"" + title + "\"" + ", список актеров:");
            for (Actor actor : listOfActors) {
                System.out.println(" ".repeat(title.length() + 4) + actor.toString());
            }
        }
    }

    public void printDirector() {
        System.out.println("Режиссёр спектакля, " + "\"" + title + "\":");
        System.out.println(" ".repeat(title.length() + 4) + director.toString());
    }

    public void replaceActor(Actor standIn, String surname) {
        boolean isFound = false;
        for(Actor actor : listOfActors) {
            if (actor.getSurname().equals(surname)) {
                isFound = true;
                System.out.print("\"" + title + "\"    " + actor.getSurname() + " заменен(а) на ");
                System.out.println(standIn.getName() + " " + standIn.getSurname() + "!");
                listOfActors.remove(actor);
                listOfActors.add(standIn);
                break;
            }

        }
        if (!isFound) {
            System.out.println("\"" + title + "\"    Актёр с фамилией " + surname + " не найден.");
        }
    }

    public String toString() {
        return "ru.practicum.theater.show.Show{"
                + "title='" + title + "', "
                + "duration='" + duration + "', "
                + "director='" + director.toString() + "', "
                + "listOfActors='" + listOfActors.toString()
                + "'}";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Show show = (Show) obj;
        return Objects.equals(title, show.getTitle()) &&
                Objects.equals(duration, show.getDuration()) &&
                Objects.equals(director, show.getDirector()) &&
                Objects.equals(listOfActors, show.getListOfActors());
    }

    @Override
    public int hashCode() {
        int hash = 17;
        if (title != null) hash += title.hashCode();
        hash *= 31;
        if (duration != null) hash += duration.hashCode();
        hash *= 31;
        if (director != null) hash += director.hashCode();
        hash *=31;
        if (listOfActors != null) hash += listOfActors.hashCode();
        hash +=31;
        return hash;
    }
}
