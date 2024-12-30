import java.io.File;

class A 
{
    public static void main(String args[])
    {
        File file = new File("java.txt");
        // non-existing file, relative file path

        System.out.println(file);
        System.out.println(file.exists());
    }
}


// D:\javaprac\44_file_handling>javac A.java

// D:\javaprac\44_file_handling>java A
// java.txt
// false