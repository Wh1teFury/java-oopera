import ru.practicum.theater.person.*;
import ru.practicum.theater.show.*;

import java.util.ArrayList;

public class Theater {

    public static void main(String[] args) {
        Actor actor1 = new Actor("Александра", "Мельникова", Gender.FEMALE, 168);
        Actor actor2 = new Actor("Анастасия", "Кузнецова", Gender.FEMALE, 170);
        Actor actor3 = new Actor("Дмитрий", "Авдеев", Gender.MALE, 185);

        Director director1 = new Director("Юрий", "Григорович", Gender.MALE, 25);
        Director director2 = new Director("Леонид", "Баратов", Gender.MALE, 10);
        Director director3 = new Director("Нина", "Чусова", Gender.FEMALE, 16);

        Person musicAuthor1 = new Person("Пётр", "Чайковский", Gender.MALE);
        Person musicAuthor2 = new Person("Модест", "Мусоргский", Gender.MALE);
        Person choreograph = new Person("Вацлав", "Рейзингер", Gender.MALE);

        Show show = new Show("Маскарад", 180, director3, new ArrayList<>());
        Opera opera = new Opera("Борис Годунов", 51, director2, new ArrayList<>(), musicAuthor2, "Либретто_1", 15);
        Ballet ballet = new Ballet("Лебединое озеро", 176, director1, new ArrayList<>(), musicAuthor1,"Либретто_2", choreograph);

        show.addActor(actor1);
        show.addActor(actor1);
        show.addActor(actor2);
        show.printDirector();
        show.printActors();
        System.out.println("-".repeat(80));

        opera.addActor(actor2);
        opera.addActor(actor3);
        opera.printDirector();
        opera.printActors();
        System.out.println("-".repeat(80));


        ballet.addActor(actor1);
        ballet.addActor(actor3);
        ballet.printDirector();
        ballet.printActors();
        System.out.println("-".repeat(80));


        show.replaceActor(actor3, "Захарова");
        show.printActors();
        System.out.println("-".repeat(80));

        opera.replaceActor(actor1, "Несуществующий");
        opera.printActors();
        System.out.println("-".repeat(80));

        opera.printLibretto();
        System.out.println("-".repeat(80));
        ballet.printLibretto();
        System.out.println("-".repeat(80));
    }
}
