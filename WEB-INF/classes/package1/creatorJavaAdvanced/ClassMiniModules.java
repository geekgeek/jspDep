package package1.creatorJavaAdvanced;
/**
 * Abstract class ClassMiniModules - write a description of the class here
 * 
 * @author (your name here)
 * @version (version number or date here)
 */
public abstract class ClassMiniModules implements StandardMethods
{
    protected DataVariables dataV;
    private String outputVal;
    
    public ClassMiniModules(DataVariables dataV)
    {
        this.dataV = dataV;
    }

    
    /**
    * @return DataVariables dataV
    */
    public DataVariables getdataV()
    {
        return dataV;
    }
    /**
    * @return String outputVal
    */
    @Override
    public String getoutputVal()
    {
        return outputVal;
    }
    
    
    /**
    * set DataVariables dataV
     * @param dataV
    * @param DataVariables dataV
    */
    public void setdataV1(DataVariables dataV)
    {
        this.dataV = dataV;
    }
    /**
    * set String outputVal
    * @param String outputVal
    */
    @Override
    public void setoutputVal(String outputVal)
    {
        this.outputVal = outputVal;
    }

    @Override
    public String toString()
    {
        return mainGrabOutputVal();
    }
    
    @Override
    public String mainGrabOutputVal()
    {
        String toBeReturned = "";
        
        return "mainGrabOutputVal() must be overridden";
    }

    @Override
    public void printMain()
    {
        System.out.println(mainGrabOutputVal());
    }
    
}
