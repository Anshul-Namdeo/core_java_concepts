import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@interface Klm 
{
    String aaa();
    int bbb();
}

@Klm(aaa="yam", bbb=1000)
class T 
{
    public static void main(String args[])
    {
        Class k = T.class ;

        Object obj = k.getAnnotation(Klm.class);
        Klm q = (Klm) obj;

        System.out.println(q);
        System.out.println(q.aaa());
        System.out.println(q.bbb());
    }
}



// D:\javaprac\55_annotations>javac T.java
// Note: T.java uses unchecked or unsafe operations.
// Note: Recompile with -Xlint:unchecked for details.

// D:\javaprac\55_annotations>java T
// @Klm(aaa="yam", bbb=1000)
// yam
// 1000
