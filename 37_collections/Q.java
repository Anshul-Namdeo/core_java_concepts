import java.util.ArrayList;

class Q 
{
    public static void main(String args[])
    {
        ArrayList<Integer> x = new ArrayList<Integer>();

        x.add(34);
        x.add(12);
        x.add(56);
        x.add(.234f);
        x.add(12);

        System.out.println(x);
    }
}


// D:\javaprac\37_collections>javac Q.java
// Q.java:12: error: incompatible types: float cannot be converted to Integer
//         x.add(.234f);
//               ^
// Note: Some messages have been simplified; recompile with -Xdiags:verbose to get full output
// 1 error