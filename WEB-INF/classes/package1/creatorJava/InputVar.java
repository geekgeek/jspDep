/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package package1.creatorJava;

/**
 *
 * @author guest0
 */
public class InputVar
{

    private String theVar;
    
    private String word1;
    private String word2;
    private String word3;
    
    public InputVar(String theVar)
    {
        settheVar(theVar);
    
    }
    
    @Override
    public String toString()
    {
    String info ="";
    info += gettheVar();
    return info;
    }

    /**
    * @return String theVar
    */
    public String gettheVar()
    {
    return theVar;
    }
    
    /**
    * @return String word1
    */
    public String getword1()
    {
    return word1;
    }
    
    /**
    * @return String word2
    */
    public String getword2()
    {
    return word2;
    }
    
    /**
    * @return String word3
    */
    public String getword3()
    {
    return word3;
    }
    
    
    /**
    * set String word1
    * @param String word1
    */
    public void setword1(String word1)
    {
    this.word1 = word1;
    }
    
    /**
    * set String word2
    * @param String word2
    */
    public void setword2(String word2)
    {
    this.word2 = word2;
    }
    
    /**
    * set String word3
    * @param String word3
    */
    public void setword3(String word3)
    {
    this.word3 = word3;
    }
    /**
    * set String theVar
    * @param String theVar
    */
    public void settheVar(String theVar)
    {
    this.theVar = theVar;
    String[] allTheWords = theVar.split(" "); //added all words to an array
    
    this.word1 = allTheWords[0];
    this.word2 = allTheWords[1];
    this.word3 = allTheWords[2];
    }

}
