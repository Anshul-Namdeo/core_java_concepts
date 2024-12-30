import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

class D 
{
    public static void main(String args[]) throws FileNotFoundException 
    {
        FileReader reader = new FileReader("chhotabheem.txt"); // make sure file must be there at current location with some text..

        try{
            int count = 0;
            char[] arr = new char[25];
            while((count = reader.read(arr)) != -1)
            {
                for( char ch : arr)
                {
                    System.out.print(ch);
                }
            }
            reader.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}


// D:\javaprac\46_file_reading>javac D.java

// D:\javaprac\46_file_reading>java D
// public class InputStreamReader
// extends Reader
// An InputStreamReader is a bridge from byte streams to character streams: It reads bytes and decodes them into characters using a specified charset. The charset that it uses may be specified by name or may be given explicitly, or the platform's default charset may be accepted.
// Each invocation of one of an InputStreamReader's read() methods may cause one or more bytes to be read from the underlying byte-input stream. To enable the efficient conversion of bytes to characters, more bytes may be read ahead from the underlying stream than are necessary to satisfy the current read operation.