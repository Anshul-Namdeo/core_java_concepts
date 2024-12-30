import java.io.IOException;
class U7
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

          throw new U7();
        }

        System.out.println(2);
    }
}

// D:\javaprac\33_exception_handling>javac U7.java
// U7.java:18: error: incompatible types: U7 cannot be converted to Throwable
//           throw new U7();
//           ^
// 1 error