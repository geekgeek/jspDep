package package1.creatorJavaAdvanced;
/**
 * Abstract class ClassMediModules - write a description of the class here
 * 
 * @author (your name here)
 * @version (version number or date here)
 */
public abstract class ClassMediModules implements StandardMethods
{
    protected DataClass dataC;
    protected DataVariables dataV;
    private String outputVal;
    
    public ClassMediModules(DataClass dataC,DataVariables dataV)
    {
        this.dataC = dataC;
        this.dataV = dataV;
    }
    
     /**
    * set DataClass dataC
     * @param dataC
    */
    public void setdataC(DataClass dataC)
    {
        this.dataC = dataC;
    }
    /**
    * set DataVariables dataV
     * @param dataV
    */
    public void setdataV(DataVariables dataV)
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
    /**
    * @return DataClass dataC
    */
    public DataClass getdataC()
    {
        return dataC;
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
    @Override
    public String toString()
    {
        return mainGrabOutputVal();
    }
    
    @Override
    public void printMain()
    {
        System.out.println(mainGrabOutputVal());
    }
    
    @Override
    public String mainGrabOutputVal()
    {
        String toBeReturned = "";
        
        return "mainGrabOutputVal() must be overridden";
    }
    
}
