import java.io.File;

class P 
{
    public static void main(String args[])
    {
        File file = new File("abc");

        System.out.println(file.exists());
        System.out.println(file.delete());
    }
}


// D:\javaprac\44_file_handling>javac P.java

// D:\javaprac\44_file_handling>java P
// true
// false

// Note : hum ne abc nam ka folder khud se banaya hai or usa abc folder ke andar kuch other folder or text files rakhi hai isliye hum avc folder ko delete nhi kar pa rahe hai hum ko delete tabhi kar payenge jb wo abc folder empty ko usa andar koi bhi file ya folder wagera na ho..