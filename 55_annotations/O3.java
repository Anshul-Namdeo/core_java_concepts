import java.lang.annotation.Target;
import java.lang.annotation.ElementType;

@Target({ElementType.TYPE, ElementType.FIELD, ElementType.CONSTRUCTOR})
@interface Bholu 
{

}

@Bholu 
class O3 
{

    @Bholu
    int a = 90;

    @Bholu
    O3()
    {

    }

    @Bholu
    void pro()
    {

    }
}


// Note :TYPE(constant) sirf or sirf class, interface, enum or annotation par applicable hai

// Note : FIELD(constant) sirf or sirf varibale Declaration par applicable hai..

// Note : CONSTRUCTOR(constant) sirf or sirf Constructor par applicable hai..



// D:\javaprac\55_annotations>javac O3.java
// O3.java:23: error: annotation type not applicable to this kind of declaration
//     @Bholu
//     ^
// 1 error
