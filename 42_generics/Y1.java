import java.util.ArrayList;

class Y1
{
    public static void main(String args[])
    {
            ArrayList x = pro();
    }
               /* return type */
    static ArrayList<? extends Number> pro()
    {
        return new ArrayList<String>();
    }
}


// D:\javaprac\42_generics>javac Y1.java
// Y1.java:12: error: incompatible types: ArrayList<String> cannot be converted to ArrayList<? extends Number>
//         return new ArrayList<String>();
//                ^
// 1 error

