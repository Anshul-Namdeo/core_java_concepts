import java.util.List;
import java.util.ArrayList;

class Z 
{
    public static void main(String args[])
    {
        List<Integer> x = new ArrayList<Integer>();

// Note : List ek interface hai or usa ki childclass ArrayList hai to hum List variavle x ko  ArrayList ke variable y mai holder nhi kr payenge  kyo ArrayList child type hai or List parent type hai

        ArrayList<Integer> y = x;
    }
}

// D:\javaprac\42_generics>javac Z.java
// Z.java:12: error: incompatible types: List<Integer> cannot be converted to ArrayList<Integer>
//         ArrayList<Integer> y = x;
//                                ^
// 1 error