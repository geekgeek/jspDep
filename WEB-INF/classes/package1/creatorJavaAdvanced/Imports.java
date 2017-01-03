package package1.creatorJavaAdvanced;
/**
 * FINISHED = TRUE
 * DEPENDENCIES = DataImports + Utilities.newLine + Utilities.checkString
 * Return "" or the imports
 */
public class Imports implements StandardMethods
{
    private DataImports dataIV;
    private String outputVal;
    
    public Imports(DataImports dataIV)
    {
        this.dataIV = dataIV;
    
    }
    
    /**
    * @return DataImports dataIV
    */
    public DataImports getdataIV()
    {
        return dataIV;
    }
    /**
    * @return String outputVal
    */
    public String getoutputVal()
    {
        return outputVal;
    }
    
    
    /**
    * set DataImports dataIV
    * @param DataImports dataIV
    */
    public void setdataIV(DataImports dataIV)
    {
        this.dataIV = dataIV;
    }
    /**
    * set String outputVal
    * @param String outputVal
    */
    public void setoutputVal(String outputVal)
    {
        this.outputVal = outputVal;
    }
    
    @Override
    public String toString()
    {
        return mainGrabOutputVal();
    }

    public String mainGrabOutputVal()
    {
        String toBeReturned = "";
        
        
        
        for(int i = 0;i < dataIV.getNumberOfLines(); i++)
        {
            
            toBeReturned +="import " + dataIV.getLineNumber(i) +";" + Utilities.newLine();
        }
        
        if(Utilities.checkString(dataIV.getLineNumber(0)).equals(dataIV.getLineNumber(0)))
        {
        this.setoutputVal(toBeReturned);
        
        return toBeReturned;
        
        }
        
        this.setoutputVal("");
        return "";
    }

    public void printMain()
    {
        System.out.println(mainGrabOutputVal());
    }

} 