package package1.creatorJavaAdvanced;
/**
 * FINISHED = TRUE
 * DEPENDENCIES = DataVariables + Utilities.newLine
 */
public class ToString extends ClassMiniModules
{
    
    public ToString(DataVariables dataV)
    {
        super(dataV);
        
    }
    
    /**
     * Main function
     */
    public String mainGrabOutputVal()
    {
        String toBeReturned = "";
        
        toBeReturned += "@Override"+ Utilities.newLine();
        toBeReturned += "public String toString()"+ Utilities.newLine();
        toBeReturned += "{"+ Utilities.newLine();
        toBeReturned += "String info ="+'"'+'"'+";"+ Utilities.newLine();
        
        for(int i = 0;i < dataV.getNumberOfLines(); i++)
        {
            String[] splitWords = dataV.getLineNumber(i).split(" ");
            String w1 = splitWords[0];
            String w2 = splitWords[1];
            String w3 = splitWords[2];
            
            toBeReturned += "info += " +w3+";"+ Utilities.newLine();
        }
        
        
        toBeReturned += "return info;"+ Utilities.newLine();
        toBeReturned += "}"+ Utilities.newLine();
        
        this.setoutputVal(toBeReturned);
        
        return toBeReturned;
    }
} 