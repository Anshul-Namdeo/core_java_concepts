import java.io.File;

class D1
{
    public static void main(String args[])
    {
        File file = new File ("Python");
        // hum ne Python folder wothout extention ke banaya hai pahle se bana ke rakhi hai(44_file_handling ke ander) to 
        // isFile() ->  return karegi
        // isDirectory() -> false return karegi

        System.out.println( " isFile() retrun -> " +file.isFile());
        System.out.println( " isDirectory() return -> " +file.isDirectory());
    }
}


// D:\javaprac\44_file_handling>javac D1.java

// D:\javaprac\44_file_handling>java D1
//  isFile() retrun -> false
//  isDirectory() return -> true