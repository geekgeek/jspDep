package package1.creatorJavaAdvanced;
/**
 * DEPENDENCIES AdvancedData 
 */
public class DataVariables extends AdvancedData
{
    private String dataVariables;
    
    public DataVariables(String dataVariables)
    {

        super(dataVariables);
    }
    
    
    @Override
    public String toString()
    {
        String info ="";
        info += super.toString();
        info += " dataVariables = " + dataVariables;
        return info;
    }

}
