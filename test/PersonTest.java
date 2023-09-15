/******
 Name: Lulu Xu
 Assignment: 5004 Lab01
 Date: 09/09/2023
 Notes: IDE Part 04 and 05 for testing main.Person class.
 ******/

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * A JUnit test class for the main.Person class.
 */
public class PersonTest {
  /**
   * An object: john from main.Person.
   */
  private Person john;

  /**
   * Default constructor for PersonTest.
   */
  public PersonTest() {
    // No special initialization needed.
  }

  /**
   * Sets up the test environment by initializing a Person object before each test.
   */
  @Before
  public void setUp() {
    john = new Person("John", "Doe", 1989);
  }

  /**
   * Tests the getFirstName() method of the Person class.
   */
  @Test
  public void testFirstNameGetter() {
    assertEquals("John", john.getFirstName());
  }

  /**
   * Tests the getLastName() method of the Person class.
   */
  @Test
  public void testLastNameGetter() {
    assertEquals("Doe", john.getLastName());
  }

  /**
   * Tests the getYearOfBirth() method of the Person class.
   */
  @Test
  public void testYearOfBirthGetter() {
    assertEquals(1989, john.getYearOfBirth());
  }
}
