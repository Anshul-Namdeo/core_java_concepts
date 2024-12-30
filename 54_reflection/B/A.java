import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

class A 
{
    public static void main(String args[])
    {
        Class k = Student.class;

        Constructor[] constructors = k.getDeclaredConstructors();

        for(Constructor constructor : constructors)
        {
            System.out.println( Modifier.toString(constructor.getModifiers()) + " " + constructor.getName()+ "()" + " " + "{");
            System.out.println();
            System.out.println();
            System.out.println("}");

        }
    }
}


// D:\javaprac\54_reflection\B>javac A.java

// D:\javaprac\54_reflection\B>java A
// public Student() {


// }
// private Student() {


// }
// protected Student() {


// }