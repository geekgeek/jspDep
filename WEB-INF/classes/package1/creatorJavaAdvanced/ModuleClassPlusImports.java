package package1.creatorJavaAdvanced;
/**
 * Advanced constructor
 * 3 textboxes recommended but works with 2
 */
public class ModuleClassPlusImports implements StandardMethods
{
    private DataImports theDataImports;
    private Imports theImports;
    private ModuleClass theModuleClass;
    private String outputVal;
    
    public ModuleClassPlusImports(String txtClass, String txtVariables,String txtImports)
    {
        this.theModuleClass = new ModuleClass(txtClass,txtVariables);
        
        this.theDataImports = new DataImports(txtImports);
        
        
        this.theImports = new Imports(theDataImports);
        
    
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
    * @return ModuleClass theModuleClass
    */
    public ModuleClass gettheModuleClass()
    {
        return theModuleClass;
    }
    /**
    * @return String outputVal
    */
    public String getoutputVal()
    {
        return outputVal;
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
    * set ModuleClass theModuleClass
    * @param ModuleClass theModuleClass
    */
    public void settheModuleClass(ModuleClass theModuleClass)
    {
        this.theModuleClass = theModuleClass;
    }
    /**
    * set String outputVal
    * @param String outputVal
    */
    public void setoutputVal(String outputVal)
    {
        this.outputVal = outputVal;
    }
    
    @Override
    public String toString()
    {
        String info ="";
        info += " theDataImports = " + theDataImports;
        info += " theImports = " + theImports;
        info += " theModuleClass = " + theModuleClass;
        info += " outputVal = " + outputVal;
        return info;
    }
    
     
    /**
     * Need 3 textboxes
     * Returns class + imports
     */
    public String mainGrabOutputVal()
    {
        String toBeReturned = "";
        toBeReturned += theImports.mainGrabOutputVal()+Utilities.newLine();
           
        toBeReturned += theModuleClass.mainGrabOutputVal()+Utilities.newLine();
        
        this.setoutputVal(toBeReturned);
        return toBeReturned;
    }
    
    public void printMain()
    {
        System.out.println(mainGrabOutputVal());
    }

} 