import java.io.FileWriter;
import java.io.IOException;

class B 
{
    public static void main(String args[])
    {
        try
        {

            FileWriter fw = new FileWriter("ghtotkachhha.txt"); //FileWriter Constructor creates a file if one does not exists...
    

        }catch (IOException e) 
        {
            e.printStackTrace();
        }
    }
}

  // happily compile ..

  // Note : FileWriter ka constructor khud se file bana deta haia agr file phle se nhi bani hai to jaise ki isa example mai kiya gya hai...