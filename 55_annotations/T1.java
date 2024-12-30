import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@interface Efg 
{
    String aaa() default "chitragupt";
    int bbb () default 600;
}

@Efg 
class T1 
{
    public static void main(String args[])
    {
        Class k = T1.class ;

        Object obj = k.getAnnotation(Efg.class);
        Efg q = (Efg) obj;

        System.out.println(q);
        System.out.println(q.aaa());
        System.out.println(q.bbb());
    }
}


// D:\javaprac\55_annotations>javac T1.java
// Note: T1.java uses unchecked or unsafe operations.
// Note: Recompile with -Xlint:unchecked for details.

// D:\javaprac\55_annotations>java T1
// @Efg(aaa="chitragupt", bbb=600)
// chitragupt
// 600