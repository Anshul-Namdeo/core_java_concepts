import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;


@interface  Kejriwal
{

}

@ Kejriwal 
class UV 
{

}

class U extends UV 
{
    public static void main(String args[])
    {
        Class k = U.class;

        Kejriwal kj = (Kejriwal)k.getAnnotation(Kejriwal.class);

        System.out.println(kj);
    }
}


// D:\javaprac\55_annotations>javac U.java
// Note: U.java uses unchecked or unsafe operations.
// Note: Recompile with -Xlint:unchecked for details.

// D:\javaprac\55_annotations>java U
// null
