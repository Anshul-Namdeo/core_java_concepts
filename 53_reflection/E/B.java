import java.lang.reflect.Modifier;

class B 
{
    public static void main(String args[])
    {
        try{
            Class klass = Class.forName("Student");
            int code = klass.getModifiers();

            System.out.println(code);

            System.out.println(klass.getName());
            System.out.println(Modifier.toString(code));
        }catch(ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}


// D:\javaprac\53_reflection\E>javac B.java

// D:\javaprac\53_reflection\E>java B
// 17
// Student
// public final