import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

class A1 
{
    public static void main(String args[])
    {
        Class k = Student.class;

        Field[] fields = k.getDeclaredFields();

        System.out.println(k.getName() + ":  --------");
        System.out.println();

        for(Field field : fields)
        {
            System.out.println(Modifier.toString(field.getModifiers()) + " " + field.getType().getName() + " " + field.getName());
        }
    }
}

// D:\javaprac\53_reflection\O>javac A1.java

// D:\javaprac\53_reflection\O>java A1
// Student:  --------

// static java.lang.String college
// private float marks
// protected java.lang.String name
// public static final int age
//  java.lang.String mobile
//  java.util.Date dob
