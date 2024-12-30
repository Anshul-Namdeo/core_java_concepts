import java.io.File;

class O 
{
    public static void main(String args[])
    {
        File file = new File("abc");
        System.out.println(file.isDirectory());

        String[] arr = file.list();

        for(String str : arr)
        {
            System.out.println(str);
        }


    }
}


// D:\javaprac\44_file_handling>javac O.java

// D:\javaprac\44_file_handling>java O
// true
// a
// b
// c
// x.txt
// y.txt
// z.txt
