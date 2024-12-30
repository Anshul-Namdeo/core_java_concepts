import java.lang.annotation.Target;
import java.lang.annotation.ElementType;


@Target(ElementType.TYPE)
@interface Raju 
{

}

@Raju 
class O 
{
    @Raju 
    int e = 90;

    @Raju
    O()
    {

    }

    @Raju
    void pro()
    {

    }
}

// Note : TYPE(constant) sirf or sirf class, interface, enum or annotation par applicable hai


// D:\javaprac\55_annotations>javac O.java
// O.java:14: error: annotation type not applicable to this kind of declaration
//     @Raju
//     ^
// O.java:17: error: annotation type not applicable to this kind of declaration
//     @Raju
//     ^
// O.java:23: error: annotation type not applicable to this kind of declaration
//     @Raju
//     ^
// 3 errors