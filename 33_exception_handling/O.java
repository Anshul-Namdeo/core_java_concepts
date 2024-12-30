import java.io.FileNotFoundException;
class O 
{
    public static void main(String[] args) {
        
        System.out.println(1);

        try{
            System.out.println(2);
        } catch(FileNotFoundException e)
        {
            e.printStackTrace();
        }

        System.out.println(3);
    }
}


// D:\javaprac\33_exception_handling>javac O.java
// O.java:10: error: exception FileNotFoundException is never thrown in body of corresponding try statement
//         } catch(FileNotFoundException e)
//           ^
// 1 error