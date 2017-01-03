package package1.creatorJavaAdvanced;
/**
 * FINISHED = TRUE
 * DEPENDENCIES = DataVariables + Utilities.newLine
 */
public class Setters extends ClassMiniModules
{

    
    public Setters(DataVariables dataV)
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
            
            toBeReturned+="/**"+Utilities.newLine();
            toBeReturned+="* set "+w2+" "+w3+Utilities.newLine();
            toBeReturned+="* @param "+w2+" "+w3+Utilities.newLine();
            toBeReturned+="*/"+Utilities.newLine();
            toBeReturned+="public void set"+w3+"("+w2+" "+w3+")"+Utilities.newLine();
            toBeReturned+="{"+Utilities.newLine();
            toBeReturned+="this."+w3+" = "+w3+";"+Utilities.newLine();
            toBeReturned+="}"+Utilities.newLine();
        }
        
        this.setoutputVal(toBeReturned);
        
        return toBeReturned;
    }

} 