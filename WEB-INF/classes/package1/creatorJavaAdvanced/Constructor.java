package package1.creatorJavaAdvanced;
/**
 * FINISHED = TRUE
 * DEPENDENCIES = DataClass + DataVariables + Utilities.newLine
 */
public class Constructor extends ClassMediModules
{
   
    public Constructor(DataClass dataC,DataVariables dataV)
    {
        super(dataC,dataV);
    }
    
    /**
     * Grab part 1 of constructor
     */
    private String grabPart1()
    {
        String toBeReturned = "";
        
            
            for(int i = 0;i < dataV.getNumberOfLines(); i++)
            {
                String[] splitWords = dataV.getLineNumber(i).split(" ");
                String w1 = splitWords[0];
                String w2 = splitWords[1];
                String w3 = splitWords[2];
                
                if(i != 0)
                {
                    toBeReturned += "," + w2 + " " + w3;
                }
                else
                {
                    toBeReturned += w2 + " " + w3;
                }
            }
            
        return toBeReturned;
    }
    
    /**
     * 
     * Grab part 2 of constructor
     */
    private String grabPart2()
    {
        String toBeReturned = "";
        
            for(int i = 0;i < dataV.getNumberOfLines(); i++)
            {
                String[] splitWords = dataV.getLineNumber(i).split(" ");
                String w1 = splitWords[0];
                String w2 = splitWords[1];
                String w3 = splitWords[2];
                
                toBeReturned += "this."+w3+" = "+w3+";"+Utilities.newLine();
            }
            
        return toBeReturned;
    }
    
    @Override
    public String mainGrabOutputVal()
    {
        String toBeReturned = "";
        
        toBeReturned +="public "+this.dataC.getdataClassName()+"("+this.grabPart1()+")"+Utilities.newLine();
        toBeReturned +="{"+Utilities.newLine();
        toBeReturned += this.grabPart2()+Utilities.newLine();
        toBeReturned +="}"+Utilities.newLine();
        
        this.setoutputVal(toBeReturned);
        
        return toBeReturned;
    }

} 