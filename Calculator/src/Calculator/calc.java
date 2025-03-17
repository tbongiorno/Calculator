package Calculator;
// -------------------------------------------------------------------------
/**
 *  Write a one-sentence summary of your class here.
 *  Follow it with additional details about its purpose, what abstraction
 *  it represents, and how to use it.
 * 
 *  @author trbon
 *  @version Mar 17, 2025
 */
public class calc
{
    //~ Fields ................................................................
    
    //~ Constructors ..........................................................
    /**
     * Place a description of your method here.
     * @param x the original number
     * @param y the number being used on x
     * @param mdas The mdas that will happen
     * @return The calculation
     */
    public Double calculations(double x, double y, String mdas) { 
        Double d;
        if(mdas.equals("+")) {
            d = x + y;
        }
        else if(mdas.equals("-")) {
            d = x - y;
        }
        else if (mdas.equals("*")) {
            d = x * y;
        }
        else if (mdas.equals("/")) {
            d = x / y;
        }
        else {
            d = null;
        }
        
        if (d == null) {
            return null;
        }
        return (double)Math.round(d);
    }
    //~Public  Methods ........................................................
    
}   
