import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
// import java.lang.annotation.Inherited;

@Retention(RetentionPolicy.RUNTIME)
@interface  Kejriwal
{

}

@ Kejriwal 
class UV 
{

}

class U1 extends UV 
{
    public static void main(String args[])
    {
        Class k = U1.class;

        Kejriwal kj = (Kejriwal)k.getAnnotation(Kejriwal.class);

        System.out.println(kj);
    }
}

// D:\javaprac\55_annotations>javac U1.java
// Note: U1.java uses unchecked or unsafe operations.
// Note: Recompile with -Xlint:unchecked for details.

// D:\javaprac\55_annotations>java U1
// null