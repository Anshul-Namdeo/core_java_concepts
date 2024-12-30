import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;

class A 
{
    public static void main(String args[]) throws InvocationTargetException, IllegalAccessException
    {
        Student x = new Student();
        x.name = "yamraj";
        x.age = 1000;

        Student y = new Student();
        y.name = "chiyragupat";
        y.age = 500;

        Class k = Student.class;

        Method[] methods = k.getDeclaredMethods();

        for(Method method : methods)
        {
            if(method.getName().equals("showName"))
            {
                String nm1 = (String)method.invoke(x);
                String nm2 = (String)method.invoke(y);

                System.out.println(nm1);
                System.out.println(nm2);
            }else 
            {
                int ag1 = (int)method.invoke(x);
                int ag2 = (int)method.invoke(y);

                System.out.println(ag1);
                System.out.println(ag2);
            }
        }
    }
}

// D:\javaprac\53_reflection\Y>javac A.java

// D:\javaprac\53_reflection\Y>java A
// 1000
// 500
// yamraj
// chiyragupat