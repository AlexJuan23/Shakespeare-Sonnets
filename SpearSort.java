import java.util.*;
import java.util.Iterator;
import java.io.IOException;
/**
 * sorts the rawSonnet data by sonnet number and places it into and ArrayList
 * 
 * @author (SUper awesome) 
 * @version (1)
 */
public class SpearSort
{
    // instance variables
    private List<LittleSpears> sonnets;
    private SpearIn getSonnets;

    /**
     * inits the Arraylist and inits the list stream
     */
    public SpearSort() throws IOException
    {
        sonnets = new ArrayList<LittleSpears>();
        getSonnets = new SpearIn();
       
   

    }
   /**
    * acccessor method returns the sorted sonnets by sonnet number.
    * @return sonnets  list of the sorted sonnets.
    */
 public List<LittleSpears> getSortedSonnets()
 {
      List<String> rawSonnets = getSonnets.getRawSonnets();
      List<String> sonnetLines = new ArrayList<String>();  
      String sonnet = "SONNET" + "\n";
      for(String sonnetLine: rawSonnets) {
          if(sonnetLine.contains("SONNET")) {
              LittleSpears spear = new LittleSpears(sonnetLines); 
              sonnets.add(spear);
               sonnetLines.clear();
               sonnetLines.add(sonnetLine); 
        
    }
            else {
                sonnetLines.add(sonnetLine);
        }
    }
    return sonnets;

}
}
