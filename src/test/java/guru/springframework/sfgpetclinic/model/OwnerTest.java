package guru.springframework.sfgpetclinic.model;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.*;

class OwnerTest {

    @Test
    void dependentAssertions() {

        Owner owner = new Owner(1l, "Jhon", "Mckey");
        owner.setCity("Key West");
        owner.setTelephone("23939203920");

        assertAll("Properties Test",
                () -> assertAll("Person Properties",
                        () -> assertEquals("Jhon", owner.getFirstName(), "First Name did not match"),
                        () -> assertEquals("Mckey", owner.getLastName(), "Last Name did not match")),
                () -> assertAll("Owner Properties",
                        () -> assertEquals("Key West", owner.getCity(), "City did not match"),
                        () -> assertEquals("23939203920", owner.getTelephone(), "Telephone did not match"))
                );

        assertThat(owner.getCity(), is("Key West"));
    }
}