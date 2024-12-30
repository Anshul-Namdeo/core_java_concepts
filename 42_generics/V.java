import java.util.ArrayList;

class V 
{
    public static void main(String args[])
    {
        ArrayList<Integer> x = new ArrayList <> ();

        x.add(12);
        x.add(15);
        x.add(18);

        pro(x);
    }

    static void pro(ArrayList <? extends Number> list)
    {
        for(Object next : list)
        {
            System.out.println(next);
        }

       // list.add(56);
      System.out.println(list.remove(0));
    }
}
        /*******  list.add() karne se ye error aaya hai *********/

        // Note : jb bhi (? extends) ka use karenge to usa ke bad kuch bhi add nhi kar sakte hai but remove kar sakte hai ..

// D:\javaprac\42_generics>javac V.java
// V.java:23: error: incompatible types: int cannot be converted to CAP#1
//         list.add(56);
//                  ^
//   where CAP#1 is a fresh type-variable:
//     CAP#1 extends Number from capture of ? extends Number
// Note: Some messages have been simplified; recompile with -Xdiags:verbose to get full output
// 1 error