import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

class B2 
{
    public static void main(String args[]) throws FileNotFoundException
    {
        FileReader reader = new FileReader("khushi.txt"); // make sure file must be there at current location with some text..

        try{
            System.out.print((char)reader.read());
            System.out.print((char)reader.read());
            System.out.print((char)reader.read());
            System.out.print((char)reader.read());
            System.out.print((char)reader.read());
            System.out.print((char)reader.read());
            System.out.print((char)reader.read());
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}

// Note : hum ne khushi.txt file banai hai or hum ne usa ke ander kuch text likha hai or text likhne ke bad hum ne usa ko (save) kiya hai agr hum usa file ko (save) nhi karenge to hame kuch bhi result nhi milega isliye usa ko save krna padhega hame..


// D:\javaprac\46_file_reading>javac B2.java

// D:\javaprac\46_file_reading>java B2
// your na