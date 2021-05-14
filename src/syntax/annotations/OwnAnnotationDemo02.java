package syntax.annotations;

import java.lang.annotation.Target;
import java.lang.annotation.ElementType;

@Target(value= {ElementType.LOCAL_VARIABLE,ElementType.METHOD}) // usage area
@interface Example04 {}

public class OwnAnnotationDemo02 {
    int data;
    
    @Example04
    public static void main(String[] args) {
    	@Example04
        int x;
    }
    
}

