import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

class B 
{
    public static void main(String args[])
    {
        Class k = Student.class;

        Field[] fields = k.getDeclaredFields();

        System.out.println(k.getName() + ":  -----------------------------");
        System.out.println();

        for(Field field : fields)
        {
            System.out.print(Modifier.toString(field.getModifiers()));

            String type = field.getType().getName();
            if(type.contains("."))
            {
                System.out.print( " " + type.substring(type.lastIndexOf(".")+1) + " ");
            }else{
                System.out.print( " " + type + " ");
            }

            System.out.println(field.getName());
        }

        
    }
}


// D:\javaprac\53_reflection\O>javac B.java

// D:\javaprac\53_reflection\O>java B
// Student:  -----------------------------

// static String college
// private float marks
// protected String name
// public static final int age
//  String mobile
//  Date dob
