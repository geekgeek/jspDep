package package1.creatorJavaScript;

/**
 * NO DEPENDENCIES
 * Creates javascript class 
 * with protoype methods
 * 
 */
public class JSclassCreator
{
    // instance variables - replace the example below with your own
     private String inputVariables;
     private String inputClassName;
     private String[] allTheWords;
     private static final String SPACE = "&nbsp; &nbsp; &nbsp;";
    /**
     * Constructor for objects of class JSclassCreator
     * Lager javascript classer
     * Ta inn variablene med mellomrom = var1 var2 var3
     * 
     * @param className String name of the class
     * @param variables String variables inside class
     * 
     * @see setInputClassName
     * @see setInputVariables
     */
    public JSclassCreator(String className, String variables)
    {
        this.setInputClassName(className);
        this.setInputVariables(variables);
    }
    
    /**
     * @return String inputVariables
     */
    public String getInputVariables()
    {
          return inputVariables;
    }
    
    /**
     * set String inputVariables
     * @param inputVariables
     */
    public void setInputVariables(String inputVariables)
    {
          this.inputVariables = inputVariables;
    }
    
    /**
     * @return String inputClassName
     */
    public String getInputClassName()
    {
          return inputClassName;
    }
    
    /**
     * set String inputClassName
     * @param inputClassName
     */
    public void setInputClassName(String inputClassName)
    {
          this.inputClassName = inputClassName;
    }
    
    /**
     * @return String[] allTheWords
     */
    private String[] getAllTheWords()
    {
          return allTheWords;
    }
    
    /**
     * set String[] allTheWords
     * @param String[] allTheWords
     */
    private void setAllTheWords(String[] allTheWords)
    {
          this.allTheWords = allTheWords;
    }

    /**
     * Return String javascript class
     * 
     * @see getInputClassName()
     * @see convertedVars()
     * @see convertedVarsMain()
     * 
     * @return String jsString
     */
    private String outputJSclass()
    {
        String jsString = "var "+this.getInputClassName()+ " = function("+convertedVars()+")<br>"+
        "{<br>"+ this.convertedVarsMain()+
        "}<br>";
        return jsString;
    }
    
    /**
     * javascript class friendly variables
     * 
     * @see getInputVariables()
     * 
     * @return String convertedWords
     */
    private String convertedVars()
    {
        String allVariables = this.getInputVariables();
        
        allTheWords = allVariables.split(" ");
        
        int wordLength = allTheWords.length;
        
        String convertedWords = "";
         for(int i=0; i<wordLength; i++)
         {
             
            
            if(i < 1)
            {
                convertedWords = convertedWords + allTheWords[i];
            }
            else
            {
                convertedWords = convertedWords +"," +allTheWords[i];
            }
         }
         
         return convertedWords;
    }
    
     /**
     * 
     * javascript class friendly variables
     * 
     * @see getInputVariables()
     * 
     * @return String convertedWords
     */
    private String convertedVarsForObject()
    {
        String allVariables = this.getInputVariables();
        
        allTheWords = allVariables.split(" ");
        
        int wordLength = allTheWords.length;
        
        String convertedWords = "";
         for(int i=0; i<wordLength; i++)
         {
             
            
            if(i < 1)
            {
                convertedWords = convertedWords +'"'+allTheWords[i]+'"';
            }
            else
            {
                convertedWords = convertedWords +","+'"'+allTheWords[i]+'"';
            }
         }
         
         return convertedWords;
    }
    
    /**
     * javascript class friendly variables inside brackets
     * 
     * @see getInputVariables()
     * 
     * @return String convertedWords
     */
    private String convertedVarsMain()
    {
        String allVariables = this.getInputVariables();
        
        allTheWords = allVariables.split(" ");
        
        int wordLength = allTheWords.length;
        
        String convertedWords = "";
         for(int i=0; i<wordLength; i++)
         {
                convertedWords = convertedWords + SPACE +"   this."+allTheWords[i]+" = "+allTheWords[i]+";<br>";
         }
         
         return convertedWords;
    }
    
    /**
     * javascript object without a name. 
     * Generates an anonymous javascript object
     * 
     * @see getInputClassName()
     * @see convertedVarsForObject()
     * 
     * @return String jsObject1 sample of javascript object without a name
     */
    private String outputJSobjectSampleAnonymous()
    {
        String jsObject1;
        
        jsObject1 = "new "+this.getInputClassName()+"("+this.convertedVarsForObject()+");";
        
        return jsObject1;
    }
    
