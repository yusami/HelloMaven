package foo.bar;

import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

/**
 * Unit test for simple App.
 */
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
}
