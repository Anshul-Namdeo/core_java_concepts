import java.util.LinkedList;

class B 
{
    public static void main(String args[])
    {
        /****LinkedList as a List *****/
        LinkedList x = new LinkedList();

        x.add(34);
        x.add(56);
        x.add(78);
        x.add(12);
        x.add(8);

        System.out.println(x);

        System.out.println(x.get(0));
        System.out.println(x.get(1));
        System.out.println(x.get(2));
        System.out.println(x.get(3));
        System.out.println(x.get(4));

        System.out.println(x);
    }
}


// D:\javaprac\38_collections>javac B.java
// Note: B.java uses unchecked or unsafe operations.
// Note: Recompile with -Xlint:unchecked for details.

// D:\javaprac\38_collections>java B
// [34, 56, 78, 12, 8]
// 34
// 56
// 78
// 12
// 8
// [34, 56, 78, 12, 8]