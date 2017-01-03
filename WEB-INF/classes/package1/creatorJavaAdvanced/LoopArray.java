package package1.creatorJavaAdvanced;
public class LoopArray extends ArrayModules
{

    
    public LoopArray(DataArrName ddataArrName,DataArrType ddataArrType)
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
        
            toBeReturned += Utilities.newLine();
            toBeReturned +="public void loop"+arrName+"()"+Utilities.newLine();;
            toBeReturned +="{"+Utilities.newLine();;
            toBeReturned +="for(int i=0; i < "+arrName+".size(); i++)"+Utilities.newLine();;
            toBeReturned +="{"+Utilities.newLine();;
            toBeReturned +="System.out.println("+arrName+".get(i));"+Utilities.newLine();;
            toBeReturned +="}"+Utilities.newLine();;
            toBeReturned +="}"+Utilities.newLine();;
            
        if(Utilities.checkString(arrName).equals(arrName) && Utilities.checkString(arrType).equals(arrType))
        {
            this.setoutputVal(toBeReturned);
            return toBeReturned;
        }
        return "";
    }

}
