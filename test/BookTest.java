 /******
 Name: Lulu Xu
 Assignment: 5004 Lab01
 Date: 09/09/2023
 Notes: IDE Part 04 and 05 for testing main.Book class.
 ******/

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * A JUnit test class for the main.Book class.
 */

public class BookTest {
    /**
     * created two objects: main.Book from main.Book and john from main.Person.
     */
    private Book Educated;
    private Person john;

    @Before
    public void setUp() {
        john = new Person("john", "doe", 1989);

        Educated = new Book("GoodBook", john,2000);
    }

    /**
     * A JUnit test class for the getPrice() method.
     */
    @Test
    public void getPrice() { assertEquals(2000.00, Educated.getPrice(), 0.01);}

    /**
     A JUnit test class for the getPrice() method.
     */
    @Test
    public void testAuthor() {
        assertEquals(john, Educated.getAuthor());
    }

    /**
     A JUnit test class for the getTitle() method.
     */
    @Test
    public void getTitle() {
        assertEquals("GoodBook", Educated.getTitle());
    }

}
