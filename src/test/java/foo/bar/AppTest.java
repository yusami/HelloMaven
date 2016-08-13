package foo.bar;

import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.junit.experimental.theories.DataPoint;
import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

/**
 * Unit test for simple App.
 */
@RunWith(Theories.class)
public class AppTest
{
    /**
    * Create the test target.
    */
	  private App app = new App();

    /**
     * Simple Test.
     */
    @Test
    public void testApp()
    {
        // setup
        String[] args = {"abc", "def"};
        // execute
        String actual = app.join(args);
        // verify
        assertThat(actual, is("abc,def"));
    }

    /**
     * Rigourous Test :-)
     */
    @Test
    public void testMain()
    {
        // setup
        String[] args = {};
        // execute
        App.main(args);
        // verify
        assertTrue( true );
    }

    @Theory
    public void helloTheory() {
        System.out.println("Hello, Theory!");
    }

    @DataPoints
    public static String[] NAMES = { "Red", "Green", "Blue" };

    @Theory
    public void helloDataPoint(String name) {
        System.out.println("Hello, " + name + "!");
    }
}
