import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

class A 
{
    public static void main(String args[])
    {
        Class k = Student.class;

        Field[] fields = k.getDeclaredFields();

        System.out.println(k.getName());

        for(Field field : fields)
        {

       /*1)*/   System.out.println(field.getType() );
       /*2)*/   System.out.println(field.getType().getName() );
            
        }
    }
}

// Note : 1) ka output...

// D:\javaprac\53_reflection\O>javac A.java

// D:\javaprac\53_reflection\O>java A
// Student
// class java.lang.String
// float
// class java.lang.String
// int
// class java.lang.String
// class java.util.Date

// Note : 2) ka output...

// D:\javaprac\53_reflection\O>javac A.java

// D:\javaprac\53_reflection\O>java A
// Student
// java.lang.String
// float
// java.lang.String
// int
// java.lang.String
// java.util.Date