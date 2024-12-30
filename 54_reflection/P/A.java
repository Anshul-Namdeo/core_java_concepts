import java.lang.annotation.Annotation;

class A 
{
    public static void main(String args[])
    {
        Class k = User.class;

        Annotation[] ants = k.getAnnotations();

        for(Annotation ant : ants)
        {
            System.out.println(ant);
        }
    }
}

// D:\javaprac\54_reflection\P>javac A.java
// Note: A.java uses or overrides a deprecated API.
// Note: Recompile with -Xlint:deprecation for details.

// D:\javaprac\54_reflection\P>java A
// @java.lang.Deprecated(forRemoval=false, since="")
// @java.lang.FunctionalInterface()