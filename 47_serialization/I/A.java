import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

class A 
{
    public static void main(String args[]) throws IOException 
    {
        Student st = new Student("om",9,new NewAddress("jaipur","rajasthan"));

        new ObjectOutputStream(new FileOutputStream("vijay.txt")).writeObject(st);
    }

}