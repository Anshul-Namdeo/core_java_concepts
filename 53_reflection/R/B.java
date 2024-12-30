import java.lang.reflect.Method;

class B
{
    public static void main(String args[])
    {
        Class k = Student.class;

        Method[] methods = k.getDeclaredMethods();

        for(Method method : methods)
        {

            String retype = method.getReturnType().getName();
            if(retype.contains("."))
            {
                int index = retype.lastIndexOf(".");
                String s =  retype.substring(index+1);
                System.out.print(s);
            }else{
                System.out.print(retype);
            }

            System.out.println(" " +  method.getName() );
        }
    }
}



// D:\javaprac\53_reflection\R>javac B.java

// D:\javaprac\53_reflection\R>java B
// void aaa
// Date ccc
// String bbb