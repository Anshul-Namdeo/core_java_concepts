@FunctionalInterface 
interface X4 
{
    void pro();
}

class F 
{
    public static void main(String args[])
    {
        X4 x = new X4();

        x.pro();
    }
}

// D:\javaprac\60_fuctional_interface>javac F.java
// F.java:11: error: X4 is abstract; cannot be instantiated
//         X4 x = new X4();
//                ^
// 1 error
