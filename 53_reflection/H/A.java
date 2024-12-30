import java.lang.reflect.Modifier;

class A 
{
    public static void main(String args[])
    {
        Class k1 = Student.class;

        System.out.print(Modifier.toString(k1.getModifiers()) + " class " + k1.getName() + " extends ");

        Class pk = k1.getSuperclass();
        System.out.print(pk.getName() + " implements ");

        Class[] ks = k1.getInterfaces();
        for(Class next : ks)
        {
            System.out.print(next.getName() + " ,");
        }

        System.out.println(" {");
        System.out.println();
        System.out.println(" }");

    }
}

// D:\javaprac\53_reflection\H>javac A.java

// D:\javaprac\53_reflection\H>java A
// public final class Student extends User implements Smart ,Intelligent , {

//  }
