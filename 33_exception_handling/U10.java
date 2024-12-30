import java.io.IOException;
class U10
{
    public static void main(String[] args) throws Throwable {
        
        System.out.println(1);

        if(12 < 13)
        {

          throw new Throwable();
        }

        System.out.println(2);
    }
}

// D:\javaprac\33_exception_handling>javac U10.java

// D:\javaprac\33_exception_handling>java U10
// 1
// Exception in thread "main" java.lang.Throwable
//         at U10.main(U10.java:11)