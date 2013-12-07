 import java.io.*;
import java.util.*;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * reads the raw content from a txt file I have modified to break apart the text and 
 * store it into an arraylist of strings.
 * 
 * @author (Axle) 
 * @version (0.1)
 */
public class SpearIn
{
    private List<String> sonnets;
    InputStreamReader rawSonnets;
    String sonnetLine;
    
    

    /**
     * Constructor for objects of class SpearIn. set sonnet collection as ArrayList and initiates the call
     * to read Shakespeare sonnets from txtfile.
     * 
     */
    public SpearIn() throws IOException
    {
        sonnets = new ArrayList<String>();
        readSonnetsBetter();
        
        
    }
   /**
    * accessor. returns list of the raw sonnets.
    * @return sonnets   ArrayList of the sonnets
    */
    public List<String> getRawSonnets()
    {
        return sonnets;
    }
    /** 
     * streams all shakespeare sonnets from file and stores them line by line in an ArrayList
     */
   
    private void readSonnetsBetter() throws IOException  {
      
        Scanner inputStream = null;
        
        try {
            inputStream =  new Scanner(new BufferedReader(new FileReader("sonnets.txt"))).useDelimiter("");
            
            String l;
            while(inputStream.hasNextLine()) {
                l = inputStream.nextLine();
                sonnets.add(l);
            }
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
        }
    }
        
    }
   

