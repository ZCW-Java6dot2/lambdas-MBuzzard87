import java.time.LocalDate;

public class Main {


    public static void main(String[] args) {
        LocalDate birthday = LocalDate.of(1987,2,7);
        Person person = new Person("Mike", birthday, Person.Sex.MALE, "mbuzz@gmail.com");

        person.printPerson();

    }
}
