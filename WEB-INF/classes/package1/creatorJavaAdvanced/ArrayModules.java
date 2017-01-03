package package1.creatorJavaAdvanced;
/**
 * Abstract class ArrayModules - write a description of the class here
 * 
 * @author (your name here)
 * @version (version number or date here)
 */
public abstract class ArrayModules implements StandardMethods
{
    private DataArrName thedataArrName;
    private DataArrType thedataArrType;
    private String outputVal;
    
    public ArrayModules(DataArrName thedataArrName,DataArrType thedataArrType)
    {
        this.thedataArrName = thedataArrName;
        this.thedataArrType = thedataArrType;
    
    }
    /**
    * set DataArrName thedataArrName
     * @param thedataArrName
    * @param DataArrName thedataArrName
    */
    public void setthedataArrName(DataArrName thedataArrName)
    {
        this.thedataArrName = thedataArrName;
    }
    /**
    * set DataArrType thedataArrType
     * @param thedataArrType
    * @param DataArrType thedataArrType
    */
    public void setthedataArrType(DataArrType thedataArrType)
    {
        this.thedataArrType = thedataArrType;
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
    * @return DataArrName thedataArrName
    */
    public DataArrName getthedataArrName()
    {
        return thedataArrName;
    }
    /**
    * @return DataArrType thedataArrType
    */
    public DataArrType getthedataArrType()
    {
        return thedataArrType;
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
    
    /**
     * Main function
     */
    @Override
    public String mainGrabOutputVal()
    {
        String toBeReturned = "";
        
        return "not overriden. Override ArrayModules mainGrabOutputVal()";
    }

}
