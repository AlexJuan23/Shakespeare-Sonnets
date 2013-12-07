import java.util.Scanner;
/**
 * Readstyped text input from text terminal
 * 
 * @author (Alex Aguilar) 
 * @version (0.1)
 */
public class InputReader
{
    private Scanner reader;
    // instance variables - replace the example below with your own
   
    /**
     * Constructor for InputReader
     */
    public InputReader()
    {
        reader = new Scanner(System.in);
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public int getNumber()
    {
         System.out.print("> ");
        int i = reader.nextInt();
        return i;
    }
}