    /**
     * javascript object with name
     * 
     * @see getInputClassName()
     * @see convertedVarsForObject()
     * 
     * @return String jsObject1 sample of javascript object with name
     */
    private String outputJSobjectSampleNamed()
    {
        String jsObject1;
        
        jsObject1 = "var sample"+this.getInputClassName()+" = new "+this.getInputClassName()+"("+this.convertedVarsForObject()+");";
        
        return jsObject1;
    }
    
    /**
     * javascript prototype getters functions
     * 
     * @see getInputVariables()
     * @see getInputClassName()
     * 
     * @return String convertedWords 
     */
    private String convertedVarsPrototypeGetters()
    {
        String allVariables = this.getInputVariables();
        
        allTheWords = allVariables.split(" ");
        
        int wordLength = allTheWords.length;
        
        String convertedWords = "";
         for(int i=0; i<wordLength; i++)
         {
                String capFirst = firstWordCapitalize(allTheWords[i]);
                 convertedWords = convertedWords + this.getInputClassName()+".prototype.get"+capFirst+" = function()<br>"+
                     "{<br>"+
                     SPACE + "  return this."+allTheWords[i]+";<br>"+
                     "};<br><br>";
         }
         
         return convertedWords;
    }
    
    
    /**
     * javascript prototype setters functions
     * 
     * @see getInputVariables()
     * @see getInputClassName()
     * 
     * @return String convertedWords 
     */
    private String convertedVarsPrototypeSetters()
    {
        String allVariables = this.getInputVariables();
        
        allTheWords = allVariables.split(" ");
        
        int wordLength = allTheWords.length;
        
        String convertedWords = "";
         for(int i=0; i<wordLength; i++)
         {
                String capFirst = firstWordCapitalize(allTheWords[i]);
                 convertedWords = convertedWords + this.getInputClassName()+".prototype.set"+capFirst+" = function("+allTheWords[i]+")<br>"+
                     "{<br>"+
                     SPACE + "  this."+allTheWords[i]+" = "+allTheWords[i]+";<br>"+
                     "};<br><br>";
         }
         
         return convertedWords;
    }
    
    /**
     * get JS Class,setter and getter,one anonymous javascript object 
     * one named javascript object. 
     * All with encapsulation
     * 
     * @see getInputClassName()
     * @see outputJSclass()
     * @see outputJSProtoTypeSetterAndGetters()
     * @see outputJSobjectSampleAnonymous()
     * @see outputJSobjectSampleNamed()
     * 
     * @return String allStuff encapsulated javascript String
     */
    public String outputJSEncapsulated()
    {
        String allStuff;
        String encapsulateStart;
        String encapsulateEnd;
        
        encapsulateStart = "function main"+this.getInputClassName()+"()<br>{<br>";
        encapsulateEnd = "<br>}";
        
        allStuff = encapsulateStart;
        
        allStuff = allStuff + this.outputJSclass()+ "<br>";
        allStuff = allStuff + this.outputJSProtoTypeSetterAndGetters();
        allStuff = allStuff + this.outputJSobjectSampleAnonymous()+ "<br>";
        allStuff = allStuff + this.outputJSobjectSampleNamed();
        
        allStuff = allStuff + encapsulateEnd;
        
        return allStuff;
    }
    
    /**
     * get JS Class plus setter and getter
     * 
     * @see outputJSclass()
     * @see outputJSProtoTypeSetterAndGetters()
     * 
     * @return String allStuff JS class plus setter and getter
     */
    private String ouputJSClassAndSetterGetters()
    {
        String allStuff = "";
        
        allStuff = allStuff + this.outputJSclass()+ "<br>";
        allStuff = allStuff + this.outputJSProtoTypeSetterAndGetters();
        
        return allStuff;
    }
    
    /**
     * return String prototype setter and getter
     * 
     * @see convertedVarsPrototypeGetters()
     * @see convertedVarsPrototypeSetters()
     * 
     * @return String prototype setter and getter
     */
    private String outputJSProtoTypeSetterAndGetters()
    {
        return this.convertedVarsPrototypeGetters() + this.convertedVarsPrototypeSetters();
    }
    
    /**
     * @see outputJSclass()
     * @return String outputJSclass()
     * 
     */
    @Override
    public String toString()
    {
        return outputJSclass();
    }

    
    /**
     * 
     * @return String lines 
     */
    public String countLines()
    {    
        String toBeReturned;
        
        String str = this.outputJSEncapsulated();
        String findStr = "<br>";
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
     * Make first letter in word uppercase
     * @param theWord
     * @return 
     */
    private String firstWordCapitalize(String theWord)
    {
        String name = theWord;
        String toBeReturned = "";

        String s1 = name.substring(0,1).toUpperCase();
        String restString = name.substring(1);
        
        toBeReturned = toBeReturned + s1;
        toBeReturned = toBeReturned + restString;
        
        return toBeReturned;
    }

}
