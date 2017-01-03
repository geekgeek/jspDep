package package1.creatorJavaAdvanced;
/**
 * DEPENDENCIES SimpleData
 */
public class DataArrType extends SimpleData
{
    private String theDataArrayType;
    
    public DataArrType(String theDataArrayType)
    {
        super(theDataArrayType);
        this.theDataArrayType = theDataArrayType;
    }
    
    @Override
    public String toString()
    {
        String info ="";
        info += theDataArrayType;
        return info;
    }

}
