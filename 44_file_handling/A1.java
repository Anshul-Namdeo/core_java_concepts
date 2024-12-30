import java.io.File;

class A1
{
    public static void main(String args[])
    {
        File file = new File("java_examples");
        // non-existing , relative floder path

        System.out.println(file);
        System.out.println(file.exists());
    }
}


// D:\javaprac\44_file_handling>javac A1.java

// D:\javaprac\44_file_handling>java A1
// java_examples
// false
