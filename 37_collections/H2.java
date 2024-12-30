import java.util.ArrayList ;

class H2 
{
    public static void main(String args[])
    {
        ArrayList x = new ArrayList();

        x.add(2.34);
        x.add(8.45);
        x.add(7.21);
        x.add(9.01);

        System.out.println(x);

        System.out.println(x.set(2,5.55));

        System.out.println(x);
    }
}

// D:\javaprac\37_collections>javac H2.java
// Note: H2.java uses unchecked or unsafe operations.
// Note: Recompile with -Xlint:unchecked for details.

// D:\javaprac\37_collections>java H2
// [2.34, 8.45, 7.21, 9.01]
// 7.21
// [2.34, 8.45, 5.55, 9.01]