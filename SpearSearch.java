import java.util.*;
import java.io.IOException;
/**
 * retrieve any sonnet you wish
 * 
 * @author (Awesom) 
 * @version (a version number or a date)
 */
public class SpearSearch
{
    // instance variables
    private List<LittleSpears> sonnets;
    private SpearSort sortedSonnets;

    /**
     * Constructor for objects of class SpearSearch
     */
    public SpearSearch() throws IOException
    {
        sonnets = new ArrayList<LittleSpears>();
        sortedSonnets = new SpearSort();
        sonnets = sortedSonnets.getSortedSonnets();
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public LittleSpears search(int number)
    {
       return sonnets.get(number-1);
    }
    public void print(int i)
    {
         
        String sonnet = search(i).toString();
        System.out.println(sonnet);
    }
}
