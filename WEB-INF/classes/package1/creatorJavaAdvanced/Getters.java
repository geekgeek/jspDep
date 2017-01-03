package package1.creatorJavaAdvanced;
/**
 * FINISHED = TRUE
 * DEPENDENCIES = DataVariables + Utilities.newLine
 */
public class Getters extends ClassMiniModules
{

    public Getters(DataVariables dataV)
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
            
            toBeReturned += "/**"+Utilities.newLine();
            toBeReturned += "* @return "+w2+" "+ w3+Utilities.newLine();
            toBeReturned += "*/"+Utilities.newLine();
            toBeReturned += "public "+w2+" get"+w3+"()"+Utilities.newLine();
            toBeReturned += "{"+Utilities.newLine();
            toBeReturned += "return "+w3+";"+Utilities.newLine();
            toBeReturned += "}"+Utilities.newLine();
        }
        
        this.setoutputVal(toBeReturned);
        
        return toBeReturned;
    }

} 