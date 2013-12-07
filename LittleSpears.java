import java.util.*;
import java.io.Serializable;
/**
 * Write a description of class LittleSpears here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
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
    public String toString()
    {
        String printSonnet= "";
        for(String sonnetLines: sonnet) {
            printSonnet += sonnetLines + "\n";
        }
        
            return printSonnet;
    }

    
}
