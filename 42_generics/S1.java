import java.util.ArrayList ;

class S1 
{
    public static void main(String args[])
    {
        ArrayList <? extends Number > list = new ArrayList <String> ();
    }
}

// D:\javaprac\42_generics>javac S1.java
// S1.java:7: error: incompatible types: ArrayList<String> cannot be converted to ArrayList<? extends Number>
//         ArrayList <? extends Number > list = new ArrayList <String> ();
//                                              ^
// 1 error
