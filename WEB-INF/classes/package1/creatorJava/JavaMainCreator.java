/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package package1.creatorJava;
import java.util.ArrayList;
/**
 * DEPENDENCIES : package1.InputVar
 * 
 * @see package1.creatorJava.InputVar
 * @author guest0
 */
public class JavaMainCreator {
    private String inputClass;
    private String textFieldVars;
    private ArrayList<InputVar> varArr = new ArrayList<InputVar>();
    private static String newLine = "<br>"; //space
    private String theImports;
    private String theArrOutputText;//module array methods
    private String theArrOutputName;//module array methods
    private String theImportText; //module imports
    
    /**
     * Add classname and inputvars
     * need 2 textfields
     * @param inputClass
     * @param textFieldVars 
     */
    public JavaMainCreator(String inputClass,String textFieldVars)
    {
        this.setinputClass(inputClass);
        this.setTextFieldVars(textFieldVars);
    }
    /**
     * Add classname,inputvars and imports
     * Need 3 textfields
     * @param inputClass
     * @param textFieldVars 
     * @param dependencies 
     */
    public JavaMainCreator(String inputClass,String textFieldVars,String dependencies)
    {
        this.setinputClass(inputClass);
        this.setTextFieldVars(textFieldVars);
        this.getAllImports(dependencies);
    }
    
    /**
     * Add classname,inputvars,imports and arrayName plus arrayType
     * need 5 textfields
     * @param inputClass
     * @param textFieldVars 
     * @param dependencies 
     * @param addArrName 
     * @param addArrType 
     */
    public JavaMainCreator(String inputClass,String textFieldVars,String dependencies,String addArrName,String addArrType)
    {
        this.setinputClass(inputClass);
        this.setTextFieldVars(textFieldVars);
        this.getAllImports(dependencies);
        this.grabArrayMethods(addArrType, addArrName);
    }
    
    @Override
    public String toString()
    {
    String info ="";
    info += " inputClass = " + getinputClass();
    return info;
    }

    /**
     * Get all the imports
     * @return 
     */
    public String getTheImportText() {
        return theImportText;
    }

    public void setTheImportText(String theImportText) {
        this.theImportText = theImportText;
    }

    public String getTheArrOutputName() {
        return theArrOutputName;
    }

    public void setTheArrOutputName(String theArrOutputName) {
        this.theArrOutputName = theArrOutputName;
    }

    public String getTheArrOutputText() {
        return theArrOutputText;
    }

    public void setTheArrOutputText(String theArrOutputText) {
        this.theArrOutputText = theArrOutputText;
    }
    
    /**
    * @return String inputClass
    */
    public String getinputClass()
    {
    return inputClass;
    }
    
    /**
    * set String inputClass
    * @param String inputClass
    */
    public void setinputClass(String inputClass)
    {
    this.inputClass = inputClass;
    }

    public String getTextFieldVars() {
        return textFieldVars;
    }

    public void setTextFieldVars(String textFieldVars) {
        this.textFieldVars = textFieldVars;
    }
    
    /**
    * @return ArrayList varArr
    */
    public ArrayList<InputVar> getvarArr()
    {
    return varArr;
    }
    
    /**
    * set ArrayList varArr
    * @param varArr ArrayList
    */
    public void setvarArr(ArrayList<InputVar> varArr)
    {
    this.varArr = varArr;
    }

    public String getTheImports() {
        return theImports;
    }

    public void setTheImports(String theImports) {
        this.theImports = theImports;
    }
    
    /**
     * Add var to arr
     * @param var
     */
    public void addVartoArr(InputVar var)
    {
        varArr.add(var);
    }
    
    
    /**
     * Loop arr return instance var
     * sample private String name;
     */
    private String grabloopArrInstanceVar()
    {
        String toBeReturned = "";
        
        for (int i = 0; i < varArr.size(); i++) 
        {
            String w1 = varArr.get(i).getword1();
            String w2 = varArr.get(i).getword2();
            String w3 = varArr.get(i).getword3();
            
            toBeReturned +=  w1 + " " + w2 + " " + w3 + ";"+newLine;
        }

        return toBeReturned;
    }
    
    /**
     * Loop arr return constructor inside
     * 
     */
    private String returnloopArrConstrutctorInside1()
    {
        String toBeReturned = "";
        

        int start = this.getConstructorStartVal();
        
        for (int i = start; i < varArr.size(); i++) 
        {
            //String w1 = varArr.get(i).getword1();
            String w2 = varArr.get(i).getword2();
            String w3 = varArr.get(i).getword3();
            
            toBeReturned += "this."+w3+" = "+w3+";"+newLine;
        }
        
        if(this.getTheArrOutputName() != "")
        {
        toBeReturned += this.getTheArrOutputName() +" = new ArrayList<>();";
        }
        
        return toBeReturned;
    }
    
