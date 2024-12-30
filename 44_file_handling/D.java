import java.io.File;

class D 
{
    public static void main(String args[])
    {
        File file = new File ("Python");
        // hum ne Python file wothout extention ke banai hai pahle se bana ke rakhi hai(44_file_handling ke ander) to 
        // isFile() ->  return karegi
        // isDirectory() -> false return karegi

        System.out.println( " isFile() retrun -> " +file.isFile());
        System.out.println( " isDirectory() return -> " +file.isDirectory());
    }
}

// D:\javaprac\44_file_handling>javac D.java

// D:\javaprac\44_file_handling>java D
//  isFile() retrun -> false
//  isDirectory() return -> false

// flase isliye aa raha kyoki hum ne file ko extension ke sath nhi likha hai isliye error aa raha hai...
