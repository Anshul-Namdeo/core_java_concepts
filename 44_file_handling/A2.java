import java.io.File;

class A2
{
    public static void main(String args[])
    {
        File file = new File("null");
        // non-existing , relative floder path

        System.out.println(file);
        System.out.println(file.exists());
    }
}


// D:\javaprac\44_file_handling>javac A2.java

// D:\javaprac\44_file_handling>java A2
// null
// false