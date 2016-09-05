import java.util.Scanner;
/**
 * Reads the typed text input from text terminal
 * 
 * @author (Axle) 
 * @version (0.1)
 */
public class InputReader
{
    private Scanner reader;
    
   
    /**
     * Constructor for InputReader
     */
    public InputReader()
    {
        reader = new Scanner(System.in);
    }

    /**
     * accessor for retrieving the user typed data.
     */
    public int getNumber()
    {
         System.out.print("> ");
        int i = reader.nextInt();
        return i;
    }
}
