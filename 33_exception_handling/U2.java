import java.io.IOException;
class U2
{
    public static void main(String[] args) throws Throwable {
        
        System.out.println(1);

        if(12 < 13)
        {
            // throw new ArithmeticException();
            // throw new ClassCastException();
            throw new IOException();
        }

        System.out.println(2);
    }
}


// D:\javaprac\33_exception_handling>javac U2.java

// D:\javaprac\33_exception_handling>java U2
// 1
// Exception in thread "main" java.io.IOException
//         at U2.main(U2.java:12)