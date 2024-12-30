import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

class A 
{
    public static void main(String args[])
    {
        Class k = Student.class;

        Field[] fields = k.getDeclaredFields();

        System.out.println(k.getName());
        System.out.println();

        for(Field field : fields)
        {
            System.out.println(Modifier.toString(field.getModifiers()) + " " + field.getName());
        }
    }
}

/// NOTE : getModifiers() or getDeclareFields() method ko hum ne seekha hai...


// D:\javaprac\53_reflection\N>javac A.java

// D:\javaprac\53_reflection\N>java A
// Student

// static college
// private marks
// protected name
// public static final age
//  mobile