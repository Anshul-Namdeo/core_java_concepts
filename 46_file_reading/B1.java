import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

class B1 
{
    public static void main(String args[]) throws FileNotFoundException 
    {
        FileReader reader = new FileReader("mayank.txt"); // make suru file must be there at current location with some text

        try{
            System.out.println((char)reader.read());
            System.out.println((char)reader.read());
            System.out.println((char)reader.read());
            System.out.println((char)reader.read());
            System.out.println((char)reader.read());
            System.out.println((char)reader.read());
            System.out.println((char)reader.read());
            System.out.println((char)reader.read());
            System.out.println((char)reader.read());
            System.out.println((char)reader.read());
            System.out.println((char)reader.read());
            System.out.println((char)reader.read());


                reader.close();
        }catch(IOException e)
        {
            e.printStackTrace();
        }
    }
}

// Note : hum ne mayank.txt file banai hai or hum ne usa ke ander kuch text likha hai or text likhne ke bad hum ne usa ko (save) kiya hai agr hum usa file ko (save) nhi karenge to hame kuch bhi result nhi milega isliye usa ko save krna padhega hame..

// Note : read() method ka return type int to wo int value return karta hai lekin hum ko ye cheak karna tha ki read() method jo bhi text likha hai usa ko properly read karti hai ya nhi to usa ke liye hum ne read() method ko (char) mai cast kr liya taki pata chal sake ki jo hum ne likha hai wahi read ho raha hai ki nhi.....

// D:\javaprac\46_file_reading>javac B1.java

// D:\javaprac\46_file_reading>java B1
// m
// y

// n
// a
// m
// e

// i
// s

// A