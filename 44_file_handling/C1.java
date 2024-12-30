import java.io.File;

class C1 
{
    public static void main(String args[])
    {
        File file = new File ("java.txt");
        // hum ne java.txt folder pahle se bana ke rakha hai(44_file_handling ke ander) to 
        // isFile() -> false return karegi
        // isDirectory() -> true return karegi

        System.out.println( " isFile() retrun -> " +file.isFile());
        System.out.println( " isDirectory() return -> " +file.isDirectory());
    }
}


// D:\javaprac\44_file_handling>javac C1.java

// D:\javaprac\44_file_handling>java C1
//  isFile() retrun -> false
//  isDirectory() return -> true
