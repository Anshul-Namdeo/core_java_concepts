import java.io.IOException;
class U3
{
    public static void main(String[] args) throws Throwable {
        
        System.out.println(1);

        if(12 < 13)
        {
            // throw new ArithmeticException();
            // throw new ClassCastException();
            //throw new IOException();
            throw new Exception();
        }

        System.out.println(2);
    }
}

// D:\javaprac\33_exception_handling>javac U3.java

// D:\javaprac\33_exception_handling>java U3
// 1
// Exception in thread "main" java.lang.Exception
//         at U3.main(U3.java:13)
