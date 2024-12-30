import java.lang.annotation.Target;
import java.lang.annotation.ElementType;

@Target({ElementType.TYPE, ElementType.FIELD})
@interface Dholu 
{

}

@Dholu
class O2 
{

    @Dholu
    int a = 90;

    @Dholu 
    O2()
    {

    }

    @Dholu
    void pro()
    {

    }
}

// Note :TYPE(constant) sirf or sirf class, interface, enum or annotation par applicable hai

// Note : FIELD(constant) sirf or sirf varibale Declaration par applicable hai


// D:\javaprac\55_annotations>javac O2.java
// O2.java:17: error: annotation type not applicable to this kind of declaration
//     @Dholu
//     ^
// O2.java:23: error: annotation type not applicable to this kind of declaration
//     @Dholu
//     ^
// 2 errors
