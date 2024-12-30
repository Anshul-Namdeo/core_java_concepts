import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Inherited;

@Inherited
@Retention(RetentionPolicy.RUNTIME)
@interface Kejriwal 
{

}

@Kejriwal
class UV1 
{

}

class U3 extends UV1 
{
    public static void main(String args[])
    {
        Class k = U3.class;

        Kejriwal kj = (Kejriwal)k.getAnnotation(Kejriwal.class);

        System.out.println(kj);
    }
}


// D:\javaprac\55_annotations>javac U3.java
// Note: U3.java uses unchecked or unsafe operations.
// Note: Recompile with -Xlint:unchecked for details.

// D:\javaprac\55_annotations>java U3
// @Kejriwal()