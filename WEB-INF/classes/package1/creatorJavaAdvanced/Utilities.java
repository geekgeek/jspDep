package package1.creatorJavaAdvanced;
/**
 * En hjelpeklasse for statiske metoder
 * No dependencies
 */
public class Utilities 
{

    private static final String newLine = "<br>"; //<br>
    private static final String spec1 = "&#60;"; //"&#60;" <
    private static final String spec2 = "&#62;"; //"&#62;" >
    /**
     * Metode for å rense et negativ til til 0
     * @param value et tall
     * @return 0 hvis value < 0, hvis ikke tallet selv
     */
    public static int cleanNegative(int value) {
        if(value < 0) {
            return 0;
        }
        return value;
    }

    /**
     * Metode for å sjekke at en string ikke er tom.
     * @param string stringen vi vil sjekke
     * @return unspecified hvis stringen er tom, hvis ikke verdien til stringen.
     */
    public static String checkString(String string) {
        if(string == null || string.isEmpty()) {
            return "Unspecified";
        } else {
            return string;
        }
    }
    
    /**
     * Generates new line
     */
    public static String newLine()
    {
        return newLine;
    }
    //SPECIAL Characters
    /**
     * return <
     */
    public static String spec1()
    {
        return spec1;
    }
    /**
     * return >
     */
    public static String spec2()
    {
        return spec2;
    }
    
    
    
}