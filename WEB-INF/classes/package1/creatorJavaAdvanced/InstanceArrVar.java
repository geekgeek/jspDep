package package1.creatorJavaAdvanced;

public class InstanceArrVar extends ArrayModules
{
    
    public InstanceArrVar(DataArrName ddataArrName,DataArrType ddataArrType)
    {
        super(ddataArrName,ddataArrType);
    }
    
    public String mainGrabOutputVal()
    {
        String toBeReturned = "";
        String arrName = this.getthedataArrName().toString();
        String arrType = this.getthedataArrType().toString();
        
        toBeReturned += "private ArrayList"+Utilities.spec1()+arrType+Utilities.spec2()+" "+arrName+" = new ArrayList"+Utilities.spec1()+arrType+Utilities.spec2()+"()"+";" + Utilities.newLine();

        if(Utilities.checkString(arrName).equals(arrName) && Utilities.checkString(arrType).equals(arrType))
        {
            this.setoutputVal(toBeReturned);
            return toBeReturned;
        }
        return "";
    }

}
