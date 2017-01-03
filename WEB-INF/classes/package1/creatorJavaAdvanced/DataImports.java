package package1.creatorJavaAdvanced;
public class DataImports extends AdvancedData
{
    private String dataImportVars;
    
    public DataImports(String dataImportVars)
    {

        super(dataImportVars);
    }

    @Override
    public String toString()
    {
        String info ="";
        info += super.toString();
        info += " dataImportVars = " + dataImportVars;
        return info;
    }

} 