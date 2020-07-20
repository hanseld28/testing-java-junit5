package guru.springframework.sfgpetclinic.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void groupedAssertions() {
        // given
        Person person = new Person(1L, "John", "Mckey");

        // then
        assertAll("Test Props Set",
                () -> assertEquals("John", person.getFirstName()),
                () -> assertEquals("Mckey", person.getLastName()));
    }

    @Test
    void groupedAssertionsWithMessages() {
        // given
        Person person = new Person(1L, "John", "Mckey");

        // then
        assertAll("Test Props Set",
                () -> assertEquals("John", person.getFirstName(), "First Name Failed"),
                () -> assertEquals("Mckey", person.getLastName(), "Last Name Failed"));
    }

}