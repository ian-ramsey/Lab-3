
/**
 * Write a description of class FC here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FC
{
    // instance variables - replace the example below with your own
    private int x;
    private long out;

    /**
     * Constructor for objects of class FC
     */
    public FC(int n)
    {
        // initialise instance variables
        x = n;
        out = 1;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public long fact()
    {
        // put your code here
        while (x > 1)
        {
            out = x*out;
            x = x - 1;
        }
        return out;
    }
}
