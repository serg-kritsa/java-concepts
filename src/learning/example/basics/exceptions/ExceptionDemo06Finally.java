package learning.example.basics.exceptions;

public class ExceptionDemo06Finally{
    static void meth1()throws Exception{
//////////////////////////    	try-catch ////////////////////////////////////////////////
//        try{        	System.out.println(10/5);      }  // 1) 
//        catch(Exception e){        	System.out.println(e);        }
//   	 	System.out.println("after try-catch the code is always reachable"); // 2)

//        try{        	System.out.println(10/0);        }
//        catch(Exception e){
//        	System.out.println(e); // 1) exception info is printed
//        }
//   	 	System.out.println("after try-catch the code is always reachable"); // 2)

//////////////////////////		try-finally ////////////////////////////////////////////////
//        try{        	System.out.println(10/5);        } // 1)
//        finally{        	System.out.println("finally");        } // 2) // always executed 
//        System.out.println("after try-finally"); // 3)

//        try{        	System.out.println(10/0);        }
//        finally{        	System.out.println("finally");        } // 1) // always executed 
//        System.out.println("after try-finally"); // then exception info is printed
        
//////////////////////////		try-catch-finally //////////////////////////////////////////
//        try{        	System.out.println(10/5);        } // 1) 
//        catch(Exception e){        	System.out.println(e);        }
//        finally{        	System.out.println("finally");        } // 2)
        
//        try{        	System.out.println(10/0);        } // 1) 
//        catch(Exception e){        	System.out.println(e);        }
//        finally{        	System.out.println("finally");        } // 2)
//        // then exception info is printed
        
    	 System.out.println("end of method");        
    }
    
    public static void main(String[] args) throws Exception{
        meth1();
    }   
}
