package syntax.lang;

public class FloatDemo01 {

    public static void main(String[] args) {

        Float float11=12.3f;
        Float float12=Float.valueOf("123.5");
        float x=float12.floatValue(); // "unboxing"
        float y=float12; // floatValue() will be called automatically
        
        float float1=12.5f;
        Float float2=12.5f;
        System.out.println(float2.equals(float1)); // true
        System.out.println();
        Float float3=-12.5f/0; // float does not throw DivisionByZero exception 
        System.out.println(float3.isInfinite()); // true
        System.out.println(float3 == Float.POSITIVE_INFINITY); // false
        System.out.println(float3 == Float.NEGATIVE_INFINITY); // true
        System.out.println();
        Float float4=(float)Math.sqrt(-1); // Imaginary number 
        System.out.println(float4+" "+float4.isNaN()); // NaN true        
        Float float5=(float)Math.sqrt(9); 
        System.out.println(float5+" "+float5.isNaN()); // 3.0 false
        
        System.out.println(Float.NaN+" "+(float4==Float.NaN)+" "+(float4!=Float.NaN)); // NaN false true
    }
    
}
