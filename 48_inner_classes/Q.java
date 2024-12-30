class XYZ
{
    private int u = 7;
}

class Q extends XYZ 
{
    public static void main(String args[])
    {
        Q q = new Q();
        System.out.println(q.u);
    }
} 

// D:\javaprac\48_inner_classes>javac Q.java
// Q.java:11: error: u has private access in XYZ
//         System.out.println(q.u);
//                             ^
// 1 error


// Note : parent class ke "(private member)" child ko inherit nhi hote hai.