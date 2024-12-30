import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;

class E 
{
    public static void main(String args[]) throws IOException
    {
        FileReader reader = new FileReader("yamraj.txt"); 
        BufferedReader bfr = new BufferedReader(reader);

            try{
                System.out.print(bfr.readLine());
                System.out.print(bfr.readLine());
                System.out.print(bfr.readLine());
                System.out.print(bfr.readLine());
                System.out.print(bfr.readLine());
                System.out.print(bfr.readLine());

                bfr.close();
            }catch(IOException e){
                e.printStackTrace();
        }
    }
}

// D:\javaprac\46_file_reading>javac E.java

// D:\javaprac\46_file_reading>java E
// public class InputStreamReaderextends ReaderAn InputStreamReader is a bridge from byte streams to character streams: It reads bytes and decodes them into characters using a specified charset. The charset that it uses may be specified by name or may be given explicitly, or the platform's default charset may be accepted.Each invocation of one of an InputStreamReader's read() methods may cause one or more bytes to be read from the underlying byte-input stream. To enable the efficient conversion of bytes to characters, more bytes may be read ahead from the underlying stream than are necessary to satisfy the current read operation.For top efficiency, consider wrapping an InputStreamReader within a BufferedReader. For example: