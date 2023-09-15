/******
 Name: Lulu Xu
 Assignment: 5004 Lab01
 Date: 09/09/2023
 Notes: IDE Part 04 and 05 for main.Person class.
 ******/

/**
 * This class represents a person The person has a first name, last name and an year of birth.
 */
public class Person {
  private String firstName;
  private String lastName;
  private int yearOfBirth;

  /**
   * Constructs a main.Person object and initializes it to the given first name, last name and year of
   * birth.
   *
   * @param firstName   the first name of this person
   * @param lastName    the last name of this person
   * @param yearOfBirth the year of birth of this person
   */

  public Person(String firstName, String lastName, int yearOfBirth) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.yearOfBirth = yearOfBirth;
  }

  /**
   * Get the first name of this person.
   *
   * @return the first name of this person
   */
  public String getFirstName() {
    return this.firstName;
  }

  /**
   * Return the last name of this person.
   *
   * @return the last name of this person
   */

  public String getLastName() {
    return this.lastName;
  }

  /**
   * Return the year of birth of this person.
   *
   * @return the year of birth of this person
   */
  public int getYearOfBirth() {
    return this.yearOfBirth;
  }
}

