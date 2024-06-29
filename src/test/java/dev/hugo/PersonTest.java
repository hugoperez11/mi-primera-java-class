package dev.hugo;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class PersonTest {

    @Test
    void testPersonHasAttributes() {
        //Given
        Person pepa = new Person("pepa", "garcia", "11437556889-z", 1990, "Spain", "M");
        assertEquals(6,pepa.getClass().getDeclaredFields().length);
    }

    @Test
    void testGetName() {
        Person pepa = new Person("pepa", "garcia", "11437556889-z", 1990, "Spain", "M");        assertEquals("pepa", pepa.getName());
    }
 
    @Test
    void testGetLastName() {
        // Given
        Person pepa = new Person("pepa", "garcia", "11437556889-z", 1990, "Spain", "M");       
        assertEquals("garcia", pepa.getLastName());
    }

  @Test
    void testGetIdNumber() {
        // Given
        Person pepa = new Person("pepa", "garcia", "11437556889-z", 1990, "Spain", "M");        
        assertEquals("11437556889-z", pepa.getIdNumber());
    }

     @Test
    void testGetBirthYear() {
        // Given
        Person pepa = new Person("pepa", "garcia", "11437556889-z", 1990, "Spain", "M");       
        assertEquals(1990, pepa.getBirthYear());
    }
  
    @Test
    void testGetBirthCountry() {
        // Given
        Person pepa = new Person("pepa", "garcia", "11437556889-z", 1990, "Spain", "M");
        // Then
        assertEquals("Spain", pepa.getBirthCountry());
    }

    @Test
    void testGetGender() {
        // Given
        Person pepa = new Person("pepa", "garcia", "11437556889-z", 1990, "Spain", "M");
        // Then
        assertEquals("M", pepa.getGender());
    }
}