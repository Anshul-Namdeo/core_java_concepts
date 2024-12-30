interface ZZ 
{
    void pro() ;
}

class N 
{
    public static void main(String args[])
    {
        ZZ z = new ZZ();
    }
}

// D:\javaprac\49_inner_classes>javac N.java
// N.java:10: error: ZZ is abstract; cannot be instantiated
//         ZZ z = new ZZ();
//                ^
// 1 error

// Note : hum interface ka object nhi bana sakte hai . (mtlb) hai ki hum use instantiated nhi kar sakte hai ,, 

// Note : interface ka hum keval object bana sakte hai ...