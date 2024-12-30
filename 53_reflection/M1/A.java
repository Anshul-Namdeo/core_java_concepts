import java.lang.reflect.Field;

class A 
{
    public static void main(String args[])
    {
        Class k1 = Student.class;

        Field[] fields = k1.getDeclaredFields();

        System.out.println(k1.getName() +": ");
        for(Field next : fields)
        {
            System.out.println(next.getName());
        }
    }
}


// D:\javaprac\53_reflection\M1>javac A.java

// D:\javaprac\53_reflection\M1>java A
// Student:
// college
// marks
