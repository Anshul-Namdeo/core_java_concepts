import java.util.ArrayList;

class N 
{
    public static void main(String args[])
    {
        ArrayList x = new ArrayList();

        x.add("mohan");
        x.add(2.34);
        x.add(74);
        x.add(true);
        x.add('y');

        System.out.println(x);

        x.get(0).length();

        x.get(0).toString();
    }
}


// D:\javaprac\37_collections>javac N.java
// N.java:17: error: cannot find symbol
//         x.get(0).length();
//                 ^
//   symbol:   method length()
//   location: class Object
// Note: N.java uses unchecked or unsafe operations.
// Note: Recompile with -Xlint:unchecked for details.
// 1 error