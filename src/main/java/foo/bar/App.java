package foo.bar;

import org.apache.commons.lang3.*;

/**
 * Hello world!
 */
public class App
{
    /**
     * App main
     *
     * @param args Array of some strings.
     */
    public static void main( String[] args ) {
        String str = new App().join(args);
        System.out.println(str);
    }

    /**
     * Join the string.
     *
     * @param args Array of some strings.
     * @return Joined string
     */
    public String join(String[] args) {
        return StringUtils.join(args, ",");
    }
}
