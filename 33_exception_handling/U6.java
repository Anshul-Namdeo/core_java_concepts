import java.io.IOException;
class U6
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
          // throw new AssertionError();
          throw new RuntimeException();
        }

        System.out.println(2);
    }
}


// D:\javaprac\33_exception_handling>javac U6.java

// D:\javaprac\33_exception_handling>java U6
// 1
// Exception in thread "main" java.lang.RuntimeException
//         at U6.main(U6.java:16)
