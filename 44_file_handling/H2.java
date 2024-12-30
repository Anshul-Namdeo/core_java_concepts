import java.io.File;

class H2 
{
    public static void main(String args[])
    {
        File file = new File ("D:\\javaprac\\44_file_handling\\PRATHAM");

        boolean flag = file.mkdir();

        System.out.println(flag);
    }
}


// D:\javaprac\44_file_handling>javac H2.java

// D:\javaprac\44_file_handling>java H2
// true
