class N implements Cloneable
{
    public static void main(String args[]) throws CloneNotSupportedException
    {
        Class k1 = N.class ;

        class K2 = (K2)k1.clone();
    }
}


// D:\javaprac\56_cloning>javac N.java
// N.java:7: error: '{' expected
//         class K2 = (K2)k1.clone();
//                 ^
// 1 error