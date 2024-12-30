import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
// import java.lang.annotation.Inherited;

@Retention(RetentionPolicy.RUNTIME)
@interface Kejriwal 
{

}

@Kejriwal
class UV1 
{

}

class U2 extends UV1 
{
    public static void main(String args[])
    {
        Class k = UV1.class;

        Kejriwal kj = (Kejriwal)k.getAnnotation(Kejriwal.class);

        System.out.println(kj);
    }
}


// D:\javaprac\55_annotations>javac U2.java
// Note: U2.java uses unchecked or unsafe operations.
// Note: Recompile with -Xlint:unchecked for details.

// D:\javaprac\55_annotations>java U2
// @Kejriwal()