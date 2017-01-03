package package1.creatorJavaAdvanced;
/**
 * Simplest constructor
 * Only need 2 textboxes
 */
public class ModuleClass implements StandardMethods
{
    private DataClass theDataClass;
    private DataVariables theDataVariables;
    private InstanceVariables theInstanceVariables;
    private Constructor theConstructor;
    private Setters theSetters;
    private Getters theGetters;
    private ToString theToString;
    private String outputVal;
    
    public ModuleClass(String txtClass, String txtVariables)
    {
        this.theDataClass = new DataClass(txtClass);
        this.theDataVariables = new DataVariables(txtVariables);
        
        this.theInstanceVariables = new InstanceVariables(theDataVariables);
        this.theConstructor = new Constructor(theDataClass,theDataVariables);
        this.theSetters = new Setters(theDataVariables);
        this.theGetters = new Getters(theDataVariables);
        this.theToString = new ToString(theDataVariables);
    
    }
    
    /**
    * @return DataClass theDataClass
    */
    public DataClass gettheDataClass()
    {
        return theDataClass;
    }
    /**
    * @return DataVariables theDataVariables
    */
    public DataVariables gettheDataVariables()
    {
        return theDataVariables;
    }
    /**
    * @return InstanceVariables theInstanceVariables
    */
    public InstanceVariables gettheInstanceVariables()
    {
        return theInstanceVariables;
    }
    /**
    * @return Constructor theConstructor
    */
    public Constructor gettheConstructor()
    {
        return theConstructor;
    }
    /**
    * @return Setters theSetters
    */
    public Setters gettheSetters()
    {
        return theSetters;
    }
    /**
    * @return Getters theGetters
    */
    public Getters gettheGetters()
    {
        return theGetters;
    }
    /**
    * @return ToString theToString
    */
    public ToString gettheToString()
    {
        return theToString;
    }
    /**
    * @return String outputVal
    */
    public String getoutputVal()
    {
        return outputVal;
    }
    
    
    /**
    * set DataClass theDataClass
    * @param DataClass theDataClass
    */
    public void settheDataClass(DataClass theDataClass)
    {
        this.theDataClass = theDataClass;
    }
    /**
    * set DataVariables theDataVariables
    * @param DataVariables theDataVariables
    */
    public void settheDataVariables(DataVariables theDataVariables)
    {
        this.theDataVariables = theDataVariables;
    }
    /**
    * set InstanceVariables theInstanceVariables
    * @param InstanceVariables theInstanceVariables
    */
    public void settheInstanceVariables(InstanceVariables theInstanceVariables)
    {
        this.theInstanceVariables = theInstanceVariables;
    }
    /**
    * set Constructor theConstructor
    * @param Constructor theConstructor
    */
    public void settheConstructor(Constructor theConstructor)
    {
        this.theConstructor = theConstructor;
    }
    /**
    * set Setters theSetters
    * @param Setters theSetters
    */
    public void settheSetters(Setters theSetters)
    {
        this.theSetters = theSetters;
    }
    /**
    * set Getters theGetters
    * @param Getters theGetters
    */
    public void settheGetters(Getters theGetters)
    {
        this.theGetters = theGetters;
    }
    /**
    * set ToString theToString
    * @param ToString theToString
    */
    public void settheToString(ToString theToString)
    {
        this.theToString = theToString;
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
        info += " theDataClass = " + theDataClass;
        info += " theDataVariables = " + theDataVariables;
        info += " theInstanceVariables = " + theInstanceVariables;
        info += " theConstructor = " + theConstructor;
        info += " theSetters = " + theSetters;
        info += " theGetters = " + theGetters;
        info += " theToString = " + theToString;
        info += " outputVal = " + outputVal;
        return info;
    }
    
    /**
     * Need 2 textboxes
     * Returns class + imports
     */
    public String mainGrabOutputVal()
    {
        String toBeReturned = "";
        
        toBeReturned += "public class "+theDataClass.getdataClassName()+Utilities.newLine();
        toBeReturned += "{"+Utilities.newLine();
            
           
           toBeReturned += theInstanceVariables.mainGrabOutputVal()+Utilities.newLine();
           toBeReturned += theConstructor.mainGrabOutputVal();
           toBeReturned += theSetters.mainGrabOutputVal();
           toBeReturned += theGetters.mainGrabOutputVal();
           toBeReturned += theToString.mainGrabOutputVal();
           
        toBeReturned += Utilities.newLine() + "}";
        
        this.setoutputVal(toBeReturned);
        
        return toBeReturned;
    }
    
    public void printMain()
    {
        System.out.println(mainGrabOutputVal());
    }

} 