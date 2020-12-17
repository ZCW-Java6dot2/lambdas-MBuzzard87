import junit.framework.TestCase;

import java.io.PrintStream;
import java.time.LocalDate;


public class PersonTest extends TestCase {

    LocalDate birthday = LocalDate.of(1987,2,7);
    Person testPerson = new Person("Mike", birthday, Person.Sex.MALE, "mbuzz@gmail.com");

    public void testGetAge() {
        int expectedAge = 33;
        int actualAge = testPerson.getAge(birthday);

        assertEquals(expectedAge,actualAge);
    }

    public void testTestGetName() {
        String expectedName = "Mike";
        String actualName = testPerson.getName();

        assertEquals(expectedName,actualName);
    }

    public void testTestSetName() {
        testPerson.setName("Billy Bob");
        String expectedName = "Billy Bob";
        String actualName = testPerson.getName();

        assertEquals(expectedName,actualName);
    }

    public void testGetGender() {
        Person.Sex expectedMale = Person.Sex.MALE;
        Person.Sex actual = testPerson.getGender();

        assertEquals(expectedMale,actual);
    }

    public void testSetGender() {

        testPerson.setGender(Person.Sex.FEMALE);
        Person.Sex expectedGender = Person.Sex.FEMALE;
        Person.Sex actualGender = testPerson.getGender();

        assertEquals(expectedGender,actualGender);
    }

    public void testGetEmailAddress() {
        String expectedEmail = "mbuzz@gmail.com";
        String actualEmail = testPerson.getEmailAddress();

        assertEquals(expectedEmail,actualEmail);
    }

    public void testSetEmailAddress() {
        testPerson.setEmailAddress("hello@compuserve.com");
        String expectedEmail = "hello@compuserve.com";
        String actualEmail = testPerson.getEmailAddress();

        assertEquals(expectedEmail,actualEmail);
    }

    public void testTest1() {

    }

    public void testTestToString() {
        String actualStr = testPerson.toString();
        String expectedStr = "Person{name='Mike', birthday=1987-02-07, gender=MALE, emailAddress='mbuzz@gmail.com'}";

        assertEquals(expectedStr,actualStr);
    }

//    public void testPrintPerson() {
//        PrintStream standardOut = new PrintStream(System.out);
//
//
//
//        String expectedPrint = testPerson.toString();
//
//    }
}