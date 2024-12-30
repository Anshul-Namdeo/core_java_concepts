class R2
{
    public static void main(String args[])
    {
        System.out.println(pro());
    }

    static Byte pro()
    {
        int t = 56;

        // byte s = 7;
        return t;
    }
}


// D:\javaprac\29_wrapper_classes>javac R2.java
// R2.java:13: error: incompatible types: int cannot be converted to Byte
//         return t;
//                ^
// 1 error