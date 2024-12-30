import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

class B 
{
    public static void main(String args[]) throws FileNotFoundException 
    {
        FileReader reader = new FileReader("Raju.txt"); // make suru file must be there at current loction with some text 

        try{
            System.out.println(reader.read());
            System.out.println(reader.read());
            System.out.println(reader.read());
            System.out.println(reader.read());
            System.out.println(reader.read());
            System.out.println(reader.read());

          
            reader.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}

// Note : hum ne Raju.txt file banai hai or hum ne usa ke ander kuch text likha hai or text likhne ke bad hum ne usa ko (save) kiya hai agr hum usa file(save) nhi karenge to hame kuch bhi result nhi milega isliye usa ko save krna padhega hame..


// D:\javaprac\46_file_reading>javac B.java

// D:\javaprac\46_file_reading>java B
// 109
// 121
// 32
// 110
// 97
// 109