import java.io.File;

class P1 
{
    public static void main(String args[])
    {
        File file = new File("abc");

        System.out.println(file.exists());
        System.out.println(file.delete());
    }
}


// D:\javaprac\44_file_handling>javac P1.java

// D:\javaprac\44_file_handling>java P1
// true
// true


// Note : hum ne ab ek empty abc folder banaya tha wo delete ho gya.....