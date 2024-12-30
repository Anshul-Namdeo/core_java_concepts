import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

class A2
{
    public static void main(String args[])
    {
        Class k = Student.class;

        Field[] fields = k.getDeclaredFields();

        System.out.println(k.getName() + ":  --------");
        System.out.println();


        for(Field field : fields)
        {
            // System.out.println(Modifier.toString(field.getModifiers()) + " " + field.getType().getName() + " " + field.getName());

                String type = field.getType().getName();
                if(type.contains("."))
                {
                    int index = type.lastIndexOf(".");
                    String s = type.substring(index+1);
                    System.out.println(" " + s + " ");
                }
                else
                {
                     System.out.println(" " + type + " ");
                }
        }
    }
}

// Note : yaha par hum ne getType() or getName() method ka use kiya hai...

// D:\javaprac\53_reflection\O>javac A2.java

// D:\javaprac\53_reflection\O>java A2
// Student:  --------

//  String
//  float
//  String
//  int
//  String
//  Date