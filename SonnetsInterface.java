import java.io.IOException;
/**
 * Write a description of class SonnetsInterface here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
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
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public static void main(String [] args) throws IOException
    {
       SonnetsInterface sonnets =new SonnetsInterface();
       sonnets.Begin();
    }
    public void Begin()
    {
        PrintWelcome();
        boolean finished =  false;
        
        while(!finished) {
            int i = reader.getNumber();
            Sonnets.print(i);
            if(i== 0) {
                finished = true;
            }
        }
    }
    public void PrintWelcome()
    {
        System.out.println("please enter a Sonnet number you would like to view");
        System.out.println("hint: there are 154 of them!");
    }
}
