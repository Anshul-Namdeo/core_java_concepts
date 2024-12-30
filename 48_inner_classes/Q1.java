class XYZ 
{
    private int u = 7;
}

class Q1 extends XYZ 
{
    public static void main(String args[])
    {
        // Q1 q = new Q1();

        XYZ q = new XYZ();
        System.out.println(q.u);
    }
}

// D:\javaprac\48_inner_classes>javac Q1.java
// Q1.java:13: error: u has private access in XYZ
//         System.out.println(q.u);
//                             ^
// 1 error