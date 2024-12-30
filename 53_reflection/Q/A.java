import java.lang.reflect.Method;

class A 
{
    public static void main(String args[])
    {
        Class k = Student.class;

        Method[] methods = k.getMethods();

        for(Method method : methods)
        {
            System.out.println(method.getName());
        }
    }
}

// note : getMethod() sirf or sirf public method ko hi bata hai..

// D:\javaprac\53_reflection\Q>javac A.java

// D:\javaprac\53_reflection\Q>java A
// bbb
// wait
// wait
// wait
// equals
// toString
// hashCode
// getClass
// notify
// notifyAll