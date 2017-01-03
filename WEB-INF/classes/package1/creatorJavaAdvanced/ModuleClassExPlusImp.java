package package1.creatorJavaAdvanced;
/**
 * Advanced constructor
 * Recommended 5 textboxes
 * But works with only 2 textboxes
 */
public class ModuleClassExPlusImp implements StandardMethods
{
    private DataImports theDataImports;
    private Imports theImports;
    private ModuleClassExtended theModuleClassEx;
    private String outputVal;
    
    public ModuleClassExPlusImp(String xDataImports,String xDataClass,String xDataVariables,String xdataArrName,String xdataArrType)
    {
        this.theDataImports = new DataImports(xDataImports);
        this.theImports = new Imports(theDataImports);
        this.theModuleClassEx = new ModuleClassExtended(xDataClass,xDataVariables,xdataArrName,xdataArrType);
    }
    /**
    * set DataImports theDataImports
    * @param DataImports theDataImports
    */
    public void settheDataImports(DataImports theDataImports)
    {
        this.theDataImports = theDataImports;
    }
    /**
    * set Imports theImports
    * @param Imports theImports
    */
    public void settheImports(Imports theImports)
    {
        this.theImports = theImports;
    }
    /**
    * set ModuleClassExtended theModuleClassEx
    * @param ModuleClassExtended theModuleClassEx
    */
    public void settheModuleClassEx(ModuleClassExtended theModuleClassEx)
    {
        this.theModuleClassEx = theModuleClassEx;
    }
    /**
    * set String outputVal
    * @param String outputVal
    */
    public void setoutputVal(String outputVal)
    {
        this.outputVal = outputVal;
    }
    /**
    * @return DataImports theDataImports
    */
    public DataImports gettheDataImports()
    {
        return theDataImports;
    }
    /**
    * @return Imports theImports
    */
    public Imports gettheImports()
    {
        return theImports;
    }
    /**
    * @return ModuleClassExtended theModuleClassEx
    */
    public ModuleClassExtended gettheModuleClassEx()
    {
        return theModuleClassEx;
    }
    /**
    * @return String outputVal
    */
    public String getoutputVal()
    {
        return outputVal;
    }
    @Override
    public String toString()
    {
        String info ="";
        info += theDataImports;
        info += theImports;
        info += theModuleClassEx;
        info += outputVal;
        return info;
    }
    
    /**
     * Need 5 textboxes
     * Returns class + array + imports
     * @return 
     */
    @Override
    public String mainGrabOutputVal()
    {
        String toBeReturned = "";
        toBeReturned += theImports.mainGrabOutputVal()+Utilities.newLine();
           
        toBeReturned += theModuleClassEx.mainGrabOutputVal()+Utilities.newLine();
        
        this.setoutputVal(toBeReturned);
        return toBeReturned;
    }
    
    @Override
    public void printMain()
    {
        System.out.println(mainGrabOutputVal());
    }

}
