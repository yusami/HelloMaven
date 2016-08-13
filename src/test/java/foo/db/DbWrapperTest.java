package foo.db;

import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

/**
 * Unit test for simple App.
 */
public class DbWrapperTest
{
    /**
     * Create the test target.
     */
	  private DbWrapper app = new DbWrapper();

    /**
     * Query Test.
     */
    @Test
    public void doQueryTest()
    {
        // execute
        app.doQuery();
    }
}
