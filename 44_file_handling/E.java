import java.io.File;

class E 
{
    public static void main(String args[])
    {
        File file = new File("nobita");

        String absolutepath = file.getAbsolutePath();

        System.out.println(">>" +  absolutepath + "<<");
    }
}

// D:\javaprac\44_file_handling>javac E.java

// D:\javaprac\44_file_handling>java E
// >>D:\javaprac\44_file_handling\nobita<<
