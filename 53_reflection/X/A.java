import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;

class A 
{
    public static void main(String args[]) throws IllegalAccessException, InvocationTargetException
    {
        Student x = new Student();
        x.name = "yamraj";

        Student y = new Student();
        y.name = "chitragupat";

        Class k = Student.class;

        Method[] methods = k.getDeclaredMethods();

        methods[0].invoke(x, 21, 99.76f, "yampuri");
        methods[0].invoke(y, 19, 92.45f, "yampuniv");
    }
}

// D:\javaprac\53_reflection\X>javac A.java

// D:\javaprac\53_reflection\X>java A
// yamraj---21--99.76--yampuri
// chitragupat---19--92.45--yampuniv