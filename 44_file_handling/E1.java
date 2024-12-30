import java.io.File;

class E1 
{
    public static void main(String args[])
    {
        File file = new File("nobita");

        File absoluteFile = file.getAbsoluteFile();

        System.out.println(">>" +  absoluteFile + "<<");
    }
}


// D:\javaprac\44_file_handling>javac E1.java

// D:\javaprac\44_file_handling>java E1
// >>D:\javaprac\44_file_handling\nobita<<
