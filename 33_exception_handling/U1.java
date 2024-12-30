import java.io.IOException;
class U1 
{
    public static void main(String[] args) throws Throwable {
        
        System.out.println(1);

        if(12 < 13)
        {
            // throw new ArithmeticException();
            throw new ClassCastException();
        }

        System.out.println(2);
    }
}

// D:\javaprac\33_exception_handling>javac U1.java

// D:\javaprac\33_exception_handling>java U1
// 1
// Exception in thread "main" java.lang.ClassCastException
//         at U1.main(U1.java:11)
