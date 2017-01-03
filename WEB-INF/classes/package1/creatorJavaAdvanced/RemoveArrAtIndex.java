package package1.creatorJavaAdvanced;

/**
 * Find and return value at array index
 * NEW
 * NOT IMPLEMENTED
 */
public class RemoveArrAtIndex extends ArrayModules
{

    public RemoveArrAtIndex(DataArrName ddataArrName,DataArrType ddataArrType)
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
        
        toBeReturned +="public boolean remove"+arrName+"(int index)"+Utilities.newLine();
        toBeReturned +="{"+Utilities.newLine();
            
        toBeReturned +="if(index >= 0 && index < "+arrName+".size())"+Utilities.newLine();
        toBeReturned +="{"+Utilities.newLine();
        toBeReturned += arrName+".remove(index);"+Utilities.newLine();
        toBeReturned +="return true;"+Utilities.newLine();    
        toBeReturned +="}"+Utilities.newLine();    
        toBeReturned +="return false;"+Utilities.newLine();
        toBeReturned +="}"+Utilities.newLine();
            
        if(Utilities.checkString(arrName).equals(arrName) && Utilities.checkString(arrType).equals(arrType))
        {
            this.setoutputVal(toBeReturned);
            return toBeReturned;
        }
        return "";
    }

}
