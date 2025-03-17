package Calculator;

import java.util.Scanner;

public class ProjectRunner
{
    //~ Fields ................................................................

    //~ Constructors ..........................................................
    // ----------------------------------------------------------
    /**
     * Place a description of your method here.
     * @param args
     */
    public static void main(String[] args) {
        Scanner scan;
        
        if (args.length > 0) {
            scan = new Scanner(args[0]); 
        }
        else {
            scan = new Scanner("calcTestInput.txt");
        }
        
        calc c = new calc();
        System.out.print(c.calculations(82.3, 17.7, "/") + "\n");
        System.out.print(c.calculations(14.6, 266.6, "-") + "\n");
        System.out.print(c.calculations(345, 41.3, "+") + "\n");
        System.out.print(c.calculations(15.3, 6.93, "*") + "\n");
    }
    //~Public  Methods ........................................................
    
}
