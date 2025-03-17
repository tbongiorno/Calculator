package Calculator;
import student.TestCase;

// -------------------------------------------------------------------------
/**
 *  Write a one-sentence summary of your class here.
 *  Follow it with additional details about its purpose, what abstraction
 *  it represents, and how to use it.
 * 
 *  @author trbon
 *  @version Mar 17, 2025
 */
public class calcTest extends TestCase
{
    //~ Fields ................................................................
    private calc c;
    
    //~ Constructors ..........................................................
    public void setUp() {
        c = new calc();
    }
    
    //~Public  Methods ........................................................
    /**
     * Place a description of your method here.
     */
    public void testAdd() {
        double d1 = c.calculations(3.0, 2.0, "+");
        assertEquals(d1, 5.0, 0.001);
    }
    
    /**
     * Place a description of your method here.
     */
    public void testSub() {
        double d1 = c.calculations(11.0, 4.0, "-");
        assertEquals(d1, 7.0, 0.001);
    }
    
    /**
     * Place a description of your method here.
     */
    public void testMult() {
        double d1 = c.calculations(3.0, 5.0, "*");
        assertEquals(d1, 15.0, 0.001);
    }
    
    /**
     * Place a description of your method here.
     */
    public void testDiv() {
        double d1 = c.calculations(7.0, 2.0, "/");
        assertEquals(d1, 3.5, 0.001);
    }
    
}
