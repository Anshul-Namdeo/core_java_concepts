import java.io.IOException;
class U8 extends RuntimeException
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
          //throw new RuntimeException();

          throw new U8();
        }

        System.out.println(2);
    }
}

// D:\javaprac\33_exception_handling>javac U8.java

// D:\javaprac\33_exception_handling>java U8
// 1
// Exception in thread "main" U8
//         at U8.main(U8.java:18)