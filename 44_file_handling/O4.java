 import java.io.File;
  
class O4 
{
    public static void main(String args[])
    {
        File file = new File("abc");

        System.out.println(file.isDirectory());

        String[] arr = file.list();

        for(String str : arr)
        {
            File f = new File(file,str);

            System.out.println(f + " : " + f.getAbsolutePath());
        }
    }
}

// D:\javaprac\44_file_handling>javac O4.java

// D:\javaprac\44_file_handling>java O4
// true
// abc\a : D:\javaprac\44_file_handling\abc\a
// abc\b : D:\javaprac\44_file_handling\abc\b
// abc\c : D:\javaprac\44_file_handling\abc\c
// abc\x.txt : D:\javaprac\44_file_handling\abc\x.txt
// abc\y.txt : D:\javaprac\44_file_handling\abc\y.txt
// abc\z.txt : D:\javaprac\44_file_handling\abc\z.txt
