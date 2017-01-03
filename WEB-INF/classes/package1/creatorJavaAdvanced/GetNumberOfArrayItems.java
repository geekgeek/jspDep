package package1.creatorJavaAdvanced;
/**
 * Get number of array items
 * NEW
 * NOT IMPLEMENTED
 */
public class GetNumberOfArrayItems extends ArrayModules
{
    
    public GetNumberOfArrayItems(DataArrName ddataArrName,DataArrType ddataArrType)
    {
        super(ddataArrName,ddataArrType);
    }

    /**
     * Main function
     */
    @Override
    public String mainGrabOutputVal()
    {
        String toBeReturned = "";
        
        String arrName = this.getthedataArrName().toString();
        String arrType = this.getthedataArrType().toString();
        
        toBeReturned +="public int getNumberOf"+arrName+"()"+Utilities.newLine();
        toBeReturned +="{"+Utilities.newLine();
        toBeReturned +="return "+arrName+".size();"+Utilities.newLine();
        toBeReturned +="}"+Utilities.newLine();
            
        if(Utilities.checkString(arrName).equals(arrName) && Utilities.checkString(arrType).equals(arrType))
        {
            this.setoutputVal(toBeReturned);
            return toBeReturned;
        }
        return "";
    }

}
