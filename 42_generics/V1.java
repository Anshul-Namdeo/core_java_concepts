import java.util.ArrayList ;

class V1 
{
    public static void main(String args[])
    {
        ArrayList <Integer> x = new ArrayList <> ();

        x.add(12);
        x.add(15);
        x.add(18);

        pro(x);
    }

    static void pro(ArrayList <? extends Number> list)
    {
        for (Integer next : list)
        {
            System.out.println(next);
        }
    }
}


// D:\javaprac\42_generics>javac V1.java
// V1.java:18: error: incompatible types: CAP#1 cannot be converted to Integer
//         for (Integer next : list)
//                             ^
//   where CAP#1 is a fresh type-variable:
//     CAP#1 extends Number from capture of ? extends Number
// 1 error