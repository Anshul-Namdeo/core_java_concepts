import java.io.IOException;
class U4
{
    public static void main(String[] args) throws Throwable {
        
        System.out.println(1);

        if(12 < 13)
        {
            // throw new ArithmeticException();
            // throw new ClassCastException();
            //throw new IOException();
            //throw new Exception();
            throw new Error();
        }

        System.out.println(2);
    }
}


// D:\javaprac\33_exception_handling>javac U4.java

// D:\javaprac\33_exception_handling>java U4
// 1
// Exception in thread "main" java.lang.Error
//         at U4.main(U4.java:14)
