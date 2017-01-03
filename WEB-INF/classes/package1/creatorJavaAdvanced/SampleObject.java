package package1.creatorJavaAdvanced;
/**
 * FINISHED = TRUE
 * DEPENDENCIES = DataClass + DataVariables + Utilities.newLine
 */
public class SampleObject extends ClassMediModules
{

    public SampleObject(DataClass dataC,DataVariables dataV)
    {
        super(dataC,dataV);
    }
    
    /**
     * Grab all variables
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
     * @return 
     * @see grabPart1()
     */
    @Override
    public String mainGrabOutputVal()
    {
        String toBeReturned = "";
        
        toBeReturned +=this.dataC.getdataClassName()+" the"+this.dataC.getdataClassName()+" = new "+this.dataC.getdataClassName()+"("+this.grabPart1()+");"+Utilities.newLine();
        
        this.setoutputVal(toBeReturned);
        
        return toBeReturned;
    }


} 