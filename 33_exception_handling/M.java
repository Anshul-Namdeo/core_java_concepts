import java.io.FileReader;
import java.io.FileNotFoundException;

class M
{
    public static void main(String[] args)  {
        
        System.out.println("T");
        aaa();
        System.out.println("H");
    }

    static void aaa() {
        System.out.println("S");
        bbb();
        System.out.println("J");
    }

    static void bbb()  {
        System.out.println("K");
      try{
        ccc();
      }catch(FileNotFoundException e){
            e.printStackTrace();
      }
        System.out.println("Q");
    }

    static void ccc() throws FileNotFoundException  {

        FileReader r = new FileReader("abc.txt");
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
//         at M.ccc(M.java:31)
//         at M.bbb(M.java:22)
//         at M.aaa(M.java:15)
//         at M.main(M.java:9)
// Q
// J
// H



