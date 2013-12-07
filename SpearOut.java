import java.util.*;
import java.io.*;
/**
 * Write a description of class SpearOut here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SpearOut
{
   

    
    public SpearOut()
    {
       //do nothing
    }

    
    public void WriteSonnets(List<LittleSpears> sonnets)
    {
       try {
        ObjectOutputStream output = new ObjectOutputStream(
                            new FileOutputStream("SortedSonnets.bin"));
       //write file
       for( LittleSpears spear: sonnets) {
           output.writeObject(spear);
        }
        output.close();      
    }
    catch(IOException e) {
        System.out.println("shit son");
    }
 
}
  public List<LittleSpears> readSonnets()
  {
      
      List<LittleSpears> sonnets =  new ArrayList<LittleSpears>();
    
      try {
      ObjectInputStream input = new ObjectInputStream(
                         new FileInputStream("SortedSonnets.bin"));
      for(int i = 0; i<154; i++) {
         LittleSpears spear = (LittleSpears) (input.readObject());
         sonnets.add(spear);
        }
      input.close();
    }
      catch(Exception e) {
           System.out.println("Shit");
        }
      return sonnets;
           
    }
}
