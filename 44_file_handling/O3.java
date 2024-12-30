 import java.io.File;
  
class O3 
{
    public static void main(String args[])
    {
        File file = new File("abc");

        System.out.println(file.isDirectory());

        String[] arr = file.list();

        for(String str : arr)
        {
            File f = new File(str);

            System.out.println(f + " : " + f.getAbsolutePath());
        }
    }
}

// D:\javaprac\44_file_handling>javac O3.java

// D:\javaprac\44_file_handling>java O3
// true
// a : D:\javaprac\44_file_handling\a
// b : D:\javaprac\44_file_handling\b
// c : D:\javaprac\44_file_handling\c
// x.txt : D:\javaprac\44_file_handling\x.txt
// y.txt : D:\javaprac\44_file_handling\y.txt
// z.txt : D:\javaprac\44_file_handling\z.txt