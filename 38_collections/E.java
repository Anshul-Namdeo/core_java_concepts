import java.util.LinkedList;

class E 
{
    public static void main(String args[])
    {
           /****LinkedList as a Stack *****/
           LinkedList x = new LinkedList();

           x.push(34);
           x.push(45);
           x.push(78);
           x.push(94);
           x.push(1);

           System.out.println(x);

           System.out.print(x.pop() + " ");
           System.out.print(x.pop() + " ");
           System.out.print(x.pop() + " ");
           System.out.print(x.pop() + " ");
           System.out.print(x.pop() + " ");

           System.out.println();
           System.out.print(x);
    }
}


// D:\javaprac\38_collections>javac E.java
// Note: E.java uses unchecked or unsafe operations.
// Note: Recompile with -Xlint:unchecked for details.

// D:\javaprac\38_collections>java E
// [1, 94, 78, 45, 34]
// 1 94 78 45 34
// []