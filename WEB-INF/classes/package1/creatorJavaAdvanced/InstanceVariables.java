package package1.creatorJavaAdvanced;
/**
 * FINISHED = TRUE
 * DEPENDENCIES = DataVariables + Utilities.newLine
 */
public class InstanceVariables extends ClassMiniModules
{
    
    public InstanceVariables(DataVariables dataV)
    {
        super(dataV);
        
    }
   
    public String mainGrabOutputVal()
    {
        String toBeReturned = "";
        
        
        for(int i = 0;i < dataV.getNumberOfLines(); i++)
        {
            String[] splitWords = dataV.getLineNumber(i).split(" ");
            String w1 = splitWords[0];
            String w2 = splitWords[1];
            String w3 = splitWords[2];
            
            toBeReturned += w1 + " " + w2 + " " + w3 +";" + Utilities.newLine();
        }
        
        this.setoutputVal(toBeReturned);
        
        return toBeReturned;
    }

} 










