import java.io.FileReader;
import java.io.FileNotFoundException;

class L5
{
    public static void main(String[] args)   {
        
        System.out.println("T");
        aaa();
        System.out.println("H");
    }

    static void aaa()   {
        System.out.println("S");
        bbb();
        System.out.println("J");
    }

    static void bbb()   {
        System.out.println("K");
        ccc();
        System.out.println("Q");
    }

    static void ccc()   {

      try
      {
        FileReader r = new FileReader("abc.txt");
      }catch(FileNotFoundException e){
        e.printStackTrace();
      }
        System.out.println("R");
    }
 }

//  T
// S
// K
// java.io.FileNotFoundException: abc.txt (The system cannot find the file specified)
//         at java.base/java.io.FileInputStream.open0(Native Method)
//         at java.base/java.io.FileInputStream.open(FileInputStream.java:216)
//         at java.base/java.io.FileInputStream.<init>(FileInputStream.java:157)
//         at java.base/java.io.FileInputStream.<init>(FileInputStream.java:111)
//         at java.base/java.io.FileReader.<init>(FileReader.java:60)
//         at L5.ccc(L5.java:29)
//         at L5.bbb(L5.java:21)
//         at L5.aaa(L5.java:15)
//         at L5.main(L5.java:9)
// R
// Q
// J
// H