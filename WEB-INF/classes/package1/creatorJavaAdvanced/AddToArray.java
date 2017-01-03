package package1.creatorJavaAdvanced;

public class AddToArray extends ArrayModules
{

    public AddToArray(DataArrName ddataArrName,DataArrType ddataArrType)
    {
        super(ddataArrName,ddataArrType);
    
    }

    /**
     * Main function
     */
    public String mainGrabOutputVal()
    {
        String toBeReturned = "";
        
        String arrName = this.getthedataArrName().toString();
        String arrType = this.getthedataArrType().toString();
        
        toBeReturned +="public void addTo"+arrName+"("+arrType+" the"+arrType+")"+Utilities.newLine();
        toBeReturned +="{"+Utilities.newLine();
        toBeReturned +=""+arrName+".add(the"+arrType+");"+Utilities.newLine();
        toBeReturned +="}"+Utilities.newLine();
            
        if(Utilities.checkString(arrName).equals(arrName) && Utilities.checkString(arrType).equals(arrType))
        {
            this.setoutputVal(toBeReturned);
            return toBeReturned;
        }
        return "";
    }

}
