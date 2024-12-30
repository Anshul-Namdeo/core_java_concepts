@interface Pqr 
{

}

@Pqr
class S 
{
    public static void main(String args[])
    {
        Class k = S.class;

        Object obj = k.getAnnotation(Pqr.class);
        Pqr q = (Pqr) obj;

        System.out.println(q);
    }
}

// D:\javaprac\55_annotations>javac S.java
// Note: S.java uses unchecked or unsafe operations.
// Note: Recompile with -Xlint:unchecked for details.

// D:\javaprac\55_annotations>java S
// null
