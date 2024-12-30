import java.io.File;

class O2 
{
    public static void main(String args[])
    {
        File file = new File("abc");

        String[] arr = file.list();

        for(String str : arr)
        {
            File f = new File(file,str);

            System.out.println(str +" : (" + (f.isDirectory() ? "Folder)": "File)"));
        }
    }
}



// D:\javaprac\44_file_handling>javac O2.java

// D:\javaprac\44_file_handling>java O2
// a : (Folder)
// b : (Folder)
// c : (Folder)
// x.txt : (File)
// y.txt : (File)
// z.txt : (File)