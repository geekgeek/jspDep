package package1.creatorJavaAdvanced;
public abstract class SimpleData
{
    private String dataClassName;
    
    public SimpleData(String dataClassName)
    {
        this.dataClassName = dataClassName;
    }
    /**
    * set String dataClassName
    * @param String dataClassName
    */
    public void setdataClassName(String dataClassName)
    {
        this.dataClassName = dataClassName;
    }
    /**
    * @return String dataClassName
    */
    public String getdataClassName()
    {
        return dataClassName;
    }
    @Override
    public String toString()
    {
        String info ="";
        info += dataClassName;
        return info;
    }

}
