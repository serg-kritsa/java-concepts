// javadocs tags
// in Eclipse - Project > Generate Javadoc... 
// documentation will be generated in doc folder

/** @author First Last Name
 *  @version 2.0
 *  @since 2015
 *  
 *  @see see
 **/
package syntax.annotations.javadocs;

/**
 * 
 * @author First Last Name
 * 
 * Class for Library Book
 */
public class Book { 
    
    /**
     * @value 10 default value
     * 
     * @link link
     * @serial serial
     */
    static int val=10;    
    
    /**
     * Parametrized Constructor
     * @param s Book Name
     */    
    public Book(String s){}
  
    /**
     * Issue a Book to a Student
     * @param roll roll number of a Student
     * @throws Exception if book is not available, throws Exception
     * 
     * @exception exception
     */
    public void issue(int roll) throws Exception{}
    
    /**
     * Check if book is available
     * @param str Book Name
     * @return if book is available returns true else false
     * 
     * @code System.out.println()
     */
    public boolean available(String str){        return true;    }
    
    /**
     * Get Book name
     * @param id book id
     * @return returns book name
     * 
     * @deprecated 
     */
    public String getName(int id){               return "";    }
}

