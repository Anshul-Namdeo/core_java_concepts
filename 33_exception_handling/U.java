import java.io.IOException;
class U 
{
    public static void main(String[] args) throws Throwable {
        
        System.out.println(1);

        if(12 < 13)
        {
            throw new ArithmeticException();
        }

        System.out.println(2);
    }
}

// D:\javaprac\33_exception_handling>javac U.java

// D:\javaprac\33_exception_handling>java U
// 1
// Exception in thread "main" java.lang.ArithmeticException
//         at U.main(U.java:10)
