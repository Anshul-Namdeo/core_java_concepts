import java.io.File;

class H1 
{
    public static void main(String args[])
    {
        File file = new File ("C:\\Windows\\System32\\raju");

        boolean flag = file.mkdir();

        System.out.println(flag);
    }
}



// D:\javaprac\44_file_handling>javac H1.java

// D:\javaprac\44_file_handling>java H1
// false