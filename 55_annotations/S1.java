import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@interface Ijk 
{

}

@Ijk
class S1 
{
    public static void main(String args[])
    {
        Class k = S1.class;

        Object obj = k.getAnnotation(Ijk.class);
        Ijk q = (Ijk) obj;

        System.out.println(q);
    }
}

// D:\javaprac\55_annotations>javac S1.java
// Note: S1.java uses unchecked or unsafe operations.
// Note: Recompile with -Xlint:unchecked for details.

// D:\javaprac\55_annotations>java S1
// @Ijk()
