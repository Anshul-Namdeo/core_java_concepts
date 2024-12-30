import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

class B1
{
    public static void main(String args[])
    {
        Class k = Student.class;

        Field[] fields = k.getDeclaredFields();

        System.out.println(k.getName() + ":  --------");
        System.out.println();


        for(Field field : fields)
        {
            System.out.print(Modifier.toString(field.getModifiers()));

                String type = field.getType().getName();
                if(type.contains("."))
                {
                    int index = type.lastIndexOf(".");
                    String s = type.substring(index+1);
                    System.out.print(" " + s + " ");
                }
                else
                {
                     System.out.print(" " + type + " ");
                }

                System.out.println(field.getName());
        }
    }
}


// D:\javaprac\53_reflection\O>javac B1.java

// D:\javaprac\53_reflection\O>java B1
// Student:  --------

// static String college
// private float marks
// protected String name
// public static final int age
//  String mobile
//  Date dob