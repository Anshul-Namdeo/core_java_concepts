class C /*extends Object */
{
    public static void main(String args[])
    {
        C x = new C();

        C y  = x.clone();
    }
}


// D:\javaprac\56_cloning>javac C.java
// C.java:7: error: incompatible types: Object cannot be converted to C
//         C y  = x.clone();
//                       ^
// 1 error