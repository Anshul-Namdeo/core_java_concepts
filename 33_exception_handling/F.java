import java.io.FileReader;
import java.io.FileNotFoundException;

class F 
{

    F() {
       
        try
        {
            FileReader r = new FileReader("abc.txt");
        }catch(FileNotFoundException e)
        {
            e.printStackTrace();
        }
    }
     public static void main(String[] args) {
        
        System.out.println("A");
        F x = new F();
        System.out.println("B");
     }
   
}


  /* ------ there are two outputs ------- */

  /* 1st ex. ye bata raha hai ki file exict nhi krta hai  */

//   D:\javaprac\33_exception_handling>javac F.java

// D:\javaprac\33_exception_handling>java F
// A
// java.io.FileNotFoundException: abc.txt (The system cannot find the file specified)
//         at java.base/java.io.FileInputStream.open0(Native Method)
//         at java.base/java.io.FileInputStream.open(FileInputStream.java:216)
//         at java.base/java.io.FileInputStream.<init>(FileInputStream.java:157)
//         at java.base/java.io.FileInputStream.<init>(FileInputStream.java:111)
//         at java.base/java.io.FileReader.<init>(FileReader.java:60)
//         at F.<init>(F.java:11)
//         at F.main(F.java:20)
// B


/* ------2nd ex. jb file exict krta hai  */

// D:\javaprac\33_exception_handling>java F
// A
// B
