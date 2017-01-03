package package1.creatorJavaAdvanced;
/**
 * DEPENDENCIES SimpleData
 */
public class DataArrName extends SimpleData
{
    private String theDataArrName;
    
    public DataArrName(String theDataArrName)
    {
        super(theDataArrName);
        this.theDataArrName = theDataArrName;
    }
    
    @Override
    public String toString()
    {
        String info ="";
        info += theDataArrName;
        return info;
    }

}
