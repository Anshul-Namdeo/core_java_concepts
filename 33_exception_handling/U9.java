import java.io.IOException;
class U9
{
    public static void main(String[] args) throws Throwable {
        
        System.out.println(1);

        if(12 < 13)
        {

          throw new Object();
        }

        System.out.println(2);
    }
}


// D:\javaprac\33_exception_handling>javac U9.java
// U9.java:11: error: incompatible types: Object cannot be converted to Throwable
//           throw new Object();
//           ^
// 1 error