import java.time.LocalDate;
import java.time.Period;
import java.util.List;

public class Person implements CheckPerson{
    List<Person> personList;


    public enum Sex {
        MALE, FEMALE
    }


    String name;
    LocalDate birthday;
    Sex gender;
    String emailAddress;

    public Person(String name, LocalDate birthday, Sex gender, String emailAddress) {
        this.name = name;
        this.birthday = birthday;
        this.gender = gender;
        this.emailAddress = emailAddress;
    }

    public Person() {
    }

    public int getAge(LocalDate birthday) {
        this.birthday = birthday;
        LocalDate currentDate = LocalDate.now();
        Period currentAge = Period.between(birthday,currentDate);
        return currentAge.getYears();
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Sex getGender() {
        return gender;
    }

    public void setGender(Sex gender) {
        this.gender = gender;
    }


    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    @Override
    public boolean test(Person p) {
        return true;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", birthday=" + birthday +
                ", gender=" + gender +
                ", emailAddress='" + emailAddress + '\'' +
                '}';
    }

    public void printPerson() {
        System.out.println(this.toString());
    }

}