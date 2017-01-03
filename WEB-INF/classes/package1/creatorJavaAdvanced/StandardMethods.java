package package1.creatorJavaAdvanced;
/**
 * interface 
 * StandardMethods gives a standard
 */
public interface StandardMethods
{
    /**
     * This is the main method
     * This is where you will return String the main code for the module
     * @return 
     */
    public String mainGrabOutputVal();
    
    /**
     * This is where you will print out mainGrabOutputVal()
     */
    public void printMain();
    
    /**
     * Stores data from mainGrabOutputVal()
     * @return 
     */
    public String getoutputVal();
    /**
     * Enbables data to be stored from mainGrabOutputVal()
     * @param outputVal
     */
    public void setoutputVal(String outputVal);
    
}
