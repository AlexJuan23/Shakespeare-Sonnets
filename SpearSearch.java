import java.util.*;
import java.io.IOException;
/**
 * retrieve any sonnet you wish
 * 
 * @author (Axle) 
 * @version (0.1)
 */
public class SpearSearch
{
    // instance variables
    private List<LittleSpears> sonnets;
    private SpearSort sortedSonnets;

    /**
     * Constructor for objects of class SpearSearch. grabs the sorted sonnets and puts them into an arraylist
     */
    public SpearSearch() throws IOException
    {
        sonnets = new ArrayList<LittleSpears>();
        sortedSonnets = new SpearSort();
        sonnets = sortedSonnets.getSortedSonnets();
    }

    /**
     * accessor for retrieving individual sonnets by number
     */
    public LittleSpears search(int number)
    {
       return sonnets.get(number-1);
    }
    /**
     * prints a copy of an individual sonnet by number
     */
    public void print(int i)
    {
         
        String sonnet = search(i).toString();
        System.out.println(sonnet);
    }
}