    private int getConstructorStartVal()
    {
        int startVal = 0;
        
        if(this.getTheArrOutputName() != "")
        {
            startVal = 1;
        }
        
        return startVal;
    }
    
    /**
     * Loop arr return constructor inside upper
     * 
     */
    private String returnloopArrConstrutctorInside2()
    {
        String toBeReturned = "";
        
        int start = this.getConstructorStartVal();
        
        for (int i = start; i < varArr.size(); i++) 
        {
            //String w1 = varArr.get(i).getword1();
            String w2 = varArr.get(i).getword2();
            String w3 = varArr.get(i).getword3();
            
            if(i != start)
            {
                toBeReturned += "," + w2 + " " + w3;
            }
            else
            {
                toBeReturned += w2 + " " + w3;
            }
        }

        return toBeReturned;
    }

    /**
     * @return String the constructor
     */
    private String grabConstrutctor()
    {
        String toBeReturned = "";
        
        toBeReturned +="public "+this.getinputClass()+"("+this.returnloopArrConstrutctorInside2()+")"+newLine;
        toBeReturned +="{"+newLine;
        toBeReturned += this.returnloopArrConstrutctorInside1()+newLine;
        toBeReturned +="}";
        
        return toBeReturned;
    }
    
    
    /**
     * @return String Getter methods
     */
    private String grabGetters()
    {
        String toBeReturned = "";
        
        for (int i = 0; i < varArr.size(); i++) 
        {
            //String w1 = varArr.get(i).getword1();
            String w2 = varArr.get(i).getword2();
            String w3 = varArr.get(i).getword3();
            
            toBeReturned += "/**"+newLine;
            toBeReturned += "* @return "+w2+" "+ w3+newLine;
            toBeReturned += "*/"+newLine;
            toBeReturned += "public "+w2+" get"+w3+"()"+newLine;
            toBeReturned += "{"+newLine;
            toBeReturned += "return "+w3+";"+newLine;
            toBeReturned += "}"+newLine;
        }
		
        return toBeReturned;
    }

    /**
     * @return String Setter methods
     */
    private String grabSetters()
    {
        String toBeReturned = "";
        
        for (int i = 0; i < varArr.size(); i++) 
        {
            //String w1 = varArr.get(i).getword1();
            String w2 = varArr.get(i).getword2();
            String w3 = varArr.get(i).getword3();
            
    	    toBeReturned+="/**"+newLine;
            toBeReturned+="* set "+w2+" "+w3+newLine;
            toBeReturned+="* @param "+w2+" "+w3+newLine;
            toBeReturned+="*/"+newLine;
            toBeReturned+="public void set"+w3+"("+w2+" "+w3+")"+newLine;
            toBeReturned+="{"+newLine;
            toBeReturned+="this."+w3+" = "+w3+";"+newLine;
            toBeReturned+="}"+newLine;
        }

        return toBeReturned;
    }
    
    /**
     * @return String setters + getters
     * @see this.grabGetters()
     * @see this.grabSetters()
     */
    private String grabGetterandSetters()
    {
        String toBeReturned = "";
        
        String getters = this.grabGetters();
        String setters = this.grabSetters();
        
        
        toBeReturned += getters;
        toBeReturned += newLine + newLine;
        toBeReturned += setters;
        
        return toBeReturned;
    }
    
    /**
     * @return String toString
     */
    private String grabtoString()
    {
        String toBeReturned = "";
        
        toBeReturned += "@Override"+ newLine;
        toBeReturned += "public String toString()"+ newLine;
        toBeReturned += "{"+ newLine;
        toBeReturned += "String info ="+'"'+'"'+";"+ newLine;
            
        for (int i = 0; i < varArr.size(); i++) 
        {
            //String w1 = varArr.get(i).getword1();
            String w2 = varArr.get(i).getword2();
            String w3 = varArr.get(i).getword3();
            
            toBeReturned += "info += " +'"'+ " " +w3+" = "+'"'+" + "+w3+";"+ newLine;
        }
        toBeReturned += "return info;"+ newLine;
        toBeReturned += "}"+ newLine;

        return toBeReturned;
    }
    
    /**
     * Grab everything
     *
     * @see this.grabloopArrInstanceVar()
     * @see this.grabConstrutctor()
     * @see this.grabGetterandSetters()
     * @see this.grabtoString()
     */
    private String grabEverything()
    {
        String toBeReturned = "";
        
        toBeReturned += this.grabloopArrInstanceVar()+newLine;
        toBeReturned += this.grabConstrutctor() +newLine +newLine;
        toBeReturned += this.grabGetterandSetters()+newLine;
        toBeReturned += this.grabtoString();
        
        
        if(this.getTheArrOutputText() != null)
        {
        toBeReturned += this.getTheArrOutputText();
        }
        
        return toBeReturned;
    }
    
