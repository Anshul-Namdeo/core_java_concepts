import java.io.File;

class H 
{
    public static void main(String args[])
    {
        File file = new File("ganesh");

        System.out.println(file.exists());

        boolean flag = file.mkdir();

        System.out.println(flag);
    }
}

// run twice


// D:\javaprac\44_file_handling>javac H.java

// D:\javaprac\44_file_handling>java H
// false
// true

// D:\javaprac\44_file_handling>java H
// true
// false



// isa examples mai jub hum ne H.java ko phli war run kiya to file exits nhi kr rahi thi or mkdir() method ka use kr ke hum ne ek genesh nam ka folder bana liya. 
// ab jb hum ne H.java ko dubara run kiya to ganesh nam ki file exits() kar rahi thi to usa ne true retrun kar diya or  ek war jab ganesh nam ka folder ban gaya tha to usa ne dubara se usa ko nhi banaya //////