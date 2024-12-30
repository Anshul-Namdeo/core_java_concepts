import java.lang.reflect.Field;

class A 
{
    public static void main(String args[])
    {
        Student x = new Student();
        x.name = "yamraj";
        x.age = 1000;

        Student y = new Student();
        y.name = "chitragupat";
        y.age = 500;

        Class k = x.getClass();

        Field[] fields = k.getDeclaredFields();

        System.out.println(fields[0].get(x));
        System.out.println(fields[1].get(x));
    }
}

// D:\javaprac\53_reflection\P>javac A.java
// A.java:19: error: unreported exception IllegalAccessException; must be caught or declared to be thrown
//         System.out.println(fields[0].get(x));
//                                         ^
// A.java:20: error: unreported exception IllegalAccessException; must be caught or declared to be thrown
//         System.out.println(fields[1].get(x));
//                                         ^
// 2 errors
