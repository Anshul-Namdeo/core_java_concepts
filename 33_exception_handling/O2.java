import java.io.FileReader;
import java.io.FileNotFoundException;
class O2
{
    public static void main(String[] args) {
        
        System.out.println(1);

        try{
            System.out.println(2);
           // FileReader r = new FileReader("abc.txt");
        }catch(FileNotFoundException e)
        {
            e.printStackTrace();
        }

        System.out.println(3);
    }
}


// D:\javaprac\33_exception_handling>javac O2.java
// O2.java:12: error: exception FileNotFoundException is never thrown in body of corresponding try statement
//         }catch(FileNotFoundException e)
//          ^
// 1 error
