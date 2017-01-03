package package1.creatorJavaAdvanced;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
/**
 * NO Dependencies
 */
public abstract class AdvancedData
{
    private String dataVariables;
    private List<String> listOfLines;
    
    public AdvancedData(String dataVariables)
    {
        this.dataVariables = dataVariables;
        listOfLines = new ArrayList<String>(Arrays.asList(getdataVariables().split(",")));
  
    }
    
    /**
    * @return String dataVariables
    */
    public String getdataVariables()
    {
        return dataVariables;
    }
    
    
    /**
    * set String dataVariables
    * @param String dataVariables
    */
    public void setdataVariables(String dataVariables)
    {
        this.dataVariables = dataVariables;
    }
    
    public String[] getArrDataVariables()
    {
        String[] allTheWords = this.dataVariables.split(" "); //added all words to an array
        
        return allTheWords;
    }
    
    @Override
    public String toString()
    {
        String info ="";
        info += " dataVariables = " + dataVariables;
        return info;
    }
    
    public String[] splitIntoLines()
    {
        
        String[] normalArr = getdataVariables().split(",");

        return normalArr;
        
    }
    
    public List<String> getlistOfLines()
    {
        return listOfLines;
    }
    
    public int getNumberOfLines()
    {
        return listOfLines.size();
    }
    
    public String getLineNumber(int theLineNumber)
    {
         String toBeReturned = listOfLines.get(theLineNumber);
         
         return toBeReturned;
    }
}
