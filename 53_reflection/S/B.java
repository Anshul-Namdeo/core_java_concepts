import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

class B
{
    public static void main(String args[])
    {
        Class k = Student.class;

        Method[] methods = k.getDeclaredMethods();

        for(Method method : methods)
        {
             System.out.print(Modifier.toString(method.getModifiers()));

            String retype = method.getReturnType().getName();
            if(retype.contains("."))
            {
                System.out.print(" " + retype.substring(retype.lastIndexOf(".")+1) + " ");
            }else{
                System.out.print(" " + retype + " ");
            }

            System.out.println(method.getName());
        }
    }
}


// D:\javaprac\53_reflection\S>javac B.java

// D:\javaprac\53_reflection\S>java B
// final void ddd
// protected static final void eee
// abstract void aaa
// static Date ccc
// private String bbb