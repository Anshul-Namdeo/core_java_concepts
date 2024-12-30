import java.io.IOException;
class U5
{
    public static void main(String[] args) throws Throwable {
        
        System.out.println(1);

        if(12 < 13)
        {
            // throw new ArithmeticException();
            // throw new ClassCastException();
            //throw new IOException();
            //throw new Exception();
           // throw new Error();
           throw new AssertionError();
        }

        System.out.println(2);
    }
}


// D:\javaprac\33_exception_handling>javac U5.java

// D:\javaprac\33_exception_handling>java U5
// 1
// Exception in thread "main" java.lang.AssertionError
//         at U5.main(U5.java:15)
