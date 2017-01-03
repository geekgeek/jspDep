package package1.creatorJavaAdvanced;
/**
 * Advanced constructor
 * Recommended 4 textboxes
 * But works with only 2 textboxes
 */
public class ModuleClassExtended implements StandardMethods
{
    private DataClass theDataClass;
    private DataVariables theDataVariables;
    private InstanceVariables theInstanceVariables;
    private Constructor theConstructor;
    private Setters theSetters;
    private Getters theGetters;
    private ToString theToString;
    private DataArrName thedataArrName;
    private DataArrType thedataArrType;
    private InstanceArrVar theInstanceArr;

    private MiniModuleArr arrCollection;
    
    private String outputVal;
    
    public ModuleClassExtended(String xDataClass,String xDataVariables,String xdataArrName,String xdataArrType)
    {
        this.theDataClass = new DataClass(xDataClass);
        this.theDataVariables = new DataVariables(xDataVariables);
        
        this.theInstanceVariables = new InstanceVariables(theDataVariables);
        this.theConstructor = new Constructor(theDataClass,theDataVariables);
        this.theSetters = new Setters(theDataVariables);
        this.theGetters = new Getters(theDataVariables);
        this.theToString = new ToString(theDataVariables);
        

        
        this.thedataArrName = new DataArrName(xdataArrName);
        this.thedataArrType = new DataArrType(xdataArrType);
        
        this.theInstanceArr = new InstanceArrVar(thedataArrName,thedataArrType);
        
        this.arrCollection = new MiniModuleArr(xdataArrName,xdataArrType);      
        
    
        
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
    * set DataArrName thedataArrName
    * @param DataArrName thedataArrName
    */
    public void setthedataArrName(DataArrName thedataArrName)
    {
        this.thedataArrName = thedataArrName;
    }
    /**
    * set DataArrType thedataArrType
    * @param DataArrType thedataArrType
    */
    public void setthedataArrType(DataArrType thedataArrType)
    {
        this.thedataArrType = thedataArrType;
    }
    /**
    * set InstanceArrVar theInstanceArr
    * @param InstanceArrVar theInstanceArr
    */
    public void settheInstanceArr(InstanceArrVar theInstanceArr)
    {
        this.theInstanceArr = theInstanceArr;
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
    * @return InstanceArrVar theInstanceArr
    */
    public InstanceArrVar gettheInstanceArr()
    {
        return theInstanceArr;
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
        return mainGrabOutputVal();
    }
    
    
    /**
    * set MiniModuleArr arrCollection
    * @param MiniModuleArr arrCollection
    */
    public void setarrCollection(MiniModuleArr arrCollection)
    {
    this.arrCollection = arrCollection;
    }
    /**
    * @return MiniModuleArr arrCollection
    */
    public MiniModuleArr getarrCollection()
    {
    return arrCollection;
    }
    
    /**
     * Need 4 textboxes
     * Returns class + arr
     */
    public String mainGrabOutputVal()
    {
        String toBeReturned = "";
        
        toBeReturned += "public class "+theDataClass.getdataClassName()+Utilities.newLine();
        toBeReturned += "{"+Utilities.newLine();
       

       toBeReturned += gettheInstanceArr();

       toBeReturned += theInstanceVariables.mainGrabOutputVal()+Utilities.newLine();
       toBeReturned += theConstructor.mainGrabOutputVal();
       toBeReturned += theSetters.mainGrabOutputVal();
       toBeReturned += theGetters.mainGrabOutputVal();
       toBeReturned += theToString.mainGrabOutputVal();
       toBeReturned += arrCollection.mainGrabOutputVal();
 
       toBeReturned += Utilities.newLine() + "}";
        
       this.setoutputVal(toBeReturned);
        
       return toBeReturned;
    }
    
    public void printMain()
    {
        System.out.println(mainGrabOutputVal());
    }

} 