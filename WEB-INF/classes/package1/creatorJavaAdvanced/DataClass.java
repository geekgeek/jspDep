package package1.creatorJavaAdvanced;
/**
 * DEPENDENCIES SimpleData
 */
public class DataClass extends SimpleData
{
    private String dataClassName;
    
    public DataClass(String dataClassName)
    {
        super(dataClassName);
        this.dataClassName = dataClassName;
    }
    
    @Override
    public String toString()
    {
        String info ="";
        info += " dataClassName = " + dataClassName;
        return info;
    }

}
