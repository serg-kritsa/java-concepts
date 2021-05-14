package syntax.annotations;

@interface Example01 {}
@interface Example02 {	String name();}
@interface Example03 {	String name(); String version() default "13";} // default

@Example01
@Example02(name="User")
@Example03(name="User", version="13")
public class OwnAnnotationDemo01 {
	@Example01
	@Example02(name="User")
    int data;
    
	@Example01
	@Example02(name="User")
    public static void main(@Example01 @Example02(name="User") String[] args) {
		@Example01
		@Example02(name="User")
        int x;
    }
    
}

