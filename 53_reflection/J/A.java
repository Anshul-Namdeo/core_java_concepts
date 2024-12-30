import java.lang.reflect.Field;

class A 
{
    public static void main(String args[])
    {
        Class k = Student.class;

        Field[] fields = k.getDeclaredFields();

        System.out.println(k.getName() + ": ");

        for(Field next : fields)
        {
            System.out.println(next.getName());
        }
    }
}

// Note : getDeclareFields() method kissi bhi class ki (public or non-public) property ko access karne ke kam aati hai. 



// D:\javaprac\53_reflection\J>javac A.java

// D:\javaprac\53_reflection\J>java A
// Student:
// name
// age
// mobile
// marks