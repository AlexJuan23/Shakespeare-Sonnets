import java.io.IOException;
/**
 *User interface for Sonnet app .
 * 
 * @author (Axle) 
 * @version (0.1)
 */
public class SonnetsInterface
{
    // instance variables - replace the example below with your own
    private SpearSearch Sonnets;
    private InputReader reader;

    /**
     * Constructor for objects of class SonnetsInterface
     */
    public SonnetsInterface()throws IOException
    {
        Sonnets = new SpearSearch();
       reader = new InputReader();
    }

    /**
     * Static main function. Start here!
     */
    public static void main(String [] args) throws IOException
    {
       SonnetsInterface sonnets =new SonnetsInterface();
       sonnets.Begin();
    }
   /**
    * prints a welcome message and enters the Sonnet loop 
    * will continue to loop until 0 is entered
    */
    public void Begin()
    {
        PrintWelcome();
        boolean finished =  false;
        
        while(!finished) {
            int i = reader.getNumber();
            
            if(i== 0) {
                finished = true;
            } else {
                Sonnets.print(i);
        }
    }
}
    /**
     * 
     */
    public void PrintWelcome()
    {
        System.out.println("please enter a Sonnet number you would like to view");
        System.out.println("hint: there are 154 of them!");
        System.out.println("enter 0 to exit or type help to crash the program");
    }
}
