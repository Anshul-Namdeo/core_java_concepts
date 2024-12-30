import java.util.ArrayList;

class Q 
{
    public static void main(String args[])
    {
        ArrayList <Integer> x = new ArrayList <> ();

        x.add(56);
        x.add(78);
        x.add(12);

        ArrayList <Double> y = new ArrayList <> ();

        y.add(5.6);
        y.add(3.6);
        y.add(11.6);

        ArrayList <Long> z = new ArrayList <> ();

        z.add(11L);
        z.add(4L);
        z.add(89L);

        pro(x);
        pro(y);
        pro(z);
    }

    static void pro(ArrayList <Object> list)
    {
        for(Integer next : list )
        {
            System.out.println(list);
        }
    }
}


// D:\javaprac\42_generics>javac Q.java
// Q.java:25: error: incompatible types: ArrayList<Integer> cannot be converted to ArrayList<Object>
//         pro(x);
//             ^
// Q.java:26: error: incompatible types: ArrayList<Double> cannot be converted to ArrayList<Object>
//         pro(y);
//             ^
// Q.java:27: error: incompatible types: ArrayList<Long> cannot be converted to ArrayList<Object>
//         pro(z);
//             ^
// Q.java:32: error: incompatible types: Object cannot be converted to Integer
//         for(Integer next : list )
//                            ^
// Note: Some messages have been simplified; recompile with -Xdiags:verbose to get full output
// 4 errors