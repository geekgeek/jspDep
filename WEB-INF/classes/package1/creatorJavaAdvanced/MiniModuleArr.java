package package1.creatorJavaAdvanced;
public class MiniModuleArr implements StandardMethods
{
    private DataArrName ArrName;
    private DataArrType ArrType;
    
    private AddToArray theAddToArray;
    private LoopArray theLoopArray;
    private GetNumberOfArrayItems theArrItems;
    private GetIndexInArr theGetIndexInArr;
    private RemoveArrAtIndex theRemoveArrAtIndex;
    private String outputVal;
    
    public MiniModuleArr(String ddataArrName,String ddataArrType)
    {
         this.ArrName = new DataArrName(ddataArrName);
         this.ArrType = new DataArrType(ddataArrType);
        
        this.theAddToArray = new AddToArray(ArrName,ArrType);
        this.theLoopArray = new LoopArray(ArrName,ArrType);
        this.theArrItems = new GetNumberOfArrayItems(ArrName,ArrType);
        this.theGetIndexInArr = new GetIndexInArr(ArrName,ArrType);
        this.theRemoveArrAtIndex = new RemoveArrAtIndex(ArrName,ArrType);
    
    }
    /**
    * set AddToArray theAddToArray
    * @param AddToArray theAddToArray
    */
    public void settheAddToArray(AddToArray theAddToArray)
    {
        this.theAddToArray = theAddToArray;
    }
    /**
    * set LoopArray theLoopArray
    * @param LoopArray theLoopArray
    */
    public void settheLoopArray(LoopArray theLoopArray)
    {
        this.theLoopArray = theLoopArray;
    }
    /**
    * set GetNumberOfArrayItems theArrItems
    * @param GetNumberOfArrayItems theArrItems
    */
    public void settheArrItems(GetNumberOfArrayItems theArrItems)
    {
        this.theArrItems = theArrItems;
    }
    /**
    * set GetIndexInArr theGetIndexInArr
    * @param GetIndexInArr theGetIndexInArr
    */
    public void settheGetIndexInArr(GetIndexInArr theGetIndexInArr)
    {
        this.theGetIndexInArr = theGetIndexInArr;
    }
    /**
    * set RemoveArrAtIndex theRemoveArrAtIndex
    * @param RemoveArrAtIndex theRemoveArrAtIndex
    */
    public void settheRemoveArrAtIndex(RemoveArrAtIndex theRemoveArrAtIndex)
    {
        this.theRemoveArrAtIndex = theRemoveArrAtIndex;
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
    * @return AddToArray theAddToArray
    */
    public AddToArray gettheAddToArray()
    {
        return theAddToArray;
    }
    /**
    * @return LoopArray theLoopArray
    */
    public LoopArray gettheLoopArray()
    {
        return theLoopArray;
    }
    /**
    * @return GetNumberOfArrayItems theArrItems
    */
    public GetNumberOfArrayItems gettheArrItems()
    {
        return theArrItems;
    }
    /**
    * @return GetIndexInArr theGetIndexInArr
    */
    public GetIndexInArr gettheGetIndexInArr()
    {
        return theGetIndexInArr;
    }
    /**
    * @return RemoveArrAtIndex theRemoveArrAtIndex
    */
    public RemoveArrAtIndex gettheRemoveArrAtIndex()
    {
        return theRemoveArrAtIndex;
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
        info += theAddToArray;
        info += theLoopArray;
        info += theArrItems;
        info += theGetIndexInArr;
        info += theRemoveArrAtIndex;
        info += outputVal;
        return info;
    }
    
        /**
     * Need 5 textboxes
     * Returns class + array + imports
     */
    public String mainGrabOutputVal()
    {
        String toBeReturned = "";
        String arrName = this.ArrName.toString();
        String arrType = this.ArrType.toString();
        
        toBeReturned += Utilities.newLine();
        toBeReturned += theAddToArray + Utilities.newLine();
        toBeReturned += theLoopArray + Utilities.newLine();
        toBeReturned += theArrItems + Utilities.newLine();
        toBeReturned += theGetIndexInArr + Utilities.newLine();
        toBeReturned += theRemoveArrAtIndex + Utilities.newLine();
        
        if(Utilities.checkString(arrName).equals(arrName) && Utilities.checkString(arrType).equals(arrType))
        {
            this.setoutputVal(toBeReturned);
            return toBeReturned;
        }
        return "";
    }
    
    public void printMain()
    {
        System.out.println(mainGrabOutputVal());
    }

}