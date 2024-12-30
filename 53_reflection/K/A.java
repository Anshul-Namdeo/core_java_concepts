import java.lang.reflect.Field;

class A 
{
    public static void main(String args[])
    {
        Class k = Student.class;

        Field[] fields = k.getFields();

        System.out.println(k.getName() + ": ");
        for(Field next : fields )
        {
            System.out.println(next.getName());
        }
    }
}

// Note : getFields() method jis bhi class ke object ke context mai run hogi to wo usa class ke or usa ki parent class ke public property ko acces kr ti hai..

// D:\javaprac\53_reflection\K>javac A.java

// D:\javaprac\53_reflection\K>java A
// Student:
// marks
// name
// mobile
