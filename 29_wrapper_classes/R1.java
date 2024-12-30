class R1
{
    public static void main(String args[])
    {
        System.out.println(pro());
    }

    static Byte pro()
    {
        return 130;
    }
}


// D:\javaprac\29_wrapper_classes>javac R1.java
// R1.java:10: error: incompatible types: int cannot be converted to Byte
//         return 130;
//                ^
// 1 error
