import java.io.File;

class C 
{
    public static void main(String args[])
    {
        File file = new File ("java.txt");
        // hum ne java.txt file pahle se bana ke rakhi hai(44_file_handling ke ander) to 
        // isFile() -> ture return karegi
        // isDirectory() -> false return karegi

        System.out.println( " isFile() retrun -> " +file.isFile());
        System.out.println( " isDirectory() return -> " +file.isDirectory());
    }
}


// D:\javaprac\44_file_handling>javac C.java

// D:\javaprac\44_file_handling>java C
//  isFile() retrun -> true
//  isDirectory() return -> false