import java.lang.reflect.Field;

class A 
{
    public static void main(String args[])
    {
        Class k = Student.class;

        Field[] fields = k.getFields();

        System.out.println(k.getName() + ": ");
        for(Field next : fields) 
        {
            System.out.println(next.getName());
        }
    }
}


// D:\javaprac\53_reflection\I>javac A.java

// D:\javaprac\53_reflection\I>java A
// Student:
// name
// marks


// Note : getField() method kissi class ki Public property ko get karne ke kam aati hai..
