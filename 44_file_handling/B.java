import java.io.File;

class B 
{
    public static void main(String args[])
    {
        File file = new File("D:\\javaprac\\44_file_handling\\java_exampsles");
        //non-existing , absolute Folder path

        System.out.println(">>>>" + file + "<<<<");
        System.out.println(file.exists());
    }
}


// D:\javaprac\44_file_handling>javac B.java

// D:\javaprac\44_file_handling>java B
// >>>>D:\javaprac\44_file_handling\java_exampsles<<<<
// false
