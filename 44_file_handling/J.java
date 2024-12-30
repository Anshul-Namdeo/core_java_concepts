import java.io.File;

class J
{
    public static void main(String args[])
    {
        File  file = new File ("om/ram/raju");

        // floder om doed not exits 

        System.out.println(file.exists());

        System.out.println(file.mkdirs());
        // Note : yaha par mkdirs() method ka use kiya hai isliye multiple Floders ek sath ban gaye
    }
}



// D:\javaprac\44_file_handling>javac J.java

// D:\javaprac\44_file_handling>java J
// false
// true