    /**
     * Grabs everything and returns a full class
     * @see this.grabEverything()
     */
    private String grabEverythingFull()
    {
        String toBeReturned = "";
        
        toBeReturned += "public class "+this.getinputClass()+newLine;
        toBeReturned += "{"+newLine;
        toBeReturned += this.grabEverything()  +newLine;
        toBeReturned += "}";
        
        return toBeReturned;
    }
    
    /**
     * Returns the full java class
     * @param textClassName
     * @param textFieldVars
     * @return 
     */
    public String setmainJavaClassGenerator(String textClassName,String textFieldVars)
    {
        this.setinputClass(textClassName);
        this.setTextFieldVars(textFieldVars);
        
        String toBeReturned = "";
        String splitSign = ",";
        
        String[] splitArr = this.textFieldVars.split(splitSign);

        
        for(int i=0; i < splitArr.length;i++)
        {
            this.addVartoArr(new InputVar(splitArr[i]));//panel
        }
        
        toBeReturned = this.grabEverythingFull();
        
        System.out.println(toBeReturned);
        
        return toBeReturned;
    }
    
    /**
     * Returns the full java class
     * need 2 textfields
     * @return String the full java class
     * @see this.grabEverythingFull()
     */
    public String getmainJavaClassGenerator()
    {

        String toBeReturned = "";
        String splitSign = ",";
        
        String[] splitArr = this.textFieldVars.split(splitSign);

        
        for(int i=0; i < splitArr.length;i++)
        {
            this.addVartoArr(new InputVar(splitArr[i]));//panel
        }
        
        toBeReturned = this.grabEverythingFull();
        
        return toBeReturned;
    }
    
    /**
     * Returns the full java class included imports
     * Need 3 textfield
     * @return String the full java class
     * @see this.grabEverythingFull()
     */
    public String getmainJavaClassGeneratorPlusImports()
    {

        String toBeReturned = "";
        toBeReturned += this.getTheImportText() + newLine;
        toBeReturned += this.getmainJavaClassGenerator();
        
        return toBeReturned;
    }
    /**
     * 
     * @return String lines 
     */
    public String countLines()
    {    
        String toBeReturned;
        
        String str = this.grabEverythingFull();
        String findStr = newLine;
        int lastIndex = 0;
        int count = 0;

        while (lastIndex != -1) 
        {

            lastIndex = str.indexOf(findStr, lastIndex);

            if (lastIndex != -1) {
                count++;
                lastIndex += findStr.length();
            }
        }
        
        toBeReturned = Integer.toString(count + 1);
        
        return toBeReturned;
    }
    

    /**
     * Generate import vals. Separate by komma.
     * @param textFieldVars
     * @return 
     */
    public String getAllImports(String textFieldVars)
    {
        this.setTheImports(textFieldVars);
         
        String toBeReturned = "";
        String splitSign = ",";
        if(this.getTheImports().length() != 0)
        {
            String[] splitArr = this.getTheImports().split(splitSign);


            for(int i=0; i < splitArr.length;i++)
            {
               toBeReturned += "import " + splitArr[i] + ";" + newLine;
            }
            setTheImportText(toBeReturned);
            return toBeReturned;
        }
        setTheImportText(toBeReturned);
        return "";
        
    }
    
    /**
     * Grab some array methods and puts it in the main method
     * @param arrType
     * @param arrName 
     */
    public void grabArrayMethods(String arrType,String arrName)
    {
        String toBeReturned = "";
        String spec1 = "&#60;"; //<
        String spec2 = "&#62;"; //>

        try {
            this.setTheArrOutputName(arrName);
            String theVarToAdd = "private ArrayList"+spec1+arrType+spec2+" "+arrName;

            this.addVartoArr(new InputVar(theVarToAdd));

            toBeReturned += newLine;
            toBeReturned +="public void addTo"+arrName+"("+arrType+" the"+arrType+")"+newLine;
            toBeReturned +="{"+newLine;
            toBeReturned +=""+arrName+".add(the"+arrType+");"+newLine;
            toBeReturned +="}"+newLine;


            toBeReturned += newLine;
            toBeReturned +="public void loop"+arrName+"()"+newLine;
            toBeReturned +="{"+newLine;
            toBeReturned +="for(int i=0; i < "+arrName+".size(); i++)"+newLine;
            toBeReturned +="{"+newLine;
            toBeReturned +="System.out.println("+arrName+".get(i));"+newLine;
            toBeReturned +="}"+newLine;
            toBeReturned +="}"+newLine;

            setTheArrOutputText(toBeReturned);
        
        } 
        catch (Exception e) 
        {
            setTheArrOutputText("");
        }
        

    }
    
}
