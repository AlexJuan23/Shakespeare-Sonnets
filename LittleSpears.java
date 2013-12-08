import java.util.*;
import java.io.Serializable;
/**
 * recieves a whole sonnet from SpearSort stores it and formats a tostring for it.
 * 
 * @author (axle) 
 * @version (0.1)
 */
public class LittleSpears implements Serializable
{
    List<String> sonnet;


    /**
     * Constructor for objects of class LittleSpears
     */
    public LittleSpears(List<String> tsonnet)
    {
        sonnet = new ArrayList<String>();
        this.sonnet.addAll(tsonnet);
    }
    /**
     * returns a string that represents a whole sonnet.
     * @return  formatted sonnet
     */
    public String toString()
    {
        String printSonnet= "";
        for(String sonnetLines: sonnet) {
            printSonnet += sonnetLines + "\n";
        }
        
            return printSonnet;
    }

    
}
