import java.io.File;

class I 
{
    public static void main(String args[])
    {
        File  file = new File ("om/ram/raju");

        // floder om doed not exits 

        System.out.println(file.exists());

        System.out.println(file.mkdir());
    }
}

// D:\javaprac\44_file_handling>javac I.java

// D:\javaprac\44_file_handling>java I
// false
// false
