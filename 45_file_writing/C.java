import java.io.FileWriter;
import java.io.IOException;

class C 
{
    public static void main(String args[])
    {

        try{

            FileWriter fw = new FileWriter("Khushi.txt"); // FileWriter Constructor creates a file if one does not exists...

            fw.write('A');
            fw.write('B');
            fw.write('C');

            fw.flush();

            fw.write(97);
            fw.write(98);
            fw.write(99);

            fw.flush();

            fw.close();


        }catch(IOException e)
        {
            e.printStackTrace();
        }
    }
}

// happily compile and run...

// Note : jb tak hum Flush () method ko FileWriter constructor ke varivle ke upr call nhi karenge to hame khuch bhi show nhi hoga yaha par Flush () method as save karne ki tarah wark karti hai jaise hum kisis bhi chhez ko save kr dete hai waise hi ye flush() method hum ne jo bhi likha hai usa ko save kar deti hai or jb vhi hum flush() method ka use karte hai to hum ko usa ke sath close() method ka bhi use karn padhta hai .. or close() method call karne se flush() method automatically call ho jati hai....
