import java.io.File;

class O1 
{
    public static void main(String args[])
    {
        File file = new File("abc");

        String[] arr = file.list();

        for(String str : arr)
        {
            File f = new File(str);

            System.out.println(str +" : (" + (f.isDirectory() ? "Folder)": "File)"));
        }
    }
}

// D:\javaprac\44_file_handling>javac O1.java

// D:\javaprac\44_file_handling>java O1
// a : (File)
// b : (File)
// c : (File)
// x.txt : (File)
// y.txt : (File)
// z.txt : (File